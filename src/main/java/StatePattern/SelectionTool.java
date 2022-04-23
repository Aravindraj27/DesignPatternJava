package StatePattern;

public class SelectionTool implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("Selection Tool on");
    }

    @Override
    public void mouseDown() {
        System.out.println("select components in the area");
    }
}
