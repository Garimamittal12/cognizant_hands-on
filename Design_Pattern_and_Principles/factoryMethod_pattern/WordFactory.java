package Design_Pattern_and_Principles.factoryMethod_pattern;

public class WordFactory extends documentFactory {

    @Override
    public document createDocument() {
        return new wordDocument();
    }
}