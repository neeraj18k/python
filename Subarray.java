import java.util.*;

public class Subarray {
    public static void sub(int numbers[]){
        int total=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){//single lement bhi chahiye isliye i+1 nahi likha
                int end=j;
                for(int k=start;k<=end;k++){//iska kam hai bus print karna hai 
                    System.out.print(numbers[k]+" ");//ye subarray hai
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrys "+total);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        sub(numbers);
    }
    
}
