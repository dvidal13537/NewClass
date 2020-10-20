package com.company;

public class Person {
//Definición de los atributos
    private String name;
    private int age;
    private String DNI;
    private String sex;
    private int tlf;

    //Creación del Constructor.
    public Person (String name, int age, String DNI, String sex, int tlf){

         this.name = name;
         this.age = age;
         this.DNI = DNI;
         this.sex = sex;
         this.tlf = tlf;
    }
    //Finalizado el constructor.

    //Metodo para obtener el valor del objeto age
        public String getName() {return name;}
        public int getAge () {return age;}
        public String getDNI() {return DNI;}
        public String getSex() {return sex;}
        public int getTlf() {return tlf;}

        public void display () {
        System.out.println(this.name + "\n"+ this.age + "\n" + this.DNI + "\n" + this.sex + "\n" + this.tlf);
    }
}
