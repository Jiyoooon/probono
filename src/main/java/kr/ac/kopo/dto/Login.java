package kr.ac.kopo.dto;

public class Login {
	private String id;
	private String pwd;
	public Login(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	Login(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
