package org.example;

public class findDuplicate {
    public static void main(String[] args) {
        String a = "aabc";
        String b = "abc";


        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                System.out.println(a.charAt(i));
            }


        }

    }

}
