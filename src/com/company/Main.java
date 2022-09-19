package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i=0;i<testCase;i++){
            int alice = scan.nextInt();
            int bob = scan.nextInt();

            System.out.println(7 - Math.max(alice,bob));
        }
    }
}
