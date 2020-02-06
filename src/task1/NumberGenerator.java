package task1;

import java.util.Scanner;

public class NumberGenerator {
    public int generateNumberFromUser(){
        int var = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide a number : ");
        var = scan.nextInt();
     return var;
    }
    public boolean checkTheNumber(int var){
        if ( var < 100 ){
            System.out.println(" Podana liczba jest za mała ");
            return false;
        } else if  ( var > 200){
            System.out.println(" Podana liczba jest za duża ");
            return false;
        } else if ( var % 3 == 1) {
            System.out.println(" Podana liczba jest niepodzielna przez 3");
            return false;
        } else {
            System.out.println("liczba jest Git");
            return true;
        }

    }
}
