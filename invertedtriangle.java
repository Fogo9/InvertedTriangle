import java.util.Scanner;

public class invertedtriangle{
    public static void main(String[] args) {

        int n, i, k, j;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");

        n = input.nextInt();


        for(i = n - 1; i >= 0; i--){

            for(k = 0; k < (n - i); k++){

                System.out.print(" ");

            }

            for(j = 0; j < (2 * i) - 1; j++){

                System.out.print("*");

            }

            System.out.println();

        }
    }
}
