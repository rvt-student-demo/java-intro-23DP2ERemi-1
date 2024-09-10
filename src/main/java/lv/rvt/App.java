package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Write a message: ");

        // String message = scanner.nextLine();

        // System.out.println(message + " - your message");

        // String name = "Mark";
        // int age = 17;

        // System.out.println("hello, " + name + " your age is - " + age);

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name:");

        String name = scanner.nextLine();



        System.out.println("enter your surname:");

        String surname = scanner.nextLine();


        System.out.println("enter your group:");

        String group = scanner.nextLine();


        System.out.println("your name is: " + name + ", your surname is: " + surname + " and your group is - " + group);
    }

    

}
