package Lab_7.Task5;

public class Task5 {
    static class Clock {
        private int hours;
        private int minutes;
        private int seconds;

        public void setTime(int h, int m, int s) {
            if (h >= 0 && h < 24) hours = h;
            if (m >= 0 && m < 60) minutes = m;
            if (s >= 0 && s < 60) seconds = s;
        }

        public void tick() {
            seconds++;
            if (seconds >= 60) {
                seconds = 0;
                minutes++;
                if (minutes >= 60) {
                    minutes = 0;
                    hours = (hours + 1) % 24;
                }
            }
        }

        public void displayTime() {
            System.out.printf("Час: %02d:%02d:%02d\n", hours, minutes, seconds);
        }
    }

    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime(23, 59, 58);
        c.displayTime();
        c.tick();
        c.displayTime();
        c.tick();
        c.displayTime();
    }
}

