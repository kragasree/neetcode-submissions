class StockSpanner {
    //TC:
    //SC:
    private List<Integer> al;

    public StockSpanner() {
        al = new ArrayList<>();
    }
    
    public int next(int price) {
        int span = 1;
        al.add(price);
        int n = al.size();
        for (int i = n - 2; i >= 0; i--) {
            if (al.get(i) <= price) {
                span++;
            } else {
                break; 
            }
        }
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */