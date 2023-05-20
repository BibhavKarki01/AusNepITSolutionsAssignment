package ausnepassignment.assignment4;

import java.util.Timer;
import java.util.TimerTask;

public class DisplayMessage {
    public static void main (String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run () {
                try {
                    System.out.println("Hello Sir/Ma'am. I hope I will hear positive response from you.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        try {
            timer.scheduleAtFixedRate(timerTask, 0, 120000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
