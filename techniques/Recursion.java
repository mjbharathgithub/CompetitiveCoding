
public class Main
{
        static int count=0;
    static int nonNegSum(int n){
        if(n>0){
            System.out.print(n+" ");
            return n+nonNegSum(n-1);
        }
        return 0;
    }
    

    static void countGridPaths(int row,int col){
        if(row<1||col<1){
            return;
        }
        else{
            if(row==1&&col==1) count++;
            countGridPaths(row-1,col);
            countGridPaths(row,col-1);
        }
        
    }
    
    static int countGridPathsInt(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        else{
            return countGridPathsInt(row-1,col) + countGridPathsInt(row,col-1);
        }
        
    }

	public static int reverseNumber(int number) {
        if (number < 10) {
            return number;
        } else {
            return Integer.parseInt(Integer.toString(number % 10) + reverseNumber(number / 10));
        }
    }
	public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 2. Fibonacci
    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 3. Power of a Number
    public static double power(double x, int n) {
        if(n==0){
            return 1;
        } else if(n>0){
            return x * power(x, n - 1);
        }else{
            return 1 / power(x, -n); // Handle negative exponents
        }
    }

    // 4. Greatest Common Divisor (GCD)
    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }

    // 5. Tower of Hanoi (Illustrative - Prints moves)
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if(n==1){
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
	public static void main(String[] args) {
	    
	    countGridPaths(41,4);
	    int another=countGridPathsInt(41,4);
	    System.out.println(count);
	    System.out.println(another);
	    
	    
	    
	    
	    
	   // int sum=nonNegSum(3);
	//	System.out.println("\n"+sum);
	//	System.out.print("asdfasdf");
	}
}
