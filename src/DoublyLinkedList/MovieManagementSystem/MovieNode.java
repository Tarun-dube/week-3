package DoublyLinkedList;

public class MovieNode {
    String title;
    int year;
    String director;
    int rating;
    MovieNode next;
    MovieNode prev;

    MovieNode(String title, int year, String director, int rating) {
        this.title = title;
        this.year = year;

        this.director = director;
        this.rating = rating;
        next = null;
        prev = null;

    }
}
