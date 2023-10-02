interface Animal{
    void makesound();
}
class Dog implements Animal{
    public void makesound(){
        System.out.println("Barks");
    }
}
class Cat implements Animal {
    public void makesound(){
        System.out.println("Meows");
    }
}
class DisplayAnimal{
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.makesound();
        c.makesound();
    }
}