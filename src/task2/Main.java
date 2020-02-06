package task2;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        int result = 0;
        result = numberGenerator.generateNumbers();
        System.out.println("Wynik dodawania liczby 1 3 i 5: "+ result);
    }
}
