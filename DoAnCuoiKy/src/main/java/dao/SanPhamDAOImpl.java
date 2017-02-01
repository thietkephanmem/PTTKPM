package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import model.SanPhamDTO;

@Transactional
public class SanPhamDAOImpl implements SanPhamDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<SanPhamDTO> getAllSanPham() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {

			Query q = session.createQuery("select e from sanpham e ORDER BY e.ngay_nhap DESC");
			q.setFirstResult(0);
			q.setMaxResults(10);
			List<SanPhamDTO> li = q.list();

			session.getTransaction().commit();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

	@Override
	public void createSanPham(SanPhamDTO sp) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			System.out.println("hien thi xem: "+ sp);
			session.saveOrUpdate(sp);

			session.getTransaction().commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		
		}
		
	}

	@Override
	public SanPhamDTO findSPById(SanPhamDTO id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Integer idsp =  id.getMa_sp();
			Query q = session.createQuery("select e from sanpham e where e.ma_sp = ?");
			q.setInteger(0, idsp);
			q.setMaxResults(1);
			
			List<SanPhamDTO> li = q.list();
			

			session.getTransaction().commit();
			return li.get(0);
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

	@Override
	public List<SanPhamDTO> getListSanPham() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {

			Query q = session.createQuery("select e from sanpham e ORDER BY e.ngay_nhap DESC");
			
			List<SanPhamDTO> li = q.list();

			session.getTransaction().commit();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

}
