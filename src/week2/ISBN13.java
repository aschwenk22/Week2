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
public class ISBN13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 string: ");
        String s = sc.nextLine();
        
        if(s.length() == 12){
            int sum = 0;
            int checkSum = 0;
            for(int i = 1; i <= 12; i++){
                if(i % 2 == 0){
                    sum+= 3 * Integer.parseInt(s.substring(i-1,i));
                } else {
                    sum+= Integer.parseInt(s.substring(i-1,i));
                }
            }
            checkSum = 10 - sum % 10;
            if(checkSum == 10){
                checkSum = 0;
            }
            System.out.println("The ISBN-13 number is: "+ s + checkSum);
        } else {
            System.out.println(s + " is an invalid input");
        }
    }
}
