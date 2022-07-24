/*
10.6: (Displaying the prime numbers) Write a program that displays all the prime
numbers less than 120 in decreasing order. Use the StackOfIntegers class
to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
reverse order.
*/

public class Problem6 {
    public static void main(String[] args){
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0 ; i < 120 ; i++)
            if (isPrime(i))
                stack.push(i);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2 ; i < n / 2 ; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
