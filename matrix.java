public class matrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{6,5,4},{4,3,2},{2,1,0}};
        int sum[][]=new int[3][3];
        int pro[][] =new int[3][3];

        //addition of both the above matrices is as follows....

        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {

                sum[i][j]=a[i][j]+b[i][j];


            }

        }

        System.out.println("the sum of 2 matrices is");
        for (int i = 0; i <3; i++) {     //u will get the result in the matrix form with this code
            for (int j = 0; j <3 ; j++) {

                System.out.print(sum[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }

        //multiplication of 2 matrices is as follows

        // for multiplication to be possible the column no. of 1st matrix should be same as row no. of second matrix

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {         /*as the rows of 1st matrix and columns of 2nd matrix
                                                        are changing hence we need another variable 'k' to
                                                        through the respective rows and columns...*/
                for (int k = 0; k <3; k++) {

                 pro[i][j]+=a[i][k]*b[k][j];
                }

            }


        }
        System.out.println("the product of 2 matrices is ");
        for (int i = 0; i <3 ; i++) {       //this gives the multiplication result....
            for (int j = 0; j <3; j++) {

                System.out.print(pro[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

OUTPUT :
            the sum of 2 matrices is
                            7 7 7 
                            8 8 8 
                            9 9 9 
            the product of 2 matrices is 
                            20 14 8 
                            56 41 26 
                            92 68 44 
