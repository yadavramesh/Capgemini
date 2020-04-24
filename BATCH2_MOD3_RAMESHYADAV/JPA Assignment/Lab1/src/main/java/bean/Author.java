package bean;

import javax.persistence.*;

@Entity
@Table(name = "AuthorDetails")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    private String firstName;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    private String middleName;
    private String lastName;
    private String phoneNo;

    public Author(){}


    public Author(int authorId, String firstName, String middleName, String lastName,String phoneNo) {
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
