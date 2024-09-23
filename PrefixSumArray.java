class PrefixSumArray {
    public static void Prefix(int arr[],int prefix[] , int k){
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] prefix = new int[6];
        Prefix(arr , prefix,5);
    }
}
