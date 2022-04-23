package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("Then");
        browseHistory.push("Now");
        browseHistory.push("After");

        Iterator iterator = browseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
