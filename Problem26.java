/*
10.26: (Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as
a string in which the operands and operator are separated by zero or more
spaces. For example, 3+4 and 3 + 4 are acceptable expressions. Here is a
sample run:
*/

public class Problem26 {
    public static void main(String[] args) {
        String s = args[0].replaceAll(" " , "");
        s = s.replaceAll("[+]" , "#+#");
        s = s.replaceAll("[-]" , "#-#");
        s = s.replaceAll("[*]" , "#*#");
        s = s.replaceAll("[/]" , "#/#");
        s = s.replaceAll("[%]" , "#%#");
        args = s.split("#");
        if (args.length != 3){
            System.out.println("Enter operand1 operator operand2");
            System.exit(0);
        }
        int result = 0;
        switch (args[1]){
            case "+":
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case "-":
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case "*":
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case "/":
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
            case "%":
                result = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
                break;
            default:
                System.out.println("the operand should be any of these (*/+-%)");
                System.exit(0);
        }
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
