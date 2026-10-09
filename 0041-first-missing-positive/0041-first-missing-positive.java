class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] f=new int[nums.length+1];
        for(int i: nums){
            if(i>0 && i<=nums.length){
                f[i]=1;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(f[i]==0){
                return i;
            }
        }
         return nums.length+1;
    }
   
}