public class Canteen extends School{

    @Override
    public int costAction(int i, int j) {
        int k = i*j;
        System.out.println(k);
        return k;
    }

    public static void main(){
        Canteen ob = new Canteen();
        ob.fanAction();
        ob.waterAction();
        ob.doorOpen();
        ob.doorClose();
        ob.costAction(2, 5);
    }
}
