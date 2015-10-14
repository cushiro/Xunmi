package Beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Baike {

	private int id;
	private String bkid;
	private String bktitle;
	private String bkpic;
	private String bktext;
	private Date bkdate;
	private String bkauthor;
	private String bklx;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBkid() {
		return bkid;
	}

	public void setBkid(String bkid) {
		this.bkid = bkid;
	}

	public String getBktitle() {
		return bktitle;
	}

	public void setBktitle(String bktitle) {
		this.bktitle = bktitle;
	}

	public String getBkpic() {
		return bkpic;
	}

	public void setBkpic(String bkpic) {
		this.bkpic = bkpic;
	}

	public String getBktext() {
		return bktext;
	}

	public void setBktext(String bktext) {
		this.bktext = bktext;
	}

	public Date getBkdate() {
		return bkdate;
	}

	public void setBkdate(Date bkdate) {
		this.bkdate = bkdate;
	}

	public String getBkauthor() {
		return bkauthor;
	}

	public void setBkauthor(String bkauthor) {
		this.bkauthor = bkauthor;
	}

	public String getBklx() {
		return bklx;
	}

	public void setBklx(String bklx) {
		this.bklx = bklx;
	}

	private String bkdateFormat;

	public String getBkdateFormat(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(bkdate);
	}
	
}
