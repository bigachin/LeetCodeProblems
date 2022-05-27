
// Java program to ReverseString using StringBuilder
import java.lang.*;
import java.io.*;
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String val = Integer.toString(x);
        StringBuilder val1 = new StringBuilder();
        val1.append(val);
        StringBuilder val2 = val1.reverse();
        if(val2.equals(val1)){
            return true;
        }
        return false;
    }
}