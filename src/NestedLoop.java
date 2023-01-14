import java.util.Scanner;


public class NestedLoop {

    void bubblesort(int array[]){

        int n = array.length;
        int i, j;

        for(i=0; i<n-1; i++){
            for(j=0; j<n-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }

        }

        for (i=0; i<n; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        int input;

        for (int i=0; i< array.length; i++){
            System.out.println("Enter numbers: ");
            input = sc.nextInt();
            array[i] = input;

        }


        NestedLoop ob = new NestedLoop();
        ob.bubblesort(array);
    }


}