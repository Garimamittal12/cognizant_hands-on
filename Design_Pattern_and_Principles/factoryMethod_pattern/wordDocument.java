package Design_Pattern_and_Principles.factoryMethod_pattern;

public class wordDocument implements document {

    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}