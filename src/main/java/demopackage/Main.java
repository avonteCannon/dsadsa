package demopackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, 4);
        System.out.println(car);

        Vehicle train = new Vehicle(8, 10);
        System.out.println(train);

        //Array
        String[] dounts = {"chocGlazed", "strawberry", "glazed"};
        System.out.println(dounts[0]);

        //substring
        String greeting = "Hello";
        String s = greeting.substring(1, 3);
        System.out.println(s);

        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);


        String thisIsAString = "Avonte";
        int x = thisIsAString.length();
        System.out.println(x);

        String chair = "GQ is sitting";

        if(chair.equals(null)){
            System.out.println("GQ is in the chair");
        }

        if(chair != null && chair.length() != 0){

            System.out.println("found GQ");
            System.out.println(chair.length());
        }
            char p = 'X';
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(p);

            System.out.println(stringBuilder);


            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your name? ");

            String name = scanner.nextLine();
            System.out.println(name);

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("That's a beautiful name baby");

            String response = scanner.nextLine();
            System.out.println(response);

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("What's your number?");

            String answer = scanner.nextLine();
            System.out.println(answer);








    }
}
