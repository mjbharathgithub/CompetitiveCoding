
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
