public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("tested vehicle");
    }


    public static void main(String args[]) {
        Dog ob = new Dog();
        ob.sound();

        Animal a = new Dog();
        a.sound();
        a.test();
    }
}
