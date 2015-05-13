import java.util.ArrayList;

/**
 * Created by dan on 5/11/15.
 */
public class ExampleSubject implements Subject {
    DataPack information;
    ArrayList<Observer> registeredObservers;

    public ExampleSubject() {
        registeredObservers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        registeredObservers.add(o);
    }
    public void removeOvserver(Observer o) {
        int observerIndex = registeredObservers.indexOf(o);
        if(observerIndex != -1)
        {
            registeredObservers.remove(observerIndex);
        }
    }
    public void notifyObservers() {
        for(Observer unnotifiedObserver : registeredObservers) {
            unnotifiedObserver.update(information);
        }
    }

    public void updateInformation(DataPack information) {
        this.information = information;
        notifyObservers();
    }
}
