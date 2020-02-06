package task1;

public class Main {
    public static void main(String[] args) {
    NumberGenerator numberGenerator = new NumberGenerator();
     int var = numberGenerator.generateNumberFromUser();
    while(!numberGenerator.checkTheNumber(var)){
        var =  numberGenerator.generateNumberFromUser();
    }
    }
}
