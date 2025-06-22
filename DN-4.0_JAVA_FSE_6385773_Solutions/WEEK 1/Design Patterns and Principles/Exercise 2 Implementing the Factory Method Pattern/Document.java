// Document Interface and Implementations
public interface Document {
    void open();
    void save();
    void close();
}
class WordDocument implements Document {
    @Override public void open() { System.out.println("Opening Word document..."); }
    @Override public void save() { System.out.println("Saving Word document..."); }
    @Override public void close() { System.out.println("Closing Word document..."); }
    public void edit() { System.out.println("Editing Word content..."); }
}
class PdfDocument implements Document {
    @Override public void open() { System.out.println("Opening PDF document..."); }
    @Override public void save() { System.out.println("Saving PDF document..."); }
    @Override public void close() { System.out.println("Closing PDF document..."); }
    public void preview() { System.out.println("Previewing PDF..."); }
}
class ExcelDocument implements Document {
    @Override public void open() { System.out.println("Opening Excel document..."); }
    @Override public void save() { System.out.println("Saving Excel document..."); }
    @Override public void close() { System.out.println("Closing Excel document..."); }
    public void calculate() { System.out.println("Calculating formulas..."); }
}