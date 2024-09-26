public class Dog implements Djur{
    @Override
    public void eat() {
        System.out.println("The dog eats nomnom");
    }

    @Override
    public void sound() {
        System.out.println("The dog says woof");
    }
}
