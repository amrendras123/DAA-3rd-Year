public class findLargestvalueinEachRow {
    public class TreeNode {
        int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
        }
    class Solution {
        public List<Integer> largestValues(TreeNode root) {
             List<Integer> list=new ArrayList<>();
            if(root==null)
                return list;
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
            
            while(!q.isEmpty()){
                int max=Integer.MIN_VALUE;
                int size=q.size();
                // double div=size;
                while(size>0){
                    TreeNode temp=q.remove();
                    max=Math.max(temp.val,max);
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                    size--;
                }
                list.add(max);
            }
            return list;
        }
        }
    
}
