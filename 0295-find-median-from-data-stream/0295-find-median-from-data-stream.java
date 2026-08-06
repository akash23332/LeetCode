class MedianFinder {
    PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min=new PriorityQueue<>();

    public MedianFinder() {
    

        
    }
    
    public void addNum(int num) {
        if(max.size()==0 && min.size()==0 ){
            max.add(num);
        }
        else if(num<=max.peek()){
            max.add(num);
        }
        else{
            min.add(num);
        }
        if(max.size()-min.size()>1){
            int n=max.remove();
            min.add(n);
        }
        if(min.size()-max.size()>1){
            int n=min.remove();
            max.add(n);
        }
       
        
    }
    
    public double findMedian() {
        if(max.size()>min.size()){
            return max.peek();
        }
        if(min.size()>max.size()){
        return min.peek();}
        else{
            double x=max.peek();
            double y=min.peek();
            double med = (x + y) / 2.0;
            return med;
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */