import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printLessThan100Primes();
    }

    static boolean isPrime(int number) {
        if (number < 2) return false;
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
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        if (a == 0) return b;
        else {
            return maxCommonFactor(a, b - a);
        }
    }

    static void draw(byte option) {
        if (option == 1) {
            for (byte i = 5; i >= 0; i--) {
                for (byte j = 0; j < i; j++) System.out.print("* ");
                System.out.println();
            }
        } else if (option == 2) {
            for (byte i = 0; i < 5; i++) {
                for (byte j = 0; j < 5; j++) System.out.print("* ");
                System.out.println();
            }
        } else if (option == 3) {
            for (byte i = 0; i < 3; i++) {
                for (byte j = 0; j < 5; j++) System.out.print("* ");
                System.out.println();
            }
        } else System.out.println("Do not an option to draw!");
    }

    static void print20FirstPrimes() {
        int i = 0;
        int numberToCheck = 0;
        while (i < 20) {
            if (isPrime(numberToCheck)) {
                System.out.println(numberToCheck);
                i += 1;
            }
            numberToCheck += 1;
        }
    }

    static void printLessThan100Primes() {
        for(int i=2;i<100;i++) {
            if(isPrime(i)) System.out.println(i);
        }
    }
}
