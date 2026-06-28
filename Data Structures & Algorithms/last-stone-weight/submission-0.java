class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> al = new ArrayList<>();
        for(int i=0; i<stones.length; i++) {
            al.add(stones[i]);
        }

        while(al.size() > 1) {
            int n = al.size();
            int x = al.get(n-1);
            int y = al.get(n-2);
            int newEle = 0;
            if(x < y){
                newEle = y-x;
            } else {
                newEle = x-y;
            }
            al.remove(n-1);  
            al.remove(n-2); 
            al.add(newEle);
            // bcoz to destroy heavy stones first
            Collections.sort(al);
        }

        return al.get(0);
    }
}
