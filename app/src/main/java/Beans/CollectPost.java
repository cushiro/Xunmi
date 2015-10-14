package Beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CollectPost {

	private int id;
	private String uid;
	private String scpid;
	private String anthorid;
	private Date fabudate;
	private String tietitle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getScpid() {
		return scpid;
	}

	public void setScpid(String scpid) {
		this.scpid = scpid;
	}

	public String getAnthorid() {
		return anthorid;
	}

	public void setAnthorid(String anthorid) {
		this.anthorid = anthorid;
	}

	public Date getFabudate() {
		return fabudate;
	}

	public void setFabudate(Date fabudate) {
		this.fabudate = fabudate;
	}

	public String getTietitle() {
		return tietitle;
	}

	public void setTietitle(String tietitle) {
		this.tietitle = tietitle;
	}

	private String fabudateFormat;

	public String getFabudateFormat(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(fabudate);
	}
	
}
