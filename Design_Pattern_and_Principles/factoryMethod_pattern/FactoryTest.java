package Design_Pattern_and_Principles.factoryMethod_pattern;

public class FactoryTest {

    public static void main(String[] args) {

        documentFactory wordFactory = new WordFactory();
        document word = wordFactory.createDocument();
        word.open();

        documentFactory pdfFactory = new pdfFactory();
        document pdf = pdfFactory.createDocument();
        pdf.open();

        documentFactory excelFactory = new ExcelFactory();
        document excel = excelFactory.createDocument();
        excel.open();
    }
}
