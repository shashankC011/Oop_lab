public class Q2 {
    public static void main(String[] args) {
        // (A):
        // for(int i = 1; i<6;i++){
        //     for(int j = 0;j<i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // (B):
        int[] numbers = {1, 2, 3, 4, 5};
        for(int i: numbers){
            for(int j = 0; j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    
    }
}
