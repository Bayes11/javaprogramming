package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char Alphabets [] = new char[26];

        for (int i = 0, j = 'A'; i < 26; i++ , j++) {
            Alphabets[i] = (char)j; }
        System.out.println(Arrays.toString(Alphabets));

        System.out.println("-------------------------------------------------------");


        char Alphabets2 [] = new char[26];

        for (int i = 0 , j = 'Z'; i<26 ; i++ , j--) {
            Alphabets2[i] = (char)j;

        }
        System.out.println(Arrays.toString(Alphabets2));


        System.out.println("-----------------------------------------------------");

        char Alphabets3 [] = new char [26];

        for (int i = 0, j = 90; i < 26; i++, j--) {
            Alphabets3[i] = (char)j;

        }
        System.out.println(Arrays.toString(Alphabets3));

        }
    }
