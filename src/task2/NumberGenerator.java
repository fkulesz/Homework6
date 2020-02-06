package task2;

import java.util.Scanner;

public class NumberGenerator {
    public int  generateNumbers(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        int index = 0;
        while(index < array.length) {
            System.out.println("Podaj liczbe: ");
            array[index] = scanner.nextInt();
            index++;
        }
        sum = array[0] + array[2] + array[4];
        return sum;

    }
}
