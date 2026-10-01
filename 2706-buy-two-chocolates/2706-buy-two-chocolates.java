class Solution {
    public int buyChoco(int[] prices, int money) {
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        for(int n:prices){
            if(n<m1){
                m2=m1;
                m1=n;
            }else if(n<m2){
                m2=n;
            }
            }
            int cost=m1+m2;
            if(cost<=money){
                return money-cost;
            }
            return money;
            }
}
        