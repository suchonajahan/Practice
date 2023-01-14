public class BMW extends Car{

    @Override
    public void gearUp() {
        System.out.println("I like bird");
    }

    public static void main(String args[]){

        BMW ob = new BMW();
        ob.gearUp();
        ob.acAction();
        ob.breakAction();
    }
}
