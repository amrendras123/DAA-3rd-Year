
public class AverageofLevels {
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

        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> list=new List<>();
            if(root==null)
                return list;
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
            
            while(!q.isEmpty()){
                long currsum=0;
                int size=q.size();
                double div=size;
                while(size>0){
                    TreeNode temp=q.remove();
                    currsum+=temp.val;
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                    size--;
                }
                list.add(currsum/div);
            }
            return list;
        }
    }
}
