package dao;

import bean.Author;
import bean.Book;
import config.MyFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class BookDao {
    EntityManager em = MyFactory.getEntityManager();

    public String createBook(List<Book> a) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        tx.commit();
        return "Book Details created !!!!!!!!";
    }

    public List<Book> getAllBooks() {
        List<Book> li = em.createQuery("from Book b").getResultList();
        return li;
    }

    public List<Book> between(int i, int j) {
        Query q = em.createQuery("from Book b where b.price between :low and :high");
        q.setParameter("low", i);
        q.setParameter("high", j);
        List<Book> li = q.getResultList();
        return li;
    }

    public Book findBookAuthorById(int bookId) {
        Book b1= em.find(Book.class, bookId);
        return b1;
    }
}
