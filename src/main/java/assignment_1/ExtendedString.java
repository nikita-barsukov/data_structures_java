package assignment_1;

import java.util.Arrays;

public class ExtendedString {
    public String str;
    public ExtendedString(String strng) {
        this.str = strng;
    }

    public boolean hasDuplicatedChars() {
        char[] str_sorted = str.toCharArray();
        Arrays.sort(str_sorted);
        if(str_sorted.length < 2 ){
            return false;
        }
        for(int i=0; i < str_sorted.length - 1; i++) {
            if(str_sorted[i] == str_sorted[i+1]) {
                return true;
            }
        }
        return false;
    }
}
