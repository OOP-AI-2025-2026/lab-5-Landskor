package ua.opnu;

public class TimeSpan {
    private int hours;
    private int minutes;
    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }
    public TimeSpan(int minutes) {
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }
    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        normalize();
    }
    public TimeSpan(TimeSpan other) {
        this.hours = other.hours;
        this.minutes = other.minutes;
    }
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    private void normalize() {
        hours += minutes / 60;
        minutes = minutes % 60;
    }
    public void add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;
        normalize();
    }
    public void add(int minutes) {
        this.minutes += minutes;
        normalize();
    }
    public void add(TimeSpan other) {
        this.hours += other.hours;
        this.minutes += other.minutes;
        normalize();
    }
    public void subtract(int hours, int minutes) {
        this.hours -= hours;
        this.minutes -= minutes;
        if (this.minutes < 0) {
            this.hours -= 1;
            this.minutes += 60;
        }
        if (this.hours < 0) {
            this.hours = 0;
            this.minutes = 0;
        }
    }
    public void subtract(int minutes) {
        subtract(0, minutes);
    }
    public void subtract(TimeSpan other) {
        subtract(other.hours, other.minutes);
    }
    @Override
    public String toString() {
        return hours + " год " + minutes + " хв";
    }
}