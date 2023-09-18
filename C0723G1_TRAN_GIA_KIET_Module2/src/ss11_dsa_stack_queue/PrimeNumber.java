package ss11_dsa_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrimeNumber {
    public boolean checkPrimeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        }
        return false;
    }

    public void PrimeNumberWithStack(int number) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < number; i++) {
            if (checkPrimeNumber(i)) {
                stack.push(i);
            }
        }
        System.out.println("Số nguyên tố trong Stack : ");
        while (!stack.empty()) {
            System.out.println(stack.pop() + "");
        }
    }

    public void PrimeNumberWithQueue(int number) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            if (checkPrimeNumber(i)) {
                queue.add(i);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Số nguyên tố trong Queue");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll() + "");
        }
    }
}
