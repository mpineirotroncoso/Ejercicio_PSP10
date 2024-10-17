public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // con setPriority
        ThreadPrioridad tp = new ThreadPrioridad(1);
        Thread thread = new Thread(tp);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

        ThreadPrioridad tp2 = new ThreadPrioridad(2);
        Thread thread2 = new Thread(tp2);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();

        System.out.println("Pulsa enter para ejecutarlo con join...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // con join
        ThreadJoin tj = new ThreadJoin(1);
        Thread threadj = new Thread(tj);
        threadj.start();
    }
}