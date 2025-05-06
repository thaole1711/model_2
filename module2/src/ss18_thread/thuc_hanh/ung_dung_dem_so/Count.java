package ss18_thread.thuc_hanh.ung_dung_dem_so;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my runnable created" + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count" + i);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("my thread run is over");
    }
}
