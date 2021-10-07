import org.egitim.jpa.model.data.Kisi;
import org.egitim.jpa.utility.HibernateUtility;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestJPA {
    private static Session session;

    @Test
    void name() {
        session = HibernateUtility.getSessionFactory().openSession();
        System.out.println("Session: " + session);

        ArrayList<Kisi> kisiArrayList = (ArrayList<Kisi>) selectKisiList();
        for (Kisi kisi: kisiArrayList){
            System.out.println("Kişi: " + kisi);
        }
    }

    private List<Kisi> selectKisiList(){
        // FROM ClassName
        return session.createQuery("SELECT entity FROM Kisi entity").list();
    }
}
