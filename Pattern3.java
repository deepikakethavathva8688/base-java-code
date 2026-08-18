public class Pattern3 {
    public static void main(String[] args) { 
        int n = 10;
        for (int row = 1; row <= n; row++) {
            
            // First two rows or last row → solid stars
            if (row == 1 || row == 2 || row == n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                // First star
                System.out.print("* ");
                
                // Hollow spaces in between
                for (int col = 1; col <= (row - 2); col++) {
                    System.out.print("  ");  // two spaces to match "* "
                }
                
                // Last star
                System.out.print("* ");
            }
            
            // Move to next line
            System.out.println();
        }
    }
}
