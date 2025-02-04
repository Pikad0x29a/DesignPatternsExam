package notification;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<IObserver> observers = new ArrayList<>();

    public void ajouterObserver(IObserver observer) {
        observers.add(observer);
    }

    public void retirerObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifierObservers(String statut) {
        for (IObserver observer : observers) {
            observer.update(statut);
        }
    }
}
