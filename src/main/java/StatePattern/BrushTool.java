package StatePattern;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Select Brush tool");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
