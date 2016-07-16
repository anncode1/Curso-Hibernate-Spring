package main.java.com.anncode.transportesspringhibernate.dao;

import java.util.List;

import main.java.com.anncode.transportesspringhibernate.model.Camion;

public interface CamionDAO {
	public void addCamion(Camion c);
	public void updateCamion(Camion c);
	public List<Camion> listCamion();
	public Camion getCamionById(int id);
	public void removeCamion(int id);
}
