/*
10.25: (New string split method) The split method in the String class returns an
array of strings consisting of the substrings split by the delimiters. However, the
delimiters are not returned. Implement the following new method that returns
an array of strings consisting of the substrings split by the matching delimiters,
including the matching delimiters.
public static String[] split(String s, String regex)
For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
#, and e in an array of String
*/

public class Problem25 {
    public static void main(String[] args){
        String s = "a?b?gf#e";
        String[] tokens = split(s , "[?#]");
        for (String e : tokens)
            System.out.print(e + " ");
    }
    public static String[] split(String s, String regex) {
        String[] tokens = new String[s.length() * 2];
        String[] splits = new String[regex.length() - 2];
        int count = 0;
        for (int i = 0 ; i < tokens.length ; i++)
            tokens[i] = "";
        for (int i = 0 ; i < splits.length ; i++)
            splits[i] = regex.charAt(i + 1) + "";
        for (int i = 0 ; i < s.length() ; i++) {
            if (isExist(s.charAt(i) , splits)){
                if (search(s.charAt(i) + "" , tokens))
                    continue;
                tokens[++count] = s.charAt(i) + "";
                continue;
            }
            tokens[++count] = s.charAt(i) + "";
        }
        return tokens;
    }
    public static boolean isExist(char ch , String[] splits){
        for(int i = 0 ; i < splits.length ; i++)
            if (splits[i].equals(ch + ""))
                return true;
        return false;
    }
    public static boolean search(String s , String[] tokens){
        for (int i = 0 ; i < tokens.length ; i++)
            if (tokens[i].equals(s))
                return true;
        return false;
    }
}
