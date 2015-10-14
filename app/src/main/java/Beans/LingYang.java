package Beans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LingYang {

	private int id;
	private String uid;
	private String postlyid;
	private String posttitle;
	private String postpic;
	private String posttext;
	private Date postdate;
	private int postcmsl;
	private int postgksl;
	private String cwtype;
	private String dizhi;
	private ArrayList<LingYang> lingYanglist;

	public ArrayList<LingYang> getLingYanglist() {
		return lingYanglist;
	}

	public void setLingYanglist(ArrayList<LingYang> lingYanglist) {
		this.lingYanglist = lingYanglist;
	}


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

	public String getPostlyid() {
		return postlyid;
	}

	public void setPostlyid(String postlyid) {
		this.postlyid = postlyid;
	}

	public String getPosttitle() {
		return posttitle;
	}

	public void setPosttitle(String posttitle) {
		this.posttitle = posttitle;
	}

	public String getPostpic() {
		return postpic;
	}

	public void setPostpic(String postpic) {
		this.postpic = postpic;
	}

	public String getPosttext() {
		return posttext;
	}

	public void setPosttext(String posttext) {
		this.posttext = posttext;
	}

	public Date getPostdate() {
		return postdate;
	}

	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}

	public int getPostcmsl() {
		return postcmsl;
	}

	public void setPostcmsl(int postcmsl) {
		this.postcmsl = postcmsl;
	}

	public int getPostgksl() {
		return postgksl;
	}

	public void setPostgksl(int postgksl) {
		this.postgksl = postgksl;
	}

	public String getCwtype() {
		return cwtype;
	}

	public void setCwtype(String cwtype) {
		this.cwtype = cwtype;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	private String postDateFormat;

	public String getPostDateFormat(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(postdate);
	}
	
}
