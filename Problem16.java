/*
11:16 (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user
if an answer is entered again. Hint: use an array list to store answers. Here is a
sample run:
What is 5 + 9? 12
Wrong answer. Try again. What is 5 + 9? 34
Wrong answer. Try again. What is 5 + 9? 12
You already entered 12
Wrong answer. Try again. What is 5 + 9? 14
You got it!
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Problem16 {
    public static void main(String[] args){
        int a = (int) (Math.random() * 11);
        int b = (int) (Math.random() * 11);
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + a + " + " + b + " ?");
        ArrayList<Integer> list = new ArrayList<>();
        int answer = input.nextInt();
        list.add(answer);
        while (answer != a + b){
            if (findIndex(list , answer) == -1){
                System.out.println("Wrong answer. Try again. What is " + a + " + "  + b + " ?");
                answer = input.nextInt();
                list.add(answer);
            }else{
                System.out.println
                        ("You already entered" + answer + "\nWrong answer. Try again. What is " + a + " + "  + b + " ?");
                answer = input.nextInt();
                list.add(answer);
            }
        }
        System.out.println("You got it!");
    }
    public static int findIndex(ArrayList<Integer> list , int a){
        int index = list.indexOf(a);
        for (int i = index + 1 ; i < list.size() ; i++){
            if (list.get(i) == a){
                return i;
            }
        }
        return -1;
    }
}
