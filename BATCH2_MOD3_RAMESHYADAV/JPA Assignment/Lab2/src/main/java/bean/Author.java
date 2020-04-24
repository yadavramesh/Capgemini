package bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Authortable1")
public class Author {
    @Id
    private int authorId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNo;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL, fetch = FetchType.EAGER,orphanRemoval = true)
    private List<Book> book;

    public Author() {
    }
    public Author(int authorId, String firstName, String middleName, String lastName, String phoneNo) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
