public class lesson2_function{
  public static void main(String[] args){
    //void means empty
    //you use void when the function isn't returning a value
    //If i want the finction to return a value to the main FUNCTION
    //I have to specify what type of value i'm returning
    int x = sumOfNums(1,9);
    System.out.println(x);
    //i can modift(x), like (x+2);
  }


  public static int sumOfNums(int a , int b){
    //doesn't have to be int, can be float, double
    int total = 0;
    for(int i = a; i < b; i++){
      total +=i;
    }
    //System.out.println(total);
    return total;
    //this has to relate to the type of public static
    //with return, you have to change void to int
    //then instead of saying sumOfNums ();
    //you need to print(sumOfNums());

    //in paranthesis
    //put a number, but the thing needs to know what to expect
    //define variable, and create one, such as break;
    //can use b anywhere inside the function, but ONLY THE FUNCTION

    //replace i < 10 with b, so we all know b = 9 because we defined it above
    //

  }

}
