import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    {
        // Create ConcreteComponent and two Decorators
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        // Link decorators
        d1.SetComponent(c);
        d2.SetComponent(d1);

        d2.Operation();

        // Wait for user
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
    }
}}