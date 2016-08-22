package ateam.model;

import java.sql.Date;

public class Bihin {
	private String bihinID;
	private String bihinName;
	private String bihinKana;
	private int status;
	private String userID;
	private Date returnDay;

	public String getBihinID() {
		return bihinID;
	}

	public void setBihinID(String bihinID) {
		this.bihinID = bihinID;
	}

	public String getBihinName() {
		return bihinName;
	}

	public void setBihinName(String bihinName) {
		this.bihinName = bihinName;
	}

	public String getBihinKana() {
		return bihinKana;
	}

	public void setBihinKana(String bihinKana) {
		this.bihinKana = bihinKana;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public Date getReturnDay() {
		return returnDay;
	}

	public void setReturnDay(Date returnDay) {
		this.returnDay = returnDay;
	}
}
