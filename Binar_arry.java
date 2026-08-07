public class Binar_arry {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 10};
        int k = 7; // Element to search

        int ind = Binararr(arr, k);
        System.out.println(ind);
    }

    static int Binararr(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Element not found
    }
}