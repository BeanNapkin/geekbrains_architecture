import java.util.ArrayList;

public class SubjectImpl<T> implements Subject<T> {

    private final ArrayList<Observer<T>> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer<T> observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer<T> observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(T newValue) {
        for (Observer<T> observer: observers) {
            observer.update(newValue);
        }
    }
}
