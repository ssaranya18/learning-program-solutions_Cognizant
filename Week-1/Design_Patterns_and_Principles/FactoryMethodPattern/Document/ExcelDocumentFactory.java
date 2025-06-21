package Design_Patterns_and_Principles.FactoryMethodPattern.Document;


public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }

}
