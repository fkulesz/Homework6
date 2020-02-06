package task5;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        int result = numberGenerator.displayNumbers();
        System.out.println("suma liczb parzystych: " + result);
    }
}
