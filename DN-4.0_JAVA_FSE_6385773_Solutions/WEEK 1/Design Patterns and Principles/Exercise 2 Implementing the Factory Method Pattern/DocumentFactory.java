// Factory Classes
abstract class DocumentFactory {
    public abstract Document createDocument();
    public Document newDocument() {
        Document doc = createDocument();
        System.out.println("Initializing new document...");
        return doc;
    }
}
class WordDocumentFactory extends DocumentFactory {
    @Override public Document createDocument() { 
        return new WordDocument(); }
}
class PdfDocumentFactory extends DocumentFactory {
    @Override public Document createDocument() { 
        return new PdfDocument(); }
}
class ExcelDocumentFactory extends DocumentFactory {
    @Override public Document createDocument() { 
        return new ExcelDocument(); }
}