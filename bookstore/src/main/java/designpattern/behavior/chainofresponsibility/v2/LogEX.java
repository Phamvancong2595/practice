package designpattern.behavior.chainofresponsibility.v2;

import lombok.AllArgsConstructor;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LogEX {
    @AllArgsConstructor
    public abstract static class LogAppender {
        private final LogLevel minLogLevel;

        public void append(LogLevel level, String message) {
            if (level.compareTo(minLogLevel) >= 0) {
                try {
                    doAppend(message);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }

        protected abstract void doAppend(String message) throws Exception;

        public static class LogConsoleAppender extends LogAppender {
            public LogConsoleAppender(LogLevel minLogLevel) {
                super(minLogLevel);
            }

            @Override
            protected void doAppend(String message) throws Exception {
                System.out.println(message);
            }
        }

        public static class LogFileAppender extends LogAppender {
            public LogFileAppender(LogLevel minLogLevel) {
                super(minLogLevel);
            }

            @Override
            protected void doAppend(String message) throws Exception {
                final Path path = Paths.get("application.log");

                Files.createFile(path);
                Files.write(
                        path,
                        Collections.singleton(message),
                        StandardOpenOption.APPEND);
            }
        }

        public static class Logger {
            private final List<LogAppender> appenderList;

            public Logger(LogAppender... appenderList) {
                this.appenderList = Arrays.asList(appenderList);
            }

            public void info(String message) {
                log(LogLevel.LEVEL_INFO, message);
            }

            public void error(String message) {
                log(LogLevel.LEVEL_ERROR, message);
            }

            public void log(LogLevel level, String message) {
                appenderList.forEach(
                        appender -> appender.append(level, message)
                );
            }
        }
    }

    public static void main(String[] args) {
        final LogAppender.Logger logger = new LogAppender.Logger(
                new LogAppender.LogConsoleAppender(LogLevel.LEVEL_INFO),
                new LogAppender.LogFileAppender(LogLevel.LEVEL_ERROR)
        );
        logger.info("Hello World");
        logger.info("Foo Bar");
    }
}
