package Design_Pattern_and_Principles.factoryMethod_pattern;

public class pdfDocument implements document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}
