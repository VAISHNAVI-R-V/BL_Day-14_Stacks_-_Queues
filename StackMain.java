package com.bl.stackandques;

import java.util.Scanner;

public class StackMain {

    //    private static Scanner input;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        StackImplementation stackOperation = new StackImplementation();
        boolean flag = true;

        while (flag) {
            int choice = userMenu();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Element You want to insert to the Stack");
                    int element = input.nextInt();
                    stackOperation.push(element);
                    flag = true;
                    break;
                case 2:
                    stackOperation.pop();
                    flag = true;
                    break;
                case 3:
                    System.out.printf("Top Element: %d ", stackOperation.peek());
                    System.out.println();
                    flag = true;
                    break;
                case 4:
                    stackOperation.disply();
                    flag = true;
                    break;
                case 5:
                    flag = false;
                    break;

            }
        }
    }

    private static int userMenu() {
        System.out.println("Press 1 to Insert");
        System.out.println("Press 2 to Pop");
        System.out.println("Press 3 to Peek");
        System.out.println("Press 4 to Display");
        System.out.println("Press 5 to Quit");

        int choice = input.nextInt();
        return choice;

    }
}
