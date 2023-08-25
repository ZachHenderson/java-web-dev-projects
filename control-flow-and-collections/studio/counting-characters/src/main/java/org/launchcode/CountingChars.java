package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userString = input.nextLine();

        String stringToLower = userString.toLowerCase();


        HashMap<Character, Integer> count = new HashMap<>();

        char[] charsInString = stringToLower.toCharArray();

        for (char letter: charsInString) {

            boolean alphabetCheck = Character.isAlphabetic(letter);
            // check for blanks
            if(letter != ' ' && alphabetCheck){

            // check for repeated letters
                if(count.containsKey(letter)) {
                    count.put(letter, count.get(letter) + 1);
                } else{
                    // add new letters to hashmap
                    count.put(letter, 1);
                }
            }
        }

        // go through hashmap and print letter with how many times it appears
        for(Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
