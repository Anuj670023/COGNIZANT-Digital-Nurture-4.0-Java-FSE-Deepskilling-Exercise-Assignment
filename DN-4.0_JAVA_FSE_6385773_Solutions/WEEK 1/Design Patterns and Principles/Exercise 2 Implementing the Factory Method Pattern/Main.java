// Test Class
public class Main {
    public static void main(String[] args) {
        DocumentFactory[] factories = {
            new WordDocumentFactory(),
            new PdfDocumentFactory(),
            new ExcelDocumentFactory()
        };
        for (DocumentFactory factory : factories) {
            Document doc = factory.newDocument();
            testDocument(doc);
            testSpecificFeatures(doc);
            System.out.println();
        }
    }
    private static void testDocument(Document doc) {
        doc.open();
        doc.save();
        doc.close();
    }
    private static void testSpecificFeatures(Document doc) {
        if (doc instanceof WordDocument) {
            ((WordDocument) doc).edit();
        } else if (doc instanceof PdfDocument) {
            ((PdfDocument) doc).preview();
        } else if (doc instanceof ExcelDocument) {
            ((ExcelDocument) doc).calculate();
        }
    }
}