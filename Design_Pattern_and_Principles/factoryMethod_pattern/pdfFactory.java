package Design_Pattern_and_Principles.factoryMethod_pattern;

public class pdfFactory extends documentFactory {

    @Override
    public document createDocument() {
        return new pdfDocument();
    }
}