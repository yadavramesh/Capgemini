package main;

import bean.Author;
import bean.Book;
import dao.AuthorDao;
import dao.BookDao;

public class Main {
    public static void main(String args[]) {
        // Author created here
//       AuthorDao ad=new AuthorDao();
//        Author author1=new Author();
//        author1.setFirstName("Ashish");
//        author1.setMiddleName("Kumar");
//        author1.setLastName("Singh");
//        author1.setPhoneNo("8956235623");
//        String res=ad.createAuthor(author1);
//        System.out.println(res);

        //Find the author by  Id
//       AuthorDao sd=new AuthorDao();
//       Author au=sd.findAuthorById(43);
//       System.out.println(au);

        //Author deteled by id
//        AuthorDao sd=new AuthorDao();
//        String res=sd.deleteAuthor(43);
//        System.out.println(res);

        //upadte the author details
//        AuthorDao sd=new AuthorDao();
//        String aut=sd.updateNameAuthor(44,"Ramesh","","yyadav","8745124512");
//        System.out.println(aut);

        //Details of book
//        BookDao bd=new BookDao();
//
//        Book b1=new Book();
//        b1.setISBN(1002);
//        b1.setPrice(270);
//        b1.setTitle("three Heros");
//        String res1=bd.createBook(b1);
//        System.out.println(res1);
//        Book b2=new Book();
//        b2.setISBN(1003);
//        b2.setPrice(280);
//        b2.setTitle("four Heros");
//        String res2=bd.createBook(b2);
//        System.out.println(res2);

        //Get all list of books
//        BookDao bd=new BookDao();
//        List<Book> list=bd.getAllBooks();
//        for(Book i:list)
//        {
//            System.out.println(i);
//        }
        //Get the list of book between any price range
//        BookDao bd=new BookDao();
//        List<Book> li=bd.between(270,300);
//        for(Book i:li)
//        {
//            System.out.println(i);
//        }
//        EntityManager em= MyFactory.getEntityManager();
//        EntityTransaction tx=em.getTransaction();
//        tx.begin();
//        Author au=new Author(103,"Ramesh","Kumar","Singh","8956235623");
//        List<Book> li=new ArrayList<Book>();
//        li.add(new Book("Two heroes",850));
//        li.add(new Book("three Heroes",900));
//        li.add(new Book("four heroes",950));
//       au.setBook(li);
//       em.persist(au);
//        Author a=em.find(Author.class,103);
//        System.out.println(a);
//        System.out.println("================books===============");
//        for(Book b:a.getBook())
//        {
//            System.out.println(b);
//        }
//       tx.commit();
//       System.out.println("Added!!!!!!!!!!!!!!");


//        AuthorDao ad=new AuthorDao();
//        Author a=new Author(106,"Mihir","","Rai","8745124512");
//        List<Book> li=new ArrayList<Book>();
//        li.add(new Book("two heman",850,a));
//        li.add(new Book("three heman",450,a));
//        li.add(new Book("four heman",950,a));
//        a.setBook(li);
//        String result=ad.createAuthor(a);
//        System.out.println(result);


        //b.Query all books written by given author Id
//        AuthorDao ad=new AuthorDao();
//        Author a=ad.findAuthorById(106);
//        System.out.println(a.getBook());
//        for(Book i:a.getBook())
//        {
//            System.out.println(i.getTitle());
//        }


        //List the author name for given book id.
        BookDao bd=new BookDao();
        Book b=bd.findBookAuthorById(31);
        System.out.println(b.getAuthor());

   }
}
