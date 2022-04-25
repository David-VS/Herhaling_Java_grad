package be.ehb;

import be.ehb.snacks.Snack;
import be.ehb.snacks.SnackSingleton;

public class Main {

    public static void primeNumbers(){
        for(int i = 1; i < 100; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    continue;
                }
            }
            if(isPrime){
                System.out.print(i + ",");
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main.primeNumbers();

        Snack s1 = new Snack(123, "coca", 1.2f);
        Snack s2 = new Snack(124, "plat water", 1.2f);

        SnackSingleton.getINSTANCE().addSnack(s1);
        SnackSingleton.getINSTANCE().addSnack(s2);
        System.out.println(SnackSingleton.getINSTANCE().getSnackSet());
    }
}
