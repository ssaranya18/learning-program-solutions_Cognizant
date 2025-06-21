package Design_Patterns_and_Principles.FactoryMethodPattern.Document;


public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document...");
    }

}
