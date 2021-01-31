package com.titoacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String myString = "too HOt to HOoolhy";
        myString = myString.toLowerCase().replace(" ","");
        char[] myChar = myString.toCharArray();
        char[] mySecondChar = new char[myChar.length];
        for (int i = 0; i < myChar.length;i++){
            mySecondChar[myChar.length - 1 - i] = myChar[i];

        }
        System.out.println(myChar);
        System.out.println(mySecondChar);

        for (int i = 0;i < myChar.length;i++){
            if (myChar[i] != mySecondChar[i]){
                System.out.println("Not a palindrome");
                break;
            } else {
                System.out.println("its a palindrome");
                break;
            }


        }






    }
}
