package coms.CricApp.service;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import coms.CricApp.entity.Cricket;

@Service
public class CricServiceImpl implements CricService {

	@Autowired
	JdbcTemplate jt;

	@Override
	public String AddCricketer(Cricket ci) {
		String inscmd = "insert into Cricket(cricname, cricphoto, cfilename) values(?,?,?)";		
		int r = jt.update(inscmd, new Object[] {ci.getCricname(), ci.getCricphoto(), ci.getCfilename()});
		if(r!=0)
			return "Added";
		else
			return "Not Added";
	}

	@Override
	public List<Cricket> getAllCricketers() {
		 String sql = "SELECT * FROM Cricket";
	     List<Cricket> p = jt.query(sql, new BeanPropertyRowMapper(Cricket.class));
	     return p;
	}

	@Override
	public Blob getPhotoById(int id) {
		String query = "select cricphoto from Cricket where cno=?";

		@SuppressWarnings("deprecation")
		Blob photo = jt.queryForObject(query, new Object[] { id }, Blob.class);

		return photo;
	}
}
