
public class Tv implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Du har startat tvn");
    }

    @Override
    public void turnOff() {
        System.out.println("Du har stängt av tvn");

    }
}
