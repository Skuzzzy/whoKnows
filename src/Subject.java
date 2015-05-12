/**
 * Created by dan on 5/11/15.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeOvserver(Observer o);
    public void notifyObservers();
}
