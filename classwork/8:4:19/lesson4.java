public class lesson4{
  public static void main(String[] args){

    Dog dog1 = new Dog(10,"Brown","Dog1");
    //dog1 is an instance of Dog
    System.out.println(dog1.age);

    Dog dog2 = new Dog(12,"White","Dog2");
    System.out.println(dog2.color);

    dog1.bark();
    dog2.bark();
    System.out.println(dog1.get_age());

    Dog dog3 = new Dog(7,"Black");
    dog3.set_name("Dog3");
    System.out.println(dog3.get_name());

    System.out.println(dog3.toString());
    System.out.println(dog3);
    //these are the same


  }
}

class Dog{
    //instant variables

  int age;
  //private int age
  //private will protect info from outside
  //cannot retrieve it directly anymore
  String color;
  String name;

  //constructor
  public Dog(int age, String color, String name) {
    this.age = age;
    this.color = color;
    this.name = name;
      //this. refers to property itself
  }
  public Dog(int age, String color){
    this.age = age;
    this.color = color;
  }
  public void set_name(String name){
    this.name = name;
  }
  public void bark(){
    System.out.println("Woof");
  }
  public int get_age(){
    return this.age;
  }
  public String get_color(){
    return this.color;
  }
  public String get_name(){
    return this.name;
  }

  public String toString(){
    //must be called EXACTLY toString
    return "My name is "+ this.name;

  }
}
