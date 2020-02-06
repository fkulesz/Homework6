package task5;

public class NumberGenerator {
    public int displayNumbers(){
        int i = 0;
        int max = 100;
        int sum = 0;
        while (i <= max){
            if(i % 2 == 0){
                System.out.println(i );
                sum = sum + i;
            }
            i++;

        }
        return sum;

    }

}
