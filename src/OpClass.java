import java.util.Scanner;

public class OpClass {

    public void test(){
        System.out.println("too cold");
    }

    public void testNumber(){
        System.out.println("5");
    }

    public void add(int x, int y){
        int sum = x + y;
        System.out.println(sum);
    }

    public int minus(int x, int y){
        int subtraction = x - y;
        return subtraction;
    }

    public int division(int x, int y){
        int div = x/y;
        //System.out.println(div);
        return div;
    }


    public static void main(String[] args){
        OpClass oop = new OpClass();
        oop.test();
        oop.testNumber();
        oop.add(10, 25);

        int result = oop.minus(10, 3);
        System.out.println(result);

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = reader.nextInt();

        System.out.println("Enter number: ");
        int num2 = reader.nextInt();

        int r = oop.division(num1, num2);
        System.out.println(r);


    }
}
