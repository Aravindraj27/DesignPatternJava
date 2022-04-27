package BuilderPattern;

public class PDFDocumentBuilder implements PresentationBuilder{
    public PDFDocument getDocument() {
        return document;
    }

    private PDFDocument document = new PDFDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }
}
