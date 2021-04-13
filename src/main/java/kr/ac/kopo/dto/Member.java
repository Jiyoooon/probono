package kr.ac.kopo.dto;

import java.sql.Date;

public class Member {
	private int mid;
	private String name;
	private String id;
	private String password;
	private String phone;
	private String address;
	private String identification;
	private Date created_at;
	private Date updated_at;
	
	public Member() {}

	public Member(int mid, String name, String id, String password, String phone, String address, String identification,
			Date created_at, Date updated_at) {
		super();
		this.mid = mid;
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.identification = identification;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone
				+ ", address=" + address + ", identification=" + identification + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
	
}
