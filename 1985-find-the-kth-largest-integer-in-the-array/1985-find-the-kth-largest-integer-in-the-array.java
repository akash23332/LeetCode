
class My implements Comparable<My>{
    String val;
    My(String val){
        this.val=val;
    }
    @Override
    public int compareTo(My s){
        if(this.val.length()!=s.val.length()){
            return Integer.compare(this.val.length(), s.val.length());
        
        }
        return this.val.compareTo(s.val);

    }
}
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<My> pq=new PriorityQueue<>();
        for(String s:nums){
            pq.add(new My(s));
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.remove().val;

        
    }
}