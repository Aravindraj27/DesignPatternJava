package BuilderPattern;

public class MovieBuilder implements PresentationBuilder{
    public Movie getMovie() {
        return movie;
    }

    private Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 3);
    }
}
