package org.example;

import java.util.HashMap;

public class FindDuplicateChar {
    public static void main(String[] args) {
        String str = "CocaCola";
        HashMap<Character, Integer> map = new HashMap<>();
        int counter =0;

        for (int i = 0; i < str.length(); i++) {
            counter = 0;

            for (int j = i + 1; j < str.length(); j++) {
                char c = str.charAt(i);
                char c1 = str.charAt(j);

                if (c == c1) {
                    counter++;
                }


                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);

                }
                else {
                    map.put(c, 1);
                }

            }


        }
        System.out.println(map);
    }


}
