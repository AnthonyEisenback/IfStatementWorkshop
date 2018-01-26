package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

//        Scanner Scanner = new Scanner(System.in);
//
//        System.out.print("what is your name?");
//
//        String name = Scanner.nextLine();
//
//        int number = 4;
//
//        if (name.equals("Dark")) {
//            System.out.println("hello");
//        } else {
//            System.out.println("no");
//
//        }




        /*
        Fizzbuzz - Display all numbers 1-100
        of it is a mutliple of 3 output fizz
        if is multiple of 5 output buzz
        if it is a mutliple of both output fizzbuzz
        if it is none output their number
         */
//
//        Scanner input = new Scanner(System.in);
//        int userNumber = input.nextInt();
//
//        for (int i = 0; i <= 1000; i++) {
//            boolean fizzbuzz = false;
//
//            if (i % 15 == 0 ){
//                System.out.println("fizzBUZZ");
//            }
//
//
//            else if (i % 5 == 0) {
//
//                System.out.println("buzz");
//            }
//
//
//                else if (i % 3 ==0){
//                    System.out.println("Fizz");
//                }
//
//
//                else{
//                System.out.println(i);
//
//        }
//
//
//    }


//}


        System.out.print("Input grade percent");
        Scanner number = new Scanner(System.in);

        int nummine = number.nextInt();

        System.out.println(nummine);

//        boolean number = false;


        if (80 <= 100) {
            System.out.println("A");
        } else if (60 <= 80) {
            System.out.println("B");
        } else if (50 <= 59) {
            System.out.println("C");
        } else if (45 <= 49) {
            System.out.println("D");
        } else if (45 <= 0) {
            System.out.println("F");
        }

    }
}

