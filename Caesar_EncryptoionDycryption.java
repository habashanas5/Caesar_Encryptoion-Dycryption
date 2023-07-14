/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar_encryptoion.dycryption;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shahrouri tech
 */
public class Caesar_EncryptoionDycryption {
 //Caesar Cipher for cipherText
    public static String CaesarCipher(String text, int key) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                result += " ";
            } else if (Character.isUpperCase(text.charAt(i))) {
                result += (char) (((int) text.charAt(i) + key - 65) % 26 + 65);
            } else {  //char isLowerCase
                result += (char) (((int) text.charAt(i) + key - 97) % 26 + 97);
            }
        }
        return result;
    }

   public static void fun1() {
        Scanner in = new Scanner(System.in);
        Random R = new Random();
        int answer = R.nextInt(25) + 1;
        System.out.print("please enter a plaintext: ");
        String text = in.nextLine();
        // int num = in.nextInt();
        System.out.println("\n The plaintext is: " + text);
        System.out.println(" key number is: " + answer);
        String cipherText = CaesarCipher(text, answer);
        System.out.println(" The ciphertext is: " + cipherText);
    }

    public static void Dycreption(String cipherText) {
        String result = "";
        for (int i = 1; i < 26; i++) {
            System.out.print("Attempt No#" + (26-i) + ": ");
            result = CaesarCipher(cipherText, i);
            System.out.println(result);
        }
    }

    public static void fun2() {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter a ciphertext: ");
        String text = in.nextLine();
        Dycreption(text);
    }

    public static void main(String[] args) {

        int choice = 0;

        while (true) {
            System.out.println(" 1- Encryption program");
            System.out.println(" 2- Dycreption program");
            System.out.println(" 3- Exit");
            System.out.println("****************************************");
            System.out.print("Please enter a choice that you want: ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    fun1();
                    System.out.println("****************************************");
                    break;

                case 2:
                    fun2();
                    System.out.println("****************************************");
                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.print("Please renter number: ");
                    break;
            }
        }
    }
}
