package com.example.lms.dto;

public class PasswordResetStatus {
	private String passwordResetMessage;
	private Boolean passwordResetStatus;
	
	public String getPasswordResetMessage() {
		return passwordResetMessage;
	}
	public void setPasswordResetMessage(String passwordResetMessage) {
		this.passwordResetMessage = passwordResetMessage;
	}
	public Boolean getPasswordResetStatus() {
		return passwordResetStatus;
	}
	public void setPasswordResetStatus(Boolean passwordResetStatus) {
		this.passwordResetStatus = passwordResetStatus;
	}
	
}
