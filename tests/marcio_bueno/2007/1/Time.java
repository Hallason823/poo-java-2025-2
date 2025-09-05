public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Hora() {
        setHours(24);
        minutes = 0;
        seconds = 0;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 24) {
            this.hours = hours;
        }
        else {
            System.out.println("Invalid input for hours");
        }
    }

    public void setMinutes(int minutes) {
        if((hours < 24 && minutes >= 0 && minutes < 60) || (hours == 24 && minutes == 0)){
            this.minutes = minutes;
        }
        else {
            System.out.println("Invalid input for minutes");
        }
    }

    public void setSeconds(int seconds) {
        if((hours < 24 && seconds >= 0 && seconds < 60) || (hours == 24 && seconds == 0)) {
            this.seconds = seconds;
        }
        else {
            System.out.println("Invalid input for seconds");
        }
    }





}