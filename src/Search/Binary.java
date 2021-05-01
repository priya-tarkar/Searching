//Searching of element in an array through binary search
package Search;
import java.util.*;
public class Binary {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element in an array");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int[] ar=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]=sc.nextInt();

        }
        int l=0;
        int r=ar.length-1;
        System.out.println("enter the searching element");
        int s=sc.nextInt();
        for (int i = 0; i <ar.length ; i++) {
            int mid=(l+r)/2;
            if(l<=r) {
                if (ar[mid] == s) {
                    System.out.println("element found at index " + mid);
                    break;
                } else if (s < ar[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            else
            {
                System.out.println("element not found");
                break;
            }

        }
    }
}
