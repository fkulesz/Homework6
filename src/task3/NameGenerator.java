package task3;

import java.util.Scanner;

public class NameGenerator {
    Scanner scan = new Scanner(System.in);
    String[] arrayNames = new String[5];

    public String[] generateNames(){
        for(int i= 0; i < arrayNames.length; i++){
            System.out.println("Podaj imie " + i);
            arrayNames[i] = scan.nextLine();
        }
        scan.close();
        return arrayNames;

    }
    public void sayHello(String[] arrayNames){
        int index = arrayNames.length-1;
        while(index >= 0){
            System.out.println("Witaj: " + arrayNames[index]);
            index--;
        }
    }


}
