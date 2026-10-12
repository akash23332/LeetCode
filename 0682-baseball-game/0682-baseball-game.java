class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("+")){
                int first=st.pop();
                int second=st.pop();
                st.push(second);
                st.push(first);
                st.push(first+second);
            }
            else if(ch.equals("D")){
                st.push(2*st.peek());
            }
            else if(ch.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        int sum=0;
        while(st.size()!=0){
            int val=st.pop();
            sum+=val;

        }
        return sum;
        
    }
}