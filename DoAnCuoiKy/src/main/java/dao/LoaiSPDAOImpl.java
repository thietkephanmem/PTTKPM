package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import model.LoaiSPDTO;
@Transactional

public class LoaiSPDAOImpl implements LoaiSPDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<LoaiSPDTO> getALL() {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			

			Query q = session.createQuery("select e from loaisanpham e");
			List<LoaiSPDTO> li = q.list();

			session.getTransaction().commit();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

}
