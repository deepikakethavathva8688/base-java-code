public class Pattern2 {
    public static void main (String[] agrs) {

        int  n = 5;
        for(int  row = 0; row <= n; row++) {
            for(int col = 0; col <= 6; col++) {

                if(row == 0 || row == n) {
                    System.out.print(" *");
                } else if( col == 1 ||  col == 6) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            } System.out.println();
        } 
    }
}