package utills;

import java.util.Random;

public class RandomValue {

    public static String generateRandomDigits(){
        int length = new Random().nextInt(3) + 2;
        StringBuilder digits = new StringBuilder();

        Random rand = new Random();
        for (int i = 0; i < length; i++){
            digits.append(rand.nextInt(10));
        }
        return digits.toString();
    }
}
