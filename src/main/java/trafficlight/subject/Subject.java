package trafficlight.subject;

import trafficlight.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer o){
        this.observers.add(o);
    }
    public void removeObserver(Observer o){
        this.observers.remove(o);
    }
    public void notifyObservers(Subject s){
        for(Observer observer : this.observers){
            observer.update(s);
        }
    }
}
