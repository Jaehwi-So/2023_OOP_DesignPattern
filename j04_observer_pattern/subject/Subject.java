package j04_observer_pattern.subject;

import j04_observer_pattern.observer.Observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
