package j04_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class PollutionSubject implements Subject {
    private int pollution;

    private List<Observer> observers;

    public PollutionSubject() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }


    public void notifyObservers() {
        for (Observer o : observers) {
            o.updatePollution(pollution);
        }
    }


    public void setPollution(int n) {
        this.pollution = n;
    }


}
