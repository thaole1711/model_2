package ss18_thread.thuc_hanh.ung_dung_dem_so;

public class Main {
    public static void main(String[] args) {
        Count count =new Count();
        try {
            while (count.getMyThread().isAlive()){
                System.out.println("main thread will be alive till the child thread is live");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread run is over");
    }
}
