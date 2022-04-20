package test;

public class Calculations extends Main{
    private double breakInMinutes;
    private double tvSeriesTime;

    double lunchTime = breakInMinutes / 8.0;
    double relaxTime = breakInMinutes / 4.0;

    public static double breakTimeLeft(double lunchTime, double relaxTime) {
        breakInMinutes - (lunchTime + relaxTime);
    }

    public double MinutesLeft(double minutesLeft){
        Math.ceil(Math.abs(breakTimeLeft - tvSeriesTime));
        return minutesLeft;
    }

    public double getBreakInMinutes() {
        return breakInMinutes;
    }

    public void setBreakInMinutes(double breakInMinutes) {
        this.breakInMinutes = breakInMinutes;
    }

    public double getTvSeriesTime() {
        return tvSeriesTime;
    }

    public void setTvSeriesTime(double tvSeriesTime) {
        this.tvSeriesTime = tvSeriesTime;
    }

    public double getLunchTime() {
        return lunchTime;
    }

    public void setLunchTime(double lunchTime) {
        this.lunchTime = lunchTime;
    }

    public double getRelaxTime() {
        return relaxTime;
    }

    public void setRelaxTime(double relaxTime) {
        this.relaxTime = relaxTime;
    }

    public Calculations(double breakInMinutes, double tvSeriesTime, double lunchTime, double relaxTime) {
        this.breakInMinutes = breakInMinutes;
        this.tvSeriesTime = tvSeriesTime;
        this.lunchTime = lunchTime;
        this.relaxTime = relaxTime;
    }

    @Override
    public String toString(String tvSeriesName, double minutesLeft) {
        if ( breakTimeLeft >= tvSeriesTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvSeriesName, minutesLeft);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvSeriesName, minutesLeft);
        }

    }
}
