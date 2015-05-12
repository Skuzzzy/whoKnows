import java.util.Scanner;

/**
 * Created by dan on 5/11/15.
 */
public class ExampleProgram {
    public static void main(String args[]) {
        Subject integerDirector = new ExampleSubject();
        DataPack information = new ArrayListDataPack();

        for(int i=0; i<15; i++) {
            integerDirector.registerObserver(new ExampleObserver());
        }

        Scanner stdin = new Scanner(System.in);
        information.addData("number",stdin.nextInt());

        ((ExampleSubject)integerDirector).updateInformation(information);
    }
}
