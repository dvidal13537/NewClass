package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner a = System.out.println("Cual es el nombre de la persona?" + new Scanner(System.in));
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Scanner e = new Scanner(System.in);

        String name = a.nextLine();
        int age = b.nextInt();
        String DNI = c.nextLine();
        String sex = d.nextLine();
        int tlf = e.nextInt();

        Person person = new Person (name , age, DNI, sex, tlf);


        System.out.println("El Nombre de la persona es:" + name);
        System.out.println("La edad de la persona es:" + age);
        System.out.println("El dni de la persona es:" + DNI);
        System.out.println("El sexo de la persona es;" + sex);
        System.out.println("El numero de telefono de la persona es:" + tlf);
    }
}
