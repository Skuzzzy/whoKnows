/**
 * Created by dan on 5/11/15.
 */
public class ExampleObserver implements Observer {

    ExampleAdditionStrategy adder;

    public void update(DataPack updateInfo) {
        adder = new ExampleAdditionStrategy();
        Integer dataPackNumber = (Integer)updateInfo.getData("number");
        this.addSomeAmount(dataPackNumber);
    }

    public void addSomeAmount(Integer updateNumber) {
        adder.useAndPrint(updateNumber);
    }
}
