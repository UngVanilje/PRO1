package ex6;

public class Test {
    public static void main(String[] args) {
        System.out.println(repeatedChars("vnhstxxxaby\"", 3));
        System.out.println(repeatedChars("vnhstxxxaby\"", 4));
    }
    public static boolean repeatedChars(String s, int k){
        boolean found = false;
        int i = 0;
        int n = 0;
        while (!found && i < s.length()) {
            char p = s.charAt(i);

            if(n == k)
                found = true;

            int l = 0;
            while (n != k) {
                if (s.charAt(l) == s.charAt(l + 1))
                    n++;
                else
                    l++;
            }
            i++;
        }
        return found;
    }
}
