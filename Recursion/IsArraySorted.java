public class IsArraySorted {

    public static boolean isSorted(int[] arr, int ind){
        if(ind == arr.length - 1) return true;

        if(arr[ind] <= arr[ind + 1]) return isSorted(arr, ind+1);
        else return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        for(int a: arr) System.out.print(a+" ");
        System.out.println();
        System.out.println("Is given array sorted: "+ isSorted(arr, 0));
    }
}