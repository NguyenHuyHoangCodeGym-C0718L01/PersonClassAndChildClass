package com.company;

public class PersonTest {
    public static void main(String[] args){
        Person person = new Person("Hoang", "Hanoi");
        System.out.println(person.toString());

        Person person1 = new Person("Thinh", "HoaBinh");
        System.out.println(person1.toString());
    }
}
