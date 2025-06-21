package Design_Patterns_and_Principles.FactoryMethodPattern.Document;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening Pdf Document...");
    }

}
