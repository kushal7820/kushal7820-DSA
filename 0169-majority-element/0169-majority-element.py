class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        count=0
        rep=0
        for num in nums:
            if(count==0):
                rep=num
            if num==rep:
                count+=1
            else:
                count-=1
        return rep


        