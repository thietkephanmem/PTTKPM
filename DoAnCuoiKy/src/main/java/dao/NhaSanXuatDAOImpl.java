package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import model.NhaSanXuatDTO;

@Transactional
public class NhaSanXuatDAOImpl implements NhaSanXuatDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<NhaSanXuatDTO> getAll() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			

			Query q = session.createQuery("select e from nhasanxuat e");
			List<NhaSanXuatDTO> li = q.list();

			session.getTransaction().commit();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

	@Override
	public void deletensx(NhaSanXuatDTO nsx) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
		
			session.delete(nsx);

			session.getTransaction().commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		
		}
		
	}

	@Override
	public void createNSX(NhaSanXuatDTO nsx) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
		
			session.saveOrUpdate(nsx);

			session.getTransaction().commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		
		}
		
	}

}
