package pl.sda.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pl.sda.inheritance.model.FourWheeler;
import pl.sda.inheritance.model.TwoWheeler;
import pl.sda.inheritance.model.Vehicle;

/**
 * Created by Adrian on 26.07.2017.
 */
public class Main {
    public static void main(String... args) {
        SessionFactory instance = HibernateConfig.getInstance();
        Session session = instance.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Vehicle vehicle = new Vehicle();
            vehicle.setName("name");
            session.save(vehicle);
            TwoWheeler twoWheeler = new TwoWheeler();
            twoWheeler.setSteeringType("trzymaczka");
            session.save(twoWheeler);
            FourWheeler fourWheeler = new FourWheeler();
            fourWheeler.setSteeringType("Kółko");
            session.save(fourWheeler);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            instance.close();
        }
    }
}
