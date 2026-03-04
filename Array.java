import java.util.*;

public class Array{
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc= new Scanner(System.in);
        // int phy;
        // phy=sc.nextInt();
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("physics marks:"+marks[0]);
        System.out.println("chem marks:"+marks[1]);
        System.out.println("maths marks:"+marks[2]);

    }
}