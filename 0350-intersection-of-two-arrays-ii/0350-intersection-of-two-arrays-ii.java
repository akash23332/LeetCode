class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int nums:nums2){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
    
       ArrayList<Integer> ans=new ArrayList<>();
        for(int i : nums1){
            if(map.containsKey(i)){
                ans.add(i);
                 map.put(i,map.get(i)-1);
            if(map.get(i)==0){
                map.remove(i);
            }
            }
           
        }
        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;
        
    }
}