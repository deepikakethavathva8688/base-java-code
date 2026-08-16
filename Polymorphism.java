public class Polymorphism {
    public static void main (String[] args) {
        Animal a1 = new cat();
         a1.speak();

    }
}
class Animal {

    // speak();
    //  System.out.println()
    // int leags = 4;
    // int eyes = 2;
    void speak(){
        System.out.println("Hello This is animal speaking");
    }

}
class Dog extends Animal {
     void speak() {
        System.out.println("Bow");
      }

}
class cat extends Animal {
     void speak(){
       System.out.println("Meow");
      }

}

