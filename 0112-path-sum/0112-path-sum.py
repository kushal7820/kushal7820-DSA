# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False
        st=[]
        st.append((root,targetSum-root.val))
        while st:
            node,cursum=st.pop()
            if not node.left and not node.right and cursum == 0:
                return True
            if node.right:
                st.append((node.right,cursum-node.right.val))
            if node.left:
                st.append((node.left,cursum-node.left.val))
        return False