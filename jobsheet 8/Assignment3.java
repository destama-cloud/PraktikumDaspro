public class Assignment3 {
    public static void main(String[] args) {
        int N1 = 3; 
        int N2 = 5; 

        for (int i = 0; i < N2; i++) {
           
            for (int j = 0; j < N1; j++) {
                if (i == 0 || i == N1 - 1 || j == 0 || j == N1 - 1) {
                    System.out.print("3 ");
                } else {
                    System.out.print("  ");
                }
            }

            
            System.out.print("  ");

            
            for (int j = 0; j < N2; j++) {
                if (i == 0 || i == N2 - 1 || j == 0 || j == N2 - 1) {
                    System.out.print("5 ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

