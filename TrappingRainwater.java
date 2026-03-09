import java.util.*;

public class TrappingRainwater {
    public static int tp(int height[]){
        //cal left boundary
        //cal right boundary
        //loop
        //water level=min(left,right)
        //tp=water level-height[i]

        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }//left max hogaya

        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }//right max hogaya
        int tp=0;

        for(int i=0;i<height.length;i++){
           int waterlevel=Math.min(leftmax[i],rightmax[i]);
           tp+=waterlevel-height[i];
        }
        return tp;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        tp(height);
        System.out.println("the trapped water amount is "+tp(height));
        
    }
    
}
