package Design_Pattern_and_Principles.factoryMethod_pattern;

public class ExcelDocument implements document {

    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}