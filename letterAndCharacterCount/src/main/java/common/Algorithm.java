/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import controller.Counter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author THAO LINH
 */
public class Algorithm {

    private Map<Character, Integer> charCounter
            = new HashMap<>();

    private Map<String, Integer> wordCounter
            = new HashMap<>();

    public void countCharacter(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                continue;
            }
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, (charCounter.get(ch)) + 1);
            }
        }
        System.out.println(charCounter);
    }

    public void countLetter(String content) {
        StringTokenizer word = new StringTokenizer(content);
        while (word.hasMoreTokens()) {
            String token = word.nextToken();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, (wordCounter.get(token)) + 1);
            }
        }
        System.out.println(wordCounter);
    }
//    public static void main(String[] args) {
//        Algorithm algorithm = new Algorithm();
//        algorithm.countCharacter("linh linh");
//        algorithm.countLetter(" Duyen duyen nnn mmas");
//    }

}
