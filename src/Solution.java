import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (byte i = 0; i < 20; i++) {
            System.out.println(i + " is prime: " + isPrime(i));
        }
        System.out.println(maxCommonFactor(scanner.nextInt(),scanner.nextInt()));
        System.out.println(totalInterest(scanner.nextDouble(), scanner.nextByte(), scanner.nextFloat()));
    }

    static boolean isPrime(int number) {
        if (number < 2) return true;
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
        }
        return true;
    }

    static double totalInterest(double money, byte month, float interest_rate) {
        for (byte i = 0; i < month; i++) {
            money += money * interest_rate;
        }
        return money;
    }

    static int maxCommonFactor(int a, int b) {
        if(a>b) {
            a=a+b;
            b=a-b;
            a=a-b;
        }
        if(a==0) return b;
        else {
            return maxCommonFactor(a,b-a);
        }
    }
}
