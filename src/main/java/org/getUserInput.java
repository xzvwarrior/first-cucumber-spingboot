package org;

import java.util.Scanner;

//This is to allow the user to input their username and password. This is intended to be a stepping stone to eventually pull the credentials off of a JSON file and then encrypt the values.

public class getUserInput {

    public static String getInputs() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String username = scan.nextLine();
//        System.out.printf(username);
//        System.out.println("Enter password");
//        String password = scan.nextLine();
//        System.out.printf(password);
        return username;
    }
}




