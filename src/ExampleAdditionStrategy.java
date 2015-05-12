import java.util.Random;

/**
 * Created by dan on 5/11/15.
 */
public class ExampleAdditionStrategy {
    int additionAmount;

    public ExampleAdditionStrategy() {
        Random rnGenerator = new Random();
        additionAmount = rnGenerator.nextInt(1000);
    }

    public void useAndPrint(Integer number) {
        System.out.println("Hello I am the adding " + additionAmount + "! " + number + "+" + additionAmount + " = " + number + additionAmount);
    }
}
