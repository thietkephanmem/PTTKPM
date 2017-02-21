package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import model.TaiXeDTO;

@Transactional
public class TaiXeDAOImpl implements TaiXeDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<TaiXeDTO> getAllTX() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {

			Query q = session.createQuery("select e from taixe e");
			
			List<TaiXeDTO> li = q.list();

			session.getTransaction().commit();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

	@Override
	public void createTaiXe(TaiXeDTO sp) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
		
			session.saveOrUpdate(sp);

			session.getTransaction().commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		
		}
	
		
	}

//	@Override
//	public void createSanPham(SanPhamDTO sp) {
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		
//			System.out.println("hien thi xem: "+ sp);
//			session.saveOrUpdate(sp);
//
//			session.getTransaction().commit();
//		
//		
//		
//	}
//
//	@Override
//	public SanPhamDTO findSPById(SanPhamDTO id) {
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		try {
//			Integer idsp =  id.getMa_sp();
//			Query q = session.createQuery("select e from sanpham e where e.ma_sp = ?");
//			q.setInteger(0, idsp);
//			q.setMaxResults(1);
//			
//			List<SanPhamDTO> li = q.list();
//			
//
//			session.getTransaction().commit();
//			return li.get(0);
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return null;
//		}
//	}
//
//	@Override
//	public List<SanPhamDTO> getListSanPham() {
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		try {
//
//			Query q = session.createQuery("select e from sanpham e ORDER BY e.ngay_nhap DESC");
//			
//			List<SanPhamDTO> li = q.list();
//
//			session.getTransaction().commit();
//			return li;
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return null;
//		}
//	}
//
//	@Override
//	public List<SanPhamDTO> getSanPhamDanhMuc(SanPhamDTO sp) {
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		try {
//			Integer idsp =  sp.getMa_loai().getMa_loai_sp();
//			Query q = session.createQuery("select e from sanpham e where e.ma_loai = ?");
//			q.setInteger(0, idsp);
//		
//			
//			List<SanPhamDTO> li = q.list();
//			
//
//			session.getTransaction().commit();
//			return li;
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return null;
//		}
//	}
//
//	@Override
//	public void delete(SanPhamDTO sp) {
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		try {
//		
//			session.delete(sp);
//
//			session.getTransaction().commit();
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//		
//		}
//		
//	}

	

}
