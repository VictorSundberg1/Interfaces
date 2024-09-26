import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();

        Rectangle rectangle = new Rectangle(4,6);
        Circle circle = new Circle(5);

        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();
        Tv tv1 = new Tv();
        Radio radio1 = new Radio();
        Tv tv2 = new Tv();
        Radio radio2 = new Radio();
        Tv tv3 = new Tv();
        Radio radio3 = new Radio();

        electronicDevices.add(tv1);
        electronicDevices.add(radio1);
        electronicDevices.add(tv2);
        electronicDevices.add(radio2);
        electronicDevices.add(tv3);
        electronicDevices.add(radio3);

        boolean running = true;

        Scanner sc = new Scanner(System.in);

        while (running) {
            printMenu();
            String input = sc.next();
            switch (input){
                case "1":
                    c1.eat();
                    c1.sound();
                    d1.eat();
                    d1.sound();
                    break;
                case "2":
                    System.out.println(circle.area());
                    System.out.println(circle.perimeter());

                    System.out.println(rectangle.area());
                    System.out.println(rectangle.perimeter());
                    break;
                case "3":
                    System.out.println("1: turn on");
                    System.out.println("2: turn off");
                    String input1 = sc.next();
                    if (input1.equals("1")){
                        tv1.turnOn();
                    } else if (input1.equals("2")) {
                        tv1.turnOff();
                    }else System.out.println("bad input");
                    break;
                case "4":
                    System.out.println("1: turn on");
                    System.out.println("2: turn off");
                    String input2 = sc.next();
                    if (input2.equals("1")){
                        radio1.turnOn();
                    } else if (input2.equals("2")) {
                        radio1.turnOff();
                    }else System.out.println("bad input");
                    break;
                case "5":
                    for (ElectronicDevice electronicDevice: electronicDevices){
                        electronicDevice.turnOn();
                    }
                    break;
                case "6":
                    for (ElectronicDevice electronicDevice: electronicDevices){
                        electronicDevice.turnOff();
                    }
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("1: Print animals");
        System.out.println("2: print Shapes");
        System.out.println("3: control Tv");
        System.out.println("4: control radio");
        System.out.println("5: Turn on all devices");
        System.out.println("6: Turn off all devices");
        System.out.println("Exit");
    }

}