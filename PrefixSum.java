import java.util.*;

public class PrefixSum{

    public static void ps(int numbers[]){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;

        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];  // phele wale ka sum wo hoga jo phele index mei hai
        //calculate prefix array

        for(int i=1;i<prefix.length;i++){ // aldready 0 decide hochuka hai toh 1 se shuru karenge
            prefix[i]=prefix[i-1]+numbers[i];
        }


        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
           

                currSum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxsum<currSum){
                    maxsum=currSum;
                }

            }
        }
        System.out.println("the max sum is :"+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,-1};
        ps(numbers);
        
    }
}