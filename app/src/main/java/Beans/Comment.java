package Beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {

	private int id;
	private String pid;
	private int plts;
	private String pllr;
	private String plyhid;
	private Date pldate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getPlts() {
		return plts;
	}

	public void setPlts(int plts) {
		this.plts = plts;
	}

	public String getPllr() {
		return pllr;
	}

	public void setPllr(String pllr) {
		this.pllr = pllr;
	}

	public String getPlyhid() {
		return plyhid;
	}

	public void setPlyhid(String plyhid) {
		this.plyhid = plyhid;
	}

	public Date getPldate() {
		return pldate;
	}

	public void setPldate(Date pldate) {
		this.pldate = pldate;
	}

	private String pldateFormat;

	public String getPldateFormat(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(pldate);
	}
	
}
