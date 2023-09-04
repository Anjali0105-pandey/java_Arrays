/*BRUTE FORCE
//Time Complexity : O(nlogn) For Sorting
public class max_element {
    public static void main(String[] args) {
        int arr[]={10,7,-5,8,9,0,-4};
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }
}
*/
//OPTIMISED
//Time Complexity : O(N)
public class max_element {
    public static void main(String[] args) {
        int arr[]={10,7,-5,8,9,0,-4};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
