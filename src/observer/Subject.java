package observer;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers;
    public  void addObserver(Observer observer){
        observers.add(observer);
    }
    public  void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public abstract void notifyObserver();

}
