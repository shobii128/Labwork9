package pk.edu.nust.seecs.gradebook.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    /**
     * Shared session factory. It is used to create new communication
     * sessions with the database, and is lazy initialized when a new
     * session is requested for the first time.
     *
     * @see SessionFactory
     */
    private static SessionFactory sessionFactory;

    /**
     * Returns the session factory.
     *
     * @return an instance of session factory
     * @see Session
     */
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            createSessionFactory();
        }

        return sessionFactory;
    }

    /**
     * Configures the connection of Hibernate API to physical storage and
     * initializes the shared instance of the SessionFactory.
     *
     * @see SessionFactory
     */
    private static void createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();

        sessionFactory = configuration.buildSessionFactory();
    }

}
