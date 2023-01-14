public class Room extends School{

    @Override
    public int costAction(int i, int j) {
        int k = i*j;
        System.out.println(k);
        return k;
    }

    public static void main(String args[]){
        Room ob = new Room();
        ob.fanAction();
        ob.waterAction();
        ob.doorOpen();
        ob.doorClose();
        ob.costAction(5,7);
    }


}
