/*
10.27: (Implement the StringBuilder class) The StringBuilder class is provided
in the Java library. Provide your own implementation for the following methods
(name the new class MyStringBuilder1):
public MyStringBuilder1(String s);
public MyStringBuilder1 append(MyStringBuilder1 s);
public MyStringBuilder1 append(int i);
public int length();
public char charAt(int index);
public MyStringBuilder1 toLowerCase();
public MyStringBuilder1 substring(int begin, int end);
public String toString();
*/

class MyStringBuilder1 {
    private String str;
    public MyStringBuilder1(String s){
        this.str = s;
    }
    public MyStringBuilder1 append(MyStringBuilder1 s){
        s.str += this.str;
        return new MyStringBuilder1(s.str);
    }
    public MyStringBuilder1 append(int i){
        String newString = "" + i;
        newString += str;
        return new MyStringBuilder1(newString);
    }
    public int length(){
        return str.length();
    }
    public char charAt(int index){
        return str.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
        for (int i = 0 ; i < str.length() ; i++)
            if (str.charAt(i) < 'A' && str.charAt(i) > 'Z')
                Character.toLowerCase(str.charAt(i));
        return new MyStringBuilder1(str);
    }
    public MyStringBuilder1 substring(int begin , int end){
        return new MyStringBuilder1(str.substring(begin , end));
    }
    public String toString(){
        return str;
    }
}
