
public class Main
{
	 static int sumOfArrayElementsTailRecursion(int n){
        
    }
    
	public static void main(String[] args) {
	    System.out.println(len(""));
	}
	
	
	static long sumOfDigits(long n,long sum){
        if(n>0) return sumOfDigits(n/10,(sum+n%10));
        
        return sum;
        
        
    }
    
    static long sum(long n){
        if(n<10) return n;
        
        return (n%10+ sum(n/10));
    }
    
    static void reverse(String str,int len){
        if(len>0){
       
        System.out.print(str.charAt(len-1)); 
        reverse(str,len-1);
        }
    }




	
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


     public static boolean solveNQueens(int[][] board, int col) {
        if(col >= board.length){
            return true; // All queens are placed successfully
        }

        for (int row = 0; row < board.length; row++){
            if (isSafe(board,row,col)){
                board[row][col]=1; // Place the queen

                if (solveNQueens(board,col+1)){
                    return true; // If placing the queen leads to a solution, return true
                }

                // Backtrack: If placing the queen doesn't lead to a solution, remove it
                board[row][col]=0; 
            }
        }

        return false; // No safe position found for this column
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        // Check this row on the left side
        for(int i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }

        // Check upper diagonal on the left side
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        // Check lower diagonal on the left side
        for(int i=row,j=col;i<board.length &&j >= 0;i++,j--){
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printSolution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
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
