package j04_observer_pattern;

public class AirPollutionSubscriber implements Observer {
    private int num;

    public AirPollutionSubscriber(int num) {
        this.num = num;
    }


    @Override
    public void updatePollution(int n) {
        System.out.println("Client pollution Receive " + n);
        this.num = n;
    }
}