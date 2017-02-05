/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int consonants = 0;
        int vowels = 0;
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e'
                        || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                        || s.charAt(i) == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The Number of consonants is " + consonants);
    }
}
