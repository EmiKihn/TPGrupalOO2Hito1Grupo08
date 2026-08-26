package dao;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.HibernateException;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		try {
			if(sessionFactory==null) {
				StandardServiceRegistry strandardRegistry= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				
				Metadata metadata= new MetadataSources(strandardRegistry).getMetadataBuilder().build();
				sessionFactory= metadata.getSessionFactoryBuilder().build();
			}
		}catch(HibernateException he) {
			System.err.println("ERROR EN LA INICIALIZACION DE LA SESSION FACTORY"+ he);
			throw new ExceptionInInitializerError(he);
		}
		return sessionFactory;
	}
}
