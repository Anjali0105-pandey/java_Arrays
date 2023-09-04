/*BRUTE FORCE
Time Complexity : O(NlogN)+o(N)
public class second_large_elem {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,65,43};
        Arrays.sort(arr);
        //Here largest is 65. So, if I take second largest as arr[n-1] then again it will be 65 which is not true;
        int largest=arr[n-2];
        int sec_large=0;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                sec_large=arr[i];
                break;
            }
        }
        System.out.println(sec_large);
    }
}
*/

/*
Better Approach
Time Complexity : O(N)+O(N);

public class second_large_elem {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int sec=Integer.MIN_VALUE;
        //second largest
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max)
                sec=Math.max(sec,arr[i]);
        }
        System.out.println(sec);
    }
}
*/

//Optimal Approach FINDING SECOND LARGEST AND SMALLEST
public class Solution {
    public static int secondLargest(int a[],int n){
        int largest=a[0];
        int sec_largest=-1;
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                sec_largest=largest;
                largest=a[i];
            }
            else if(a[i]<largest && a[i]>sec_largest)
                sec_largest=a[i];
        }
        return sec_largest;
    }
    public static int secondSmallest(int a[],int n){
        int smallest=a[0];
        int sec_smallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                sec_smallest=smallest;
                smallest=a[i];
            }
            else if(a[i]!=smallest && a[i]<sec_smallest)
                sec_smallest=a[i];
        }
        return sec_smallest;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        int slargest=secondLargest(a,n);
        int ssmallest=secondSmallest(a,n);
        int ans[]=new int[2];
        ans[0]=slargest;
        ans[1]=ssmallest;
        return ans;
    }
}

