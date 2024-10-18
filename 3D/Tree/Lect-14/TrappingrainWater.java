import java.util.Stack;

public class TrappingrainWater {
    class Solution {
    public int trap(int[] height) {    
        Stack<Integer> st=new Stack<>();
        int trapMax=0;
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty()&&height[i]>height[st.peek()]){
                int rm=i;
                int curr=st.pop();
                if(st.isEmpty()){
                    break;
                }
                int lm=st.peek();
                int widht=rm-lm-1;
                trapMax+=(Math.min(height[lm],height[rm])-height[curr])*widht;
            } 
            st.push(i);
        }       
        return trapMax;
    }
}
}
