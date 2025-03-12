class ArrayAlgo{

static void swap(int arr[],int n1,int n2){
        arr[n1]+=arr[n2];
        arr[n2]=arr[n1]-arr[n2];
        arr[n1]-=arr[n2];
    }
    
    static void DutchNationalFlag(int arr[],int n){
        
        int start=0,mid=0,end=n-1;
        
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,end);
                end--;
            }
            else {
                System.out.println("Array not elgible for DF algo");
                return;
            }
        }
    }

  
}
