import java.util.Random;

public class RandomNumbers {

    public int getCountOfRandomNumbers() {
        int max = 5000;
        Random random = new Random();
        int sum = 0;
        int result = 0;
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        while (sum < max) {
            int randomNumber = random.nextInt(31);
            sum = sum + randomNumber;
            result++;

            if (randomNumber > maxNumber) {
                maxNumber = randomNumber;
            }

            if (randomNumber < minNumber) {
                minNumber = randomNumber;
            }
        }


        System.out.println("Największ wylosowana liczba to: " + maxNumber);
        System.out.println("Najmniejsza wylosowana liczna to: " + minNumber);
        System.out.println("Ilość losowań: " + result);
        return result;

    }

    public static void main (String[] args){
        RandomNumbers randomNumbers = new RandomNumbers();
        System.out.println(randomNumbers.getCountOfRandomNumbers());

    }
}

