public class Pattern1 {
    public static void main(String[] agrs) {
        int n = 5;
        for(int row = 0; row <= n; row++) {
            
            // spaces
            for(int col = 0; col <= n-row; col++) {
                System.out.print("  ");
            }
            //start
            for(int col = 0; col <= n;col++) {
                System.out.print(" * ");
            } System.out.println();
           
        }
    }
}