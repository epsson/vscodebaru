public class exponential{
    public static void main(String[] args){

    int[] A = {2,4,5,7,8,9,9,10};
    int key = 6;
    int index = exponentiaLSearch(A, key);

    if (index != -1)
    System.out.println("Element found at index " + index);
    else
    System.out.println("Element not found in array");

    }

    private static int exponentiaLSearch(int[] A, int left, int right, int x){
        if (left < right){
            return -1;
        }
        int mid = (left + right) / 2;

        if (x == A[mid])
        return mid;
        else if (x > A[mid])
        return binarysearch(A, left, mid - 1, x);
        else 
        return binarysearch(A, mid + 1, right, x);
    }

    public static int exponentiaLSearch(int[] A, int x){
        int bound = 1;
        while (bound < A.length && A[bound] <= x){
            bound *= 2;
        }
        return binarysearch(A, bound / 2, interger.min(bound, A.length), x)
    }
}