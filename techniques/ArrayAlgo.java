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

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k == 0) {
            return;
        }

        int n = nums.length;
        k = k % n; // Handle cases where k > n

        if (k < 0) { // Handle negative k
            k = n + k;
        }

        int count = 0;
        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public static void rotateReversal(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k < 0) {
            k += n;
        }
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

 
    public static void rotateTempArray(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k < 0) {
            k += n;
        }
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, n);
    }

    
}
