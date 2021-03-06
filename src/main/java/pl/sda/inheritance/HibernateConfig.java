package pl.sda.inheritance;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import pl.sda.inheritance.model.FourWheeler;
import pl.sda.inheritance.model.TwoWheeler;
import pl.sda.inheritance.model.Vehicle;

import javax.imageio.spi.ServiceRegistry;

/**
 * Created by Adrian on 26.07.2017.
 */
public class HibernateConfig {
    private static SessionFactory sessionFactory;

    public static SessionFactory getInstance() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Vehicle.class);
            configuration.addAnnotatedClass(TwoWheeler.class);
            configuration.addAnnotatedClass(FourWheeler.class);
            configuration.configure();
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
