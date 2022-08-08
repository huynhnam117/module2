package ss4.BuildStopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int a = 1;
        for (int i = 0; i < 100000; i++) {
            if (a < 99999) {
                a = i;
            }
        }
        stopWatch.stop();
        System.out.println("Start time(s): " + stopWatch.getStartTime());
        System.out.println("End time(s): " + stopWatch.getEndTime());
        System.out.println("Distance:" + stopWatch.getElapsedTime());

    }
}

