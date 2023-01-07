import java.util.Scanner;

public class Switch {
    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = reader.nextLine();


        switch (name){

            case "Suchona":
            {
                System.out.println("Name is Suchona" ) ;
                break;
            }

            case "Araf":
            {
                System.out.println("Name is Araf" );
                break;

            }



            default:
            {
                System.out.println("This is default");
            }
        }

    }
}
