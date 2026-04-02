package coms.CricApp.service;

import java.sql.Blob;
import java.util.List;

import coms.CricApp.entity.Cricket;

public interface CricService {

	public String AddCricketer(Cricket ci);
	public List<Cricket > getAllCricketers();
	public Blob getPhotoById(int id);

}
