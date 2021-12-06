package com.helper.work.courses;

import com.helper.work.courses.hackerrank.Palindrome;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Exercise {

    public static void main(String[] args) {
//        final String s = "hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";
        final String s = "cwnnwcw";
        log.info("Result:" + Palindrome.palindromeIndex(s));
        log.info("Result 2:" + Palindrome.palindromeIndex2(s));
//        log.info("Result:" + Palindrome.palindromeIndex("hgygsvlfcwnswtuhmyaljkqlqj" +
//            "jqlqkjlaymhutwsnwcwflvsgygh"));
    }

    public static void callTestCases1() {
//        log.info("Result: " + Palindrome.palindromeIndex("quyjjdcgsvvsgcdjjyq"));
//        log.info("Result: " + Palindrome.palindromeIndex("hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh"));
//        log.info("Result: " + Palindrome.palindromeIndex("fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf"));
//        log.info("Result: " + Palindrome.palindromeIndex("bsyhvwfuesumsehmytqioswvpcbxyolapfywdxeacyuruybhbwxjmrrmjxwbhbyuruycaexdwyfpaloyxbcpwsoiqtymhesmuseufwvhysb"));
//        log.info("Result: " + Palindrome.palindromeIndex("fvyqxqxynewuebtcuqdwyetyqqisappmunmnldmkttkmdlnmnumppasiqyteywdquctbeuwenyxqxqyvf"));
//        log.info("Result: " + Palindrome.palindromeIndex("mmbiefhflbeckaecprwfgmqlydfroxrblulpasumubqhhbvlqpixvvxipqlvbhqbumusaplulbrxorfdylqmgfwrpceakceblfhfeibmm"));
//        log.info("Result: " + Palindrome.palindromeIndex("tpqknkmbgasitnwqrqasvolmevkasccsakvemlosaqrqwntisagbmknkqpt"));
        log.info("Result: " + Palindrome.palindromeIndex("lhrxvstsvxrhlt"));
//        log.info("Result: " + Palindrome.palindromeIndex("prcoitfiptvcxrvoalqmfpnqyhrubxspplrftomfehbbhefmotfrlppsxburhyqnpfmqlaorxcvtpiftiocrp"));
//        log.info("Result: " + Palindrome.palindromeIndex("kjowoemiduaaxasnqghxbxkiccikxbxhgqnsaxaaudimeowojk"));

    }
}
