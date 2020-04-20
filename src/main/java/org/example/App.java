package org.example;

import java.util.Scanner;

public class App {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        RemovingCharacters removingCharacters = new RemovingCharacters();
        System.out.println("Enter String");
        String str = removingCharacters.checkString(scanner.next());
        System.out.println("Corrected String : " + str);

    }
}
