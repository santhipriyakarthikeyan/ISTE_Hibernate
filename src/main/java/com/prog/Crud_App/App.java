package com.prog.Crud_App;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory=HibernateUtil.buildSessionFactory();
       
       Session session = factory.openSession();
       
       //student save - create
       /*
       Student st=new Student();
       st.setName("Viya");
       st.setAddress("Chennai");
       st.setCollegeName("Kamaraj");
       st.setEmail("viya@gmail.com");
      
       Transaction tx=session.beginTransaction();
       session.save(st);
       tx.commit();
       
       System.out.println("Data Saved");
       */
       //Read Data
       /*List<Student> list= session.createQuery("from Student",Student.class).list();
       
       list.forEach(e->System.out.println(e));
       */
       
       //Get by ID
       
      /* Student st=session.get(Student.class, 1);
       System.out.println(st);
       */
       
       //Update the data
      /* Student st=session.get(Student.class, 1);
       st.setAddress("APK");
       st.setEmail("viyababy@gmail.com");
       st.setCollegeName("SRR");
       st.setName("VPViya");
       
       Transaction tx=session.beginTransaction();
       session.saveOrUpdate(st);

       tx.commit();
       System.out.println("Data Successfully Updated");
       */
       
       //Delete Data
       
       Student st=session.get(Student.class, 1);
       Transaction tx=session.beginTransaction();
       session.delete(st);

       tx.commit();
       System.out.println("Data Successfully Deleted");
       
       session.close();
       factory.close();
    }
}
