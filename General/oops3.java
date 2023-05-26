package General;

public class oops3 {
    public static void main(String[] args) {
        Fish f=new Fish();
        f.eat();
        f.swim();
    }
}
//parent class or Super class
class Animal{
  String color;
  void eat(){
    System.out.println("All Animal eats food");
  }
  void breathe(){
    
    System.out.println("All animal Breathes");
  }
}
//Derived class or subclass
class Fish extends Animal{
  int fins;
  //function overide ker diya
  void eat(){
    System.out.println("Eat worms");
  }
  void swim(){
    System.out.println("swim kerti hai bhai ,fish hai toh swim hi karegii,dance thodi na karegii ");
  }
}
