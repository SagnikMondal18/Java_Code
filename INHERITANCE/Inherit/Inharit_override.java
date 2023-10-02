/*creat a class called animal with an attribute name and a method 
makesound() that prints a generic sound.Then,create two subclasses 
called Dog and Cat,which inherit from animal.Override the makesound()
method in both subclasses to print the respective sounds of a dog and
a cat.*/

import java.util.*;
class Animal{
    String name;
    void name (String name){
        this.name=name;
        System.out.println("Name is : " + name);
    }
    void makesound(){
        System.out.println("Generic Sound");
    }
}

class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Barks");
    }
}

class Cat extends Animal{
    @Override
    void makesound(){
        System.out.println("Meows");
    }
}

class Inharit_override{
    public static void main(String[] args){
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 =new Cat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String n = sc.nextLine();
        a1.name(n);
        a1.makesound();
        d1.makesound();
        c1.makesound();
        sc.close();
    }
}