package ss4_class_object.bai_tap.bai_2_stopWatch;

public class StopWatchMain {
    public static void main(String[] args) {
        int so = 2000000000;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Sum(so);
        stopWatch.stop();
        System.out.println("thời gian chạy là:" + stopWatch.getElapsedTime());


    }

    public static void Sum(int so) {
        for (int i = 0; i < so - 1; i++) {
            for (int j = 0; j < so; j++) {
                for (int k = 0; k <so ; k++) {
                    so += k;
                }
                so += j;
            }
            so+=so;
            so+=so;
            so+=so;
        }

    }


}
