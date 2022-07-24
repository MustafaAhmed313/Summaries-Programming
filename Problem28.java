/*
10.28: (Implement the StringBuilder class) The StringBuilder class is provided
in the Java library. Provide your own implementation for the following methods
(name the new class MyStringBuilder2):
public MyStringBuilder2();
public MyStringBuilder2(char[] chars);
public MyStringBuilder2(String s);
public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
public MyStringBuilder2 reverse();
public MyStringBuilder2 substring(int begin);
public MyStringBuilder2 toUpperCase();
*/

class MyStringBuilder2 {
    private String s;
    public MyStringBuilder2(){
        s = "";
    }
    public MyStringBuilder2(char[] chars){
        for (int i = 0 ; i < chars.length ; i++)
            s += chars[i] + "";
    }
    public MyStringBuilder2(String str){
        s = str;
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String newStr = "";
        int i;
        for (i = 0; i < offset; i++) {
            if (i < offset)
                newStr += this.s.charAt(i) + "";
        }
        newStr += s;
        return new MyStringBuilder2(newStr + substring(offset));
    }
    public MyStringBuilder2 reverse() {
        String newStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }
    public MyStringBuilder2 substring(int begin) {
        String newStr = "";
        for (int i = begin; i < s.length(); i++) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }
    public MyStringBuilder2 toUpperCase() {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                newStr += (char)(s.charAt(i) - 32) + "";
            else
                newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }
}

