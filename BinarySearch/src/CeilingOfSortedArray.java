public class CeilingOfSortedArray {


    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int target = 4;
        CeilingOfSortedArray c = new CeilingOfSortedArray();
        c.ceiling(arr,target);

    }

    int ceiling(int[] arr,int target){

        int start = 0 , end = arr.length-1;
        int mid = start + (end - start)/2;

        // base case
        if(arr[mid] == target){
            return mid;
        }
        return start;
    }


}
