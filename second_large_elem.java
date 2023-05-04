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
