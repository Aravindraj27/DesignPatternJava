package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slideList = new ArrayList<>();

    public void addSlide(Slide slide) {
        slideList.add(slide);
    }

    public void export(PresentationBuilder builder) {
       builder.addSlide(new Slide("Copyrights"));
       for(Slide slide : slideList) {
           builder.addSlide(slide);
       }
    }
}
