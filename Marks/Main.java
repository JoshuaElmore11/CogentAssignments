package Marks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = loadA(sc);
        Student b = loadB(sc);

        System.out.println("Student A average: " + a.average);
        System.out.println("Student B average: " + b.average);

    }

    public static Student loadA(Scanner sc){
        double a;
        double b;
        double c;
        double average;

        System.out.println("Enter values for student A");
        System.out.println("Enter first grade: ");
        a = sc.nextDouble();
        System.out.println("Enter second grade: ");
        b = sc.nextDouble();
        System.out.println("Enter third grade: ");
        c = sc.nextDouble();

        A aAvg = new A(a, b, c);
        average = aAvg.getPercentage();

        return new Student(average);
    }

    public static Student loadB(Scanner sc){
        double a;
        double b;
        double c;
        double d;
        double average;

        System.out.println("Enter values for student B");
        System.out.println("Enter first grade: ");
        a = sc.nextDouble();
        System.out.println("Enter second grade: ");
        b = sc.nextDouble();
        System.out.println("Enter third grade: ");
        c = sc.nextDouble();
        System.out.println("Enter fourth grade: ");
        d = sc.nextDouble();

        B bAvg = new B(a, b, c, d);
        average = bAvg.getPercentage();

        return new Student(average);
    }
}
