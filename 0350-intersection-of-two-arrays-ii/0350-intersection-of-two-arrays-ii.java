class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:nums2){
            if(map.containsKey(i)){
                ans.add(i);
                map.put(i,map.get(i)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }
            }
        }
        int[] a=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            a[i]=ans.get(i);
        }
        return a;
        
    }
}