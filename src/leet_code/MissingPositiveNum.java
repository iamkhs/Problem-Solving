package leet_code;

public class MissingPositiveNum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int k = 2;

        int ans  = findKthPositive(arr, k);
        System.out.println(ans);
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid]-mid-1< k){
                start = mid + 1;
            }
            else{
                end  = mid - 1;
            }
        }
        return start + k;
    }
}
