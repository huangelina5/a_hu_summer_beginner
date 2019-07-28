public class lesson3{
  public static void main(String[] args){
    // int[] <- integer array
    // String[] <- String array

    //System.out.println(getSum(3,10));

    //System.out.println(args[0]);

    //String[] str_array = new String[10];

    // str_array => ["test","hello","testing"]
    //run program --> compile
    //then after, can give parameters
    //javac ____.java
    // java _____ awef wefeg 2334 awfef
    //you can add anything and it will print...
    //...in the args thing, MAKE SURE TO ADD SPACE

    //args is the name of the string str_array

    int[] int_arr = new int[]{5};
    //<- a 1d array in java
    int[] line = new int[]{1,2,3,4,5};

    int[][] int_arr_2 = new int[4][5];
    //<- a 2d array in java, like a grid

    int[][] grid = new int[][]{
                                  {1,2,3,4,5},
                                  {6,7,8,9,10},
                                  {11,12,13,14,15},
                                  {16,17,18,19,20},

                                };

    //System.out.println(grid[2][1]);

    //row(2) then column(1)

    int[] arr1 = new int[]{1,2,3,4,5};
    for (int i = 0; i < arr1.length; i++){
      System.out.print(arr1[i] + " ");
    }
    System.out.println();



    int[][] arr2 = new int[][]{
                              {1,2,3,4,5},
                              {6,7,8,9,10}
                                };
    int a = 0;
    int b = 0;
    for (b = 0; b < grid.length; b++){
      for (a = 0; a < grid[0].length; a++){
        System.out.print(grid[b][a]);
        System.out.print(" ");
      }
      System.out.println();
    }








    }
    public static int getSum(int a, int b){
      int total = 0;
      for (int i = a; i < b; i++){
        total += i;
      }
      return total;
      //cannot write stuff after return/

    }




  }
