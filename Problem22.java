/*
10.22: (Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);
*/


class MyString1 {
    private char[] text;
    public MyString1(char[] chars){
        text = new char[chars.length];
        for (int i = 0 ; i < chars.length ; i++)
            text[i] = chars[i];
    }
    public static MyString1 valueOf(int n){
        int number = n;
        int length = 0;
        while (number != 0){
            number /= 10;
            length++;
        }
        char[] integers = new char[length];
        for (int i = 0 ; i < length ; i++){
            integers[i] = (char) (n % 10);
            n /= 10;
        }
        return new MyString1(integers);
    }
    public boolean equals(MyString1 s){
        if (s.text.length != text.length)
            return false;
        for (int i = 0 ; i < s.length() ; i++){
            if(s.text[i] != text[i])
                return false;
        }
        return true;
    }
    public MyString1 toLowerCase(){
        char[] lower = new char[text.length];
        int low = 0;
        for (int i = 0 ; i < text.length ; i++){
            if (text[i] > 'A' && text[i] < 'Z') {
                low = text[i] + 32;
                lower[i] = (char)low;
            }
        }
        return new MyString1(lower);
    }
    public MyString1 substring(int begin , int end){
        char[] sub = new char[end - begin];
        for (int i = begin ; i < end ; i++) {
            sub[i] += text[i];
        }
        return new MyString1(sub);
    }
    public char charAt(int index){
        return text[index];
    }
    public int length(){
        return text.length;
    }

}
