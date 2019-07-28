public class lesson2{
  public static void main(String[] args) {
    // for and while loops fo same things, different purposes

    for (int i = 0; i < 10; i++) {
      //System.out.println(i);
    }

    int j = 0;
    while(j < 10){
      //System.out.println(j);
      j++;
    }
    // for loops- you know exactly when you're going to stop looping
    // If you're unsure about when to stop looping, you use a while loop

    int a = 20;
    if (a == 20) {
      //System.out.println("a is 10");
    }
    else{
      //System.out.println("a is not 10");
    }
// = this equal sign means assignment
// == this equal sign check to see if values are equal

// != not equals

/*
  if a is less than 0 i print a is negative
  if a is less between 0 and 10 inclusive pring a is small
  if a is over 10 print a is a big number
*/

    if (a < 0) {
  //System.out.println("a is negative");
    }
    else if (a <= 10) {
  //System.out.println("a is a small number");
    }
    else{
  //System.out.println("a is a big number");
}

/*
  primitive types:
  integer
  booleans
  doubles
  characters

*/
//ARRAYYYSSSSS
  //the 10 specifies how many integers are in the array
    int[] intArr = new int[10];
    //zero based indexing
    //the first space inside the array is labeled as position 0
    intArr[0] = 1;
    intArr[1] = 2;
    intArr[2] = 3;
    //...

    //System.out.println(intArr[0]);


    int[] intArr2 = new int[]{0,1,2,3,4,5,6,7,8,9};
    //System.out.println(intArr2[4]);

    //THIS IS CORRECT
    int[] intArr3 = new int[20];
    for(int i = 0; i < 20; i++){
      intArr3[i] = i*2;
    }
    System.out.println()
    for (int i = 0; i < arr2.length; i ++) {
			System.out.println(arr2[i]);




    // create a new array of length 1000 and fill it with multiples of 2

    // create a new array of length 1000 and set every other index to a consecutive number

    // print out the array in a nice format, in one lineee



  }

    
