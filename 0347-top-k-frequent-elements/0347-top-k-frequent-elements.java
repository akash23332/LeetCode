class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        while(k>0){
            int max=0;
        int val=0;
        for(int n:map.keySet()){
            
            
                if(map.get(n)>max){
                    max=map.get(n);
                    val=n;
                    

                }
            
           
            
        }
         ans.add(val);
        map.remove(val);
        k--;

        }
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
        


    }
}