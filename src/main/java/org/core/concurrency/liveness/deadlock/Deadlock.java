package main.java.org.core.concurrency.liveness.deadlock;

public class Deadlock {
    static class Friend {
        private String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                            + "  has bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }

        public static void main(String[] args) {
            final Friend congpv =
                    new Friend("CongPV");
            final Friend binght =
                    new Friend("BinhHT");
            new Thread(() -> congpv.bow(binght)).start();
            new Thread(() -> binght.bow(congpv)).start();
        }
    }
}
