/*
10.23: (Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
*/

class MyString2 {
    private String text;
    public MyString2(String s){
        text = s;
    }
    public int compare(String s){
        int result = 0;
        if (text.length() > s.length())
            return 1;
        else if (text.length() < s.length())
            return -1;
        for (int i = 0 ; i < s.length() ; i++) {
            if (text.charAt(i) < s.charAt(i))
                result = - (i + 1);
            else if (text.charAt(i) >  s.charAt(i))
                result = (i + 1);
        }
        return result;
    }
    public MyString2 substring(int begin){
        String s = "";
        for (int i = begin ; i < text.length() ; i++){
            s += text.charAt(i);
        }
        return new MyString2(s);
    }
    public MyString2 toUpperCase(){
        String s = "";
        for (int i = 0 ; i < text.length() ; i++){
            if (text.charAt(i) < 'a' && text.charAt(i) > 'z')
                s += (text.charAt(i) - 32);
            s += text.charAt(i);
        }
        return new MyString2(s);
    }
    public char[] toChars(){
        char[] chars = new char[text.length()];
        for (int i = 0 ; i < text.length() ; i++)
            chars[i] = text.charAt(i);
        return chars;
    }
    public static MyString2 valueOf(boolean b){
        return new MyString2((b)? "true" : "false");
    }

}
