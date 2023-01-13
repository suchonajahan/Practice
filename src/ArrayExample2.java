import java.util.Scanner;

    public class ArrayExample2{

        public static void main(String args[]) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int size = sc.nextInt();
            int array[] = new int[size];
            int i;
            int input;

            for(i=0; i<array.length; i++){

                array[i] = i;

            }

            for(i=0; i<array.length; i++){
                System.out.println("Enter value: ");
                input = sc.nextInt();
                array[i] = input;
            }

            for(i=0; i< array.length; i++) {
                System.out.println("The values are: " + array[i]);
            }

        }
    }

