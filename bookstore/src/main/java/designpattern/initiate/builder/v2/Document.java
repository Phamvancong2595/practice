package designpattern.builder.v2;

import java.time.LocalDateTime;
public class Document {
    private final String title;
    private final String author;
    private final String category;
    private final String content;
    private final LocalDateTime releaseAt;

    public Document(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.category = builder.category;
        this.content = builder.contentBuilder.toString();
        this.releaseAt = builder.releaseAt;
    }
    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String title;
        private String author;
        private String category;
        private LocalDateTime releaseAt;
        private final StringBuilder contentBuilder = new StringBuilder();
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder author(String author) {
            this.author = author;
            return this;
        }
        public Builder category(String category) {
            this.category = category;
            return this;
        }
        public Builder releaseAt(LocalDateTime localDateTime) {
            this.releaseAt = localDateTime;
            return this;
        }
        public Builder addToContent(String contentPart) {
            if (contentBuilder.length() > 0) {
                contentBuilder.append(' ');
            }
            contentBuilder.append(contentPart);
            return this;
        }
        public Document build() {
            return new Document(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", category='" + category + '\'' +
                    ", releaseAt=" + releaseAt +
                    ", contentBuilder=" + contentBuilder +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                ", releaseAt=" + releaseAt +
                '}';
    }

    public static void main(String[] args) {
        final Document document = Document
                .builder()
                .title("How an economic grow and and why it crash")
                .author("Peter Schiff")
                .category("Economic")
                .addToContent("Alo")
                .addToContent("Chao con vo")
                .releaseAt(LocalDateTime.now())
                .build();
        System.out.println(document);
    }
}
