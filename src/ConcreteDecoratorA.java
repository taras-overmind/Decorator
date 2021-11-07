class ConcreteDecoratorA extends Decorator
        {
private String addedState;

@Override
public  void Operation()
        {
        super.Operation();
        addedState = "New State";
                System.out.println("ConcreteDecoratorA.Operation()");
        }
        }