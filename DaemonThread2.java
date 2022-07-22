public class DaemonThread2 extends Thread {
    public void run() {
        System.out.println("Name: " + Thread.currentThread().getName());
        System.out.println("Daemon: " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DaemonThread2 d1 = new DaemonThread2();
        DaemonThread2 d2 = new DaemonThread2();
        d1.start();
        d1.setDaemon(true);
        d2.start();
    }
}
