package main.java.com.anncode.transportesspringhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import main.java.com.anncode.transportesspringhibernate.model.Camion;

public class CamionDAOImp implements CamionDAO {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCamion(Camion c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(c);
		
	}

	@Override
	public void updateCamion(Camion c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
	}

	@Override
	public List<Camion> listCamion() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Camion> camiones = session.createQuery("FROM Camion").list();
		return camiones;
	}

	@Override
	public Camion getCamionById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCamion(int id) {
		// TODO Auto-generated method stub
		
	}

}
