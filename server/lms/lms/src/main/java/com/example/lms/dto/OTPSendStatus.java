package com.example.lms.dto;

public class OTPSendStatus {
	private String otpMessage;
	private Boolean otpStatus;
	
	
	public String getOtpMessage() {
		return otpMessage;
	}
	public void setOtpMessage(String otpMessage) {
		this.otpMessage = otpMessage;
	}
	public Boolean getOtpStatus() {
		return otpStatus;
	}
	public void setOtpStatus(Boolean otpStatus) {
		this.otpStatus = otpStatus;
	}
	
}
