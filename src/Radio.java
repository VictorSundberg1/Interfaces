public class Radio implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Du har startat radion");
    }

    @Override
    public void turnOff() {
        System.out.println("Du har stängt av radion");
    }
}
