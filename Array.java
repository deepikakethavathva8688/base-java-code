public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 , 6 ,7,8,9,10};
        UpdateArray(arr);
        
        for( int i = 0 ; i <= arr.length - 1; i++) {
        System.out.print(arr[i] + " ");
        }
    }
         // method is funtion which is used to update the array value
         static void UpdateArray(int[] a) {
            a[0] = 100;   
        }
    }
