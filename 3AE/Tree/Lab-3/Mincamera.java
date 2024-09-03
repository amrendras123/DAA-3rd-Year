public class Mincamera {
    
    class Solution {
        int minc=0;
        public int minCameraCover(TreeNode root) {
            cam(root);
            return minc;
        }
        public int cam(TreeNode root){
            if(root==null){
                return 1;
            }
            int lc=cam(root.left);
            int rc=cam(root.right);
            if(lc==-1||rc==-1){
                minc++;
                return 0;
            }else if(lc==0||rc==0){
                  return 1;
            }
            return -1;
        }
    }
}
