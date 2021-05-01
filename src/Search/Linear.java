//searching throgh linear search
package Search;
import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int[] ar=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]=sc.nextInt();

        }
        System.out.println("enter the element to search");
        int s=sc.nextInt();
        boolean response=false;
        for (int i = 0; i <n ; i++) {
            if(ar[i]==s)
            {
                response=true;
                break;
            }

        }
        if(response)
        {
            System.out.println("element present in the array");
        }
        else
        {
            System.out.println("element is not present in the array");
        }
    }
}
