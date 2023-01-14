abstract public class School {

    public void fanAction(){
        System.out.println("fan");
    }

    public void waterAction(){
        System.out.println("water");
    }

    public void doorOpen(){
        System.out.println("dooropen");
    }

    public void doorClose(){
        System.out.println("doorclose");
    }

    public abstract int costAction(int i, int j);


}
