public class ThreadJoin implements Runnable{
    private int threadNum;
    public ThreadJoin(int threadNum) {
        this.threadNum = threadNum;
    }

    public void run() {

        if (threadNum < 2) {
            ThreadJoin tj = new ThreadJoin(threadNum+1);
            Thread threadj = new Thread(tj);
            threadj.start();
            try {
                threadj.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Hola, soy el hilo numero "+ threadNum);


    }
}
