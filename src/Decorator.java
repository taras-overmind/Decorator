abstract class Decorator extends Component
        {
protected Component component;

public void SetComponent(Component component)
        {
        this.component = component;
        }
@Override
        public void Operation()
        {
        if (component != null)
        {
        component.Operation();
        }
        }
        }