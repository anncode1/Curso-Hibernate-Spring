package main.java.com.anncode.transportesspringhibernate.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import main.java.com.anncode.transportesspringhibernate.dao.CamionDAO;
import main.java.com.anncode.transportesspringhibernate.model.Camion;

public class CamionServiceImp implements CamionService {
	
	private CamionDAO camionDAO;
	public void setCamionDAO(CamionDAO camionDAO) {
		this.camionDAO = camionDAO;
	}

	@Override
	@Transactional
	public void addCamion(Camion c) {
		// TODO Auto-generated method stub
		this.camionDAO.addCamion(c);
		
	}

	@Override
	@Transactional
	public void updateCamion(Camion c) {
		// TODO Auto-generated method stub
		this.camionDAO.updateCamion(c);
	}

	@Override
	@Transactional
	public List<Camion> listCamion() {
		// TODO Auto-generated method stub
		return this.camionDAO.listCamion();
	}

	@Override
	@Transactional
	public Camion getCamionById(int id) {
		// TODO Auto-generated method stub
		return this.camionDAO.getCamionById(id);
	}

	@Override
	@Transactional
	public void removeCamion(int id) {
		// TODO Auto-generated method stub
		this.camionDAO.removeCamion(id);
	}

}
