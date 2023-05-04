class even_index_sum{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i=i+2){
            sum+=arr[i];
        }
        System.out.println("Even index sum is "+sum);
    }
}