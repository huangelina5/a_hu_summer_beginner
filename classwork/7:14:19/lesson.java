public class lesson{
  //SAVE BEFORE PRINTING
  public static void main(String[] args){
    System.out.println("Hello World");
    /*System is Object
    out is thing in the Object
    ln is for new line*/
    System.out.println(5);

    int x = 7;
    System.out.println(x);

    double dec = 9.3;
    System.out.println(dec);
    // one equal sign means assignment.

    boolean flag = true;
    System.out.println(flag);

    char character = 's';
    System.out.println(character);

    String str = "This is a string";
    System.out.println(str);

    double a = 10;
    int b = 3;
    double c = a / b;
    System.out.println(c);

    // + - * / %

    int d = 10;
    int e = 3;
    System.out.println(d % e);

    String newstr = "This is a...";
    String addingstr = "new string";
    System.out.println(newstr + addingstr);

    String newstr2 = "This is a new string";
    newstr2 += " And this is another";
    // +=, a shorthand way of writing
    // equals to newstr2 = newstr2 + " And this is another";

    System.out.println(newstr2);

    /*LOOPING
    for and while loop */

    for (int i = 0; i < 10; i++){
        System.out.println(i);
    }
    // first part is the assignment
    // second part is the condition
    // third pard is the increment
    //i++ is the same as i +=, same as i = i + 1

  }
}

//this is a comment
/* multi-lined comment
second line
end */

/*
  The two types of variables in java
  Primitive Types:
    - integer(int)
    - decimals(double)
    - booleans(boolean) -> True / False
    - characters(char) -> Single Character

  Object Types
    -Strings(String)
        when creating objects, capatalize first character
  */
