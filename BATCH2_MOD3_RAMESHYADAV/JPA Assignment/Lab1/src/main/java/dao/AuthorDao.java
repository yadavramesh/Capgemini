package dao;

import bean.Author;
import config.MyFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AuthorDao {
    EntityManager em= MyFactory.getEntityManager();
    public String createAuthor(Author a)
    {
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        em.persist(a);
        tx.commit();
        return "Author Details created !!!!!!!!";
    }
    public Author findAuthorById(int id)
    {
        Author aut=em.find(Author.class,id);
        return aut;
    }
    public String deleteAuthor(int id)
    {
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        Author aut=em.find(Author.class,id);
        em.remove(aut);
        tx.commit();
        return "Author Details deleted !!!!!!!!!";
    }
    public String updateNameAuthor(int id,String fname,String mname,String lname,String phoneno) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Author aut = em.find(Author.class, id);
        if (aut != null) {
            aut.setFirstName(fname);
            aut.setMiddleName(mname);
            aut.setLastName(lname);
            aut.setPhoneNo(phoneno);
            em.persist(aut);
            tx.commit();
            return "Author Details created !!!!!!!!1";
        }
        else
        {
            return "Author is not unavailabe";
        }
    }
}
