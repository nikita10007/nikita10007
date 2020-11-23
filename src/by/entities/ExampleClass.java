package by.entities;


public class ExampleClass {
    public static void main(String[] args) {
        Person person1= new Person();
        System.out.println(person1 . name);
        System.out.println(person1);
        person1. name =" Vasiliy";
        person1.age = 30;
        person1.country = new Country();
        person1.country.title = "Belarus";
        person1.country.zipCode = 22013;
        person1.sex = Sex.MALE;
        System.out.println(person1. country);
    }
}
