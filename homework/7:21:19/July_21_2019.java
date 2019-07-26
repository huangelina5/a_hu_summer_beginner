import java.util.Arrays;
public class July_21_2019{
    public static void main(String[] args){
      FUNCTION1(87);
      FUNCTION2();
      FUNCTION3(1,2,3);
      FUNCTION4(50);
      int[] f5 = FUNCTION5(4,7,1,9,5);
      System.out.println(f5[2]);
}

public static int FUNCTION1(int b){

  if(b < 61 && b > 0){
    System.out.println("F");
  }
  else if(b >= 61 && b <= 70){
    System.out.println("D");
  }
  else if(b >= 71 && b <= 80){
    System.out.println("C");
  }
  else if(b >= 81 && b <= 90){
    System.out.println("B");
  }
  else if(b >= 91 && b <=100){
    System.out.println("A");
  }

  return b;


}

public static void FUNCTION2() {

      int a = 0;
      for(a = 0; a < 100; a++){
        if((a % 3 ==0 || a % 4 ==0) && a % 12 !=0){
          System.out.println(a);
        }
      }

  }


public static int FUNCTION3(int a, int b, int c) {

  System.out.print(a + ",");
  System.out.print(b + ",");
  System.out.print(c);
  System.out.println();


  return a;


}


  public static void FUNCTION4(int q){

    int [] n = new int[100];

    int i = 0;
    int r = 0;
    while(q != 0){
      r = q % 2;
      q = q / 2;
      n[i] = r;
      i++;
    }

      for(int s = i - 1; s >= 0; s--){
        System.out.print(n[s]);
      }

      System.out.println();



    }


  public static int[] FUNCTION5(int a, int b, int c, int d, int e){

    int[] m = new int[5];
    m[0] = a;
    m[1] = b;
    m[2] = c;
    m[3] = d;
    m[4] = e;
    Arrays.sort(m);
    return m;

  }



  /*


  Write a program that takes three integer command-line arguments a, b, and c
  and print the number of distinct values (1, 2, or 3) among a, b, and c.

  Write code that takes a integer in base 10 and turns the number into binary and prints it out in the end.
  Write a program that takes five integer command-line arguments and prints the median
  (the third largest one)
  MAKE SURE YOUR CODE IS INDENTED PROPERLY
  */





}
