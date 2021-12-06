package com.helper.work.courses.hackerrank;

/**
 * Exercise Palindrome of Hackerrank
 * https://www.hackerrank.com/challenges/palindrome-index/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 *
 */
public class Palindrome {

    public static int palindromeIndex2(String s) {
        int l = s.length();
        int i,j,a,b;
        for (i=0, j=l-1; i<l; i++,j--){
            if (s.charAt(i)!=s.charAt(j))
                break;
        }
        if (i>j) return -1;

        System.out.println(i);
        System.out.println(j);

        for (a = i+1, b = j;a<j && b>i+1; a++,b--){
            if (s.charAt(a)!=s.charAt(b)) {
                System.out.println(a  + " " + s.charAt(a));
                System.out.println(b  + " " + s.charAt(b));
                return j;
            }
        }
        return i;
    }


    public static int palindromeIndex(String s) {

        final int mid = s.length() / 2;
//        String s1 = s.substring(0, mid);
//        String s2 = s.substring(mid);
        int index = -1;
        int j = s.length()-1;
        int a, b;
        for (int i = 0; i < mid; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if (c1 != c2) {
                a = i+1;
                b = j-1;
                break;
            }
            j--;
        }


        return index;
    }
}
