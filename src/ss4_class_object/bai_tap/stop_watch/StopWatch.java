package ss4.stop_watch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
    }

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public void start(){
       this.startTime=new Date();
    }
    public void stop(){
        this.endTime=new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime()-startTime.getTime();
    }
}
