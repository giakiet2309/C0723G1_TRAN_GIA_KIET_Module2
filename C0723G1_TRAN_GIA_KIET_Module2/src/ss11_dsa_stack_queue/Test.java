package ss11_dsa_stack_queue;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra ");
        int number = Integer.parseInt(scanner.nextLine());
        primeNumber.PrimeNumberWithStack(number);
        primeNumber.PrimeNumberWithQueue(number);
    }
}
