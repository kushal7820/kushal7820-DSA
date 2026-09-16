class Solution {
    public int findDuplicate(int[] arr) {
        int slow=0;
        int fast=0;
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }
        while(slow!=fast);
        fast=0;
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
}