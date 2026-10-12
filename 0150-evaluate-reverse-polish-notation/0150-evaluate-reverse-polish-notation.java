class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/") ){
                st.push(Integer.parseInt(tokens[i]));

            }
            else{
                if(tokens[i].equals("+")){
                int first=st.pop();
                int second=st.pop();
                st.push(second+first);

                }
                else if(tokens[i].equals("/")){
                int first=st.pop();
                int second=st.pop();
                st.push(second/first);

                }
                if(tokens[i].equals("-")){
                int first=st.pop();
                int second=st.pop();
                st.push(second-first);

                }
                if(tokens[i].equals("*")){
                int first=st.pop();
                int second=st.pop();
                st.push(second*first);

                }
                
            }
        }
        return st.peek();
        
    }
}