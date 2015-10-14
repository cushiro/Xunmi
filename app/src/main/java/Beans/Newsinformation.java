package Beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Newsinformation {

	private int id;
	private String infortype;
	private String inforid;
	private String infortitle;
	private String inforpic;
	private Date infordate;
	private String infortext;
	private String inforauthor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfortype() {
		return infortype;
	}
	public void setInfortype(String infortype) {
		this.infortype = infortype;
	}
	public String getInforid() {
		return inforid;
	}
	public void setInforid(String inforid) {
		this.inforid = inforid;
	}
	public String getInfortitle() {
		return infortitle;
	}
	public void setInfortitle(String infortitle) {
		this.infortitle = infortitle;
	}
	public String getInforpic() {
		return inforpic;
	}
	public void setInforpic(String inforpic) {
		this.inforpic = inforpic;
	}
	public Date getInfordate() {
		return infordate;
	}
	public void setInfordate(Date infordate) {
		this.infordate = infordate;
	}
	public String getInfortext() {
		return infortext;
	}
	public void setInfortext(String infortext) {
		this.infortext = infortext;
	}
	public String getInforauthor() {
		return inforauthor;
	}
	public void setInforauthor(String inforauthor) {
		this.inforauthor = inforauthor;
	}
	
	private String infordateFormat;

	public String getInfordateFormat(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(infordate);
	}
}
