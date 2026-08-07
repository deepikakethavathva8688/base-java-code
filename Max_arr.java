public class Max_arr {
    public static void main(String[] args) {
        int []  arr = {1, 2 ,3,4,58, 6, 7,12,29};
        int Max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            int curr = arr[i];
            if( curr > Max) {
            //    Max = curr;
            Max = Math.max(Max, curr);
            } 
        }
        System.out.println("Maximum element is: " + Max);
    }
}