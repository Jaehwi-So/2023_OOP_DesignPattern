package j04_observer_pattern;

import j04_observer_pattern.subject.PollutionSubject;

public class AirPollutionPublisher implements Runnable {
    private int pollution = 50;
    private boolean stop = false;
    private int sleepDuration;

    private PollutionSubject pollutionSubject;

    public AirPollutionPublisher(int duration, PollutionSubject pollutionSubject) {
        sleepDuration = duration;
        this.pollutionSubject = pollutionSubject;   //Subject를 등록한다.
    }

    @Override
    public void run() {
        while (!stop) {
            int plusMinus = RandIntInRange.nextInt(0, 1);
            int pollutionDiff = RandIntInRange.nextInt(1, 10);
            if (plusMinus == 1) {
                pollution += pollutionDiff;
            }
            else {
                pollution -= pollutionDiff;
                if (pollution < 0) {
                    pollution = 0;
                }
            }

            System.out.printf("Server: pollution = %d\n", pollution);

            //Subject가 대상 Observer들에게 변경하도록 notifyObservers()를 호출한다.
            pollutionSubject.setPollution(pollution);
            pollutionSubject.notifyObservers();

            try {
                Thread.sleep(sleepDuration);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() { stop = true; }
}