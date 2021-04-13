package kr.ac.kopo.vo;

public class LoginVO {
	private String userId, userPass;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	@Override
	public String toString() {
		return "LoginVO [userId=" + userId + ", userPass=" + userPass + "]";
	}
	
}
