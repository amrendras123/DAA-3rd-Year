
public class KColsestPoint {
    
        class Pair{
            int[] point=new int[2];
            int dis;
    
            Pair(int dis,int[] point){
                this.dis=dis;
                this.point[0]=point[0];
                this.point[1]=point[1];
            }
        }
        public int[][] kClosest(int[][] points, int k) {
            int[][] ans=new int[k][2];
            
            PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
               public int compare(Pair a,Pair b){
                return b.dis-a.dis;
               };
            });
            for(int i=0;i<points.length;i++){
                int[] temp=new int[2];
                temp[0]=points[i][0];
                temp[1]=points[i][1];
                int dis=(int)(Math.pow(temp[0],2)+Math.pow(temp[1],2));
                pq.add(new Pair(dis,temp));
                if(pq.size()>k){
                    pq.poll();
                }
    
            }
            for(int i=0;i<k;i++){
                ans[i][0]=pq.peek().point[0];
                ans[i][1]=pq.peek().point[1];
                pq.poll();
            }
            return ans;
    
        }
    }

