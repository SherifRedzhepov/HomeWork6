package org.example;

import java.util.Scanner;

public class PasswordValidation {


   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Password must contains at least" +
              " one symbol,one digit and one letter !!!\nPlease enter password:");
      String password = input.nextLine();
      checkPass(password);
   }
   public static void checkPass(String password) {

      int digit = 0;
      char letter = 0;
      char symbol = 0;
      if (password.length() >= 8 && !password.contains(" ")) {
         for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
               digit++;
            }
            else if (Character.isLetter(c)) {
               letter++;
            }
            else {
               symbol++;
            }
         }
      }
      if (digit > 0 && letter > 0 && symbol > 0) {
         System.out.println("password is valid");
      } else {
         System.out.println("Error: Invalid entry for password");
      }
   }
}