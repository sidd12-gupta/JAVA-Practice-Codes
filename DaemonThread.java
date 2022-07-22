public class DaemonThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread work!");
        } else {
            System.out.println("user thread work!");
        }
    }

    public static void main(String args[]) {
        DaemonThread d1 = new DaemonThread();
        DaemonThread d2 = new DaemonThread();
        DaemonThread d3 = new DaemonThread();
        d1.setDaemon(true);

        d1.start();
        d2.start();
        d3.start();

    }
}
