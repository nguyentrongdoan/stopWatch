public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
    }
    public void setStartTime(){
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}
