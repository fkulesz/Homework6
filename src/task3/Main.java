package task3;

public class Main {
    public static void main(String[] args) {
        NameGenerator nameGenerator = new NameGenerator();
        String[] names = nameGenerator.generateNames();
        nameGenerator.sayHello(names);
    }
}
