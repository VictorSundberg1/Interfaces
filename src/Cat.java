public class Cat implements Djur{
    @Override
    public void eat() {
        System.out.println("The cat eats nomnom");
    }

    @Override
    public void sound() {
        System.out.println("The cat says meow");
    }
}
