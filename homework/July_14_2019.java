public class July_14_2019{
  public static void main(String[] args){

    for(int i = 49; i < 101; i++) {
			if(i % 2 ==0) {
		        System.out.println(i);
		      }
		    }

  	int a = 49;
		while (a < 101) {
			if (a % 2 ==0) {
		        System.out.println(a);
		      }
			a++;
		    }


		int sum = 0;
		for(int b = 0; b < 11; b++){
			sum = sum + b;
		    }
		System.out.println(sum);

		int sum2 = 0;
		int a2 = 0;
		while (a2 < 11){
			sum2 = sum2 + a2;
		    a2++;
		    }
		System.out.println(sum2);


		for(int c = 0; c < 101; c++) {
			if(c % 2 ==0){
		        if(c % 5 ==1 || c % 5 ==4){
		            System.out.println(c);
		          }
		        }
		      }

		int b = 0;
		while(b < 101) {
			if(b % 2 ==0) {
				if(b % 5 ==1 || b % 5 ==4) {
					System.out.println(b);
		  			}
		  		}
			b++;
		  	}

		for(int d = 0; d < 101; d++) {
			if ((d % 3 ==0 || d % 4==0) && d % 12 != 0) {
				System.out.println(d);
		      }
		    }

		int e = 0;
		while(e < 101) {
			if((e % 3 ==0 || e % 4 ==0) && e % 12 != 0){
				System.out.println(e);
				}
			e++;
		    }

		int f1 = 0;
		int f2 = 1;
		for(int g = 0; g < 21; g++){
			f1 = f1 + f2;
		    f2 = f1 + f2;
		    System.out.println(f1);
		    System.out.println(f2);
		    }

		int h1 = 0;
		int h2 = 1;
		int j = 0;
		while(j < 21) {
			h1 = h1 + h2;
		    h2 = h1 + h2;
		    System.out.println(h1);
		    System.out.println(h2);
		    j++;
		    }




    /*Prints out all the even numbers from 50 to 100 (inclusive)
Sums the numbers from 1 to 10 and prints out the sum one time in the end.
Prints out every even number that is one more or one less than a multiple of 5 from 1 to 100 inclusive.
Prints out all numbers that are either multiples of 3 or multiples of 4, but not both. (a bit challenging)
HARD: Prints out the fibonacci numbers (If you don't know what they are you should google it!)
*/


  }
}
