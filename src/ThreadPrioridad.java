public class ThreadPrioridad implements Runnable{
    private int threadNum;
    public ThreadPrioridad(int threadNum) {
        this.threadNum = threadNum;
    }

    public void run() {
        System.out.println("Hola, soy el hilo numero "+ threadNum);
    }
}
