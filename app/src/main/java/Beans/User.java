package Beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

	private int id;
	private String uid;
	private String userpic;
	private String name;
	private String password;
	private String sex;
	private String tel;
	private String address;
	private String email;
	private Date birth;
	private String petpic;
	private String pettype;
	private String petzl;
	private String petsex;
	private Date petbirth;
	private String petlove;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUserpic() {
		return userpic;
	}
	public void setUserpic(String userpic) {
		this.userpic = userpic;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getPetpic() {
		return petpic;
	}
	public void setPetpic(String petpic) {
		this.petpic = petpic;
	}
	public String getPettype() {
		return pettype;
	}
	public void setPettype(String pettype) {
		this.pettype = pettype;
	}
	public String getPetzl() {
		return petzl;
	}
	public void setPetzl(String petzl) {
		this.petzl = petzl;
	}
	public String getPetsex() {
		return petsex;
	}
	public void setPetsex(String petsex) {
		this.petsex = petsex;
	}
	public Date getPetbirth() {
		return petbirth;
	}
	public void setPetbirth(Date petbirth) {
		this.petbirth = petbirth;
	}
	public String getPetlove() {
		return petlove;
	}
	public void setPetlove(String petlove) {
		this.petlove = petlove;
	}
	
	private String birthFormat;

	public String getBirthFormat(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(birth);
	}
	private String petbirthFormat;

	public String getPetbirthFormat(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(petbirth);
	}
	
}
