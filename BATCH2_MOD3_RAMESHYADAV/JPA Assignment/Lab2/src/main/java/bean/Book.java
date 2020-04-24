package bean;

import org.hibernate.mapping.Join;

import javax.persistence.*;

@Entity
@Table(name = "Booktable1")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ISBN;
    private String title;
    private int price;
    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;
public Book(){}
    public Book(String title, int price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
