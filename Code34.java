class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    String breed;
    void makeSound(){
        System.out.println("Dog Barks");
    }
    void fetch(){
        System.out.println("Dog is fetching");
    }
}
class Cat extends Animal{
    String color;
    void makeSound(){
        System.out.println("Cat meows");
    }
    void climb(){
        System.out.println("Cat is Climbing");
    }
}
class Demo{
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.name="Dog";
        d1.age=2;
        d1.breed="Lab";
        d1.makeSound();
        d1.fetch();
        Cat c1= new Cat();
        c1.name="Cat";
        c1.age=7;
        c1.makeSound();
        c1.climb();
    }
}