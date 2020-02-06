package task4;

public class NumberGenerator {
    double max = 3.0;

    public void displayNumbersWithWhile(){
        double i = 0;
        System.out.println("Petla While: ");
        while(i <= max){
            System.out.println(i);
            i += 0.1;
        }
    }

    public void displayNumbersWithDoWhile(){
        double i = 0;
        System.out.println("Petla Do_While: ");
       do {
           System.out.println(i);
           i += 0.1;
       }
        while(i <= max);
    }
}
