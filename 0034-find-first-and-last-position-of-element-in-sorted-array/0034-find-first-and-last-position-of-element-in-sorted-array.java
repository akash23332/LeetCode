class Solution {
    public int[] searchRange(int[] nums, int target) {

        int f=focu(nums,target);
        int l=locu(nums,target);
        int[] ar={-1,-1};
    ar[0]=f;
    ar[1]=l;
    return ar;
       
        
    }
    public int focu(int[] arr,int target){
         int low=0;
        int high=arr.length-1;
        int a=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                a=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return a;

    }
    public int locu(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int b=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                b=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return b;

    }
    
}
