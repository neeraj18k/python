import java.util.*;

public class Binarysearch {
    public static int bs(int numbers[],int key){
        int start=0; int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;//right part
            }else{
                end=mid-1;//left part
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=99;
        System.out.println("the index of the key is "+bs(numbers, key));
        }
    
}
