package coms.CricApp.entity;
/*
 * Create table Cricket(cno int auto_increment primary key, 
cricname varchar(30), 
cricphoto  longblob, 
cfilename varchar(20));
 */
public class Cricket {
	private Integer cno;
	private String cricname;
	private byte[] cricphoto;
	private String cfilename;
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCricname() {
		return cricname;
	}
	public void setCricname(String cricname) {
		this.cricname = cricname;
	}
	public byte[] getCricphoto() {
		return cricphoto;
	}
	public void setCricphoto(byte[] cricphoto) {
		this.cricphoto = cricphoto;
	}
	public String getCfilename() {
		return cfilename;
	}
	public void setCfilename(String cfilename) {
		this.cfilename = cfilename;
	}
}
