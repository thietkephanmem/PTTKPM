package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import model.NguoiDungDTO;
@Transactional

public class NguoiDungDaoImpl implements NguoiDungDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public NguoiDungDTO findById(NguoiDungDTO nd) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			String user1 =  nd.getUser();
			String pass1 = nd.getPass();
			Query q = session.createQuery("select e from nguoidung e where e.user = ? AND e.password = ?");
			q.setString(0, user1);
			q.setString(1, pass1);

//			q.setMaxResults(1);
			
			List<NguoiDungDTO> li = q.list();
			

			session.getTransaction().commit();
			return li.get(0);
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return new NguoiDungDTO();
		}
	}

	@Override
	public void create(NguoiDungDTO nd) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
		
			session.saveOrUpdate(nd);

			session.getTransaction().commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		
		}
		
	}

}
