class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int ans=0;
        while(j<fruits.length){
            int n=fruits[j];
            map.put(n,map.getOrDefault(n,0)+1);
            while(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);

                if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                }

                i++;
            }
            j++;
            ans = Math.max(ans, j - i );
        }
        return ans;
    }
}