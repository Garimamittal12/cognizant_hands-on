package Design_Pattern_and_Principles.factoryMethod_pattern;

public class ExcelFactory extends documentFactory {

    @Override
    public document createDocument() {
        return new ExcelDocument();
    }
}