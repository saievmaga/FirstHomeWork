public class Main {
    public static boolean main(String[] args) {
//        int a = 3;
//        switch (a){
//            case 1:
//                System.out.println("a = 1");
//                break;
//            case 2:
//                System.out.println("a = 2");
//                break;
//            case 3:
//                System.out.println("a = 3");
//                break;
//            default:
//                System.out.println("a = 4");
//        }

//        int[] mass1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < mass1.length; i++) {
//            if (mass1[i] == 1) {
//                mass1[i]  = 0;
//            } else {
//                mass1[i] = 1;
//            }
//            System.out.println(mass1[i]);
//        }
//
//
//        int[] mass2 = new int[8];
//        for (int i = 0, j = 2; i < mass2.length; i++) {
//            mass2[i] = i + j * i;
//            System.out.println(mass2[i]);
//        }
//
//        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < mass3.length; i++) {
//            if (mass3[i] < 6) {
//                mass3[i] *=2;
//            }
//            System.out.println(mass3[i]);
//        }
//
//        int[][] mass4 = new int[7][7];
//        for (int i = 0; i < mass4.length; i++) {
//            for (int j = 0, j2 = mass4[i].length; j < mass4[i].length; j++, j2--) {
//                if (i == j || i == (j2 - 1)) mass4[i][j] = 1;
//                System.out.print(mass4[i][j] + " ");
//            }
//            System.out.print("\r\n");
//        }

        int[] mass5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = mass5[0], max = mass5[0], minIndex = 0, maxIndex = 0;
        for (int i = 0; i < mass5.length; i++) {
            if (mass5[i] > max) {
                max = mass5[i];
                maxIndex = i;
            }
            if (mass5[i] < min){
                min = mass5[i];
                minIndex = i;
            }
        }

        static boolean checkBalance( int[] mass6){
            int leftNum, rightNum;
            for (int i = 0; i < mass6.length + 1; i++) {
                leftNum = 0;
                rightNum = 0;
                for (int j = 0; j < i; j++) {
                    leftNum += mass6[j];
                }
                for (int j = i; j < mass6.length; j++) {
                    rightNum += mass6[j];
                }
                if (leftNum == rightNum){
                    return true;
                }
            }
            return false;


//        static void endMethod ( int[] mass7, int n){
//            for (int i = 0; i < mass7.length; i++) {
//                if (n == 1) {
//                    mass7[i] = mass7[i] + 1;
//                } else {
//                    mass7[i] = mass7[i] - 1;
//                }
//            }
//        }





    }
}
