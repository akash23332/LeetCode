class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

     HashSet<Integer> set1=new HashSet<>();
     HashSet<Integer> set2=new HashSet<>();
     for (int i=0;i<nums1.length;i++){
        set1.add(nums1[i]);
     }   
      for (int i=0;i<nums2.length;i++){
        set2.add(nums2[i]);
     } 
     HashSet<Integer> result=new HashSet<>();
     for(int num:set1){
        if(set2.contains(num)){
            result.add(num);
        }
     }
     int[] arr=new int[result.size()];
     int i=0;
     for(int num:result){
        arr[i]=num;
        i++;
     }
     return arr;


    }
}