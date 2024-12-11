package factorypattern;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacBox");
    }
}
