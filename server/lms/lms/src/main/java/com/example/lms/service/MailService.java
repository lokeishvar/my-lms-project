package com.example.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {

	@Autowired(required = true)
	private JavaMailSender javaMailSender;
	
	public String sendMailToVerifyEmailId(String token, String email) throws Exception {
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime, true);
		helper.setTo(email);
		helper.setSubject("Subject: Verify your email");
		StringBuffer sb = new StringBuffer();
		sb.append("<a href='http://localhost:9090/appuser/verifyMailId/");  // method
		sb.append(token + "/" + email + "'>Verify Email Address</a>");
		helper.setText(sb.toString(), true);  
		javaMailSender.send(mime);
		return "mail sent successfully";
	}
	
	public String sendMailForForgottenPassword(String generatedOtp, String email) throws Exception {
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime, true);
		helper.setTo(email);
		helper.setSubject("Subject: OTP");
		StringBuffer sb = new StringBuffer();
		sb.append("<a href='http://localhost:9090/appuser/otpCheck/");
		sb.append(generatedOtp + "/" + email + "'>Verify OTP: " + generatedOtp + "</a>");
		helper.setText(sb.toString(), true);
		javaMailSender.send(mime);
		return "OTP has sent to your recovery emailId";
	}
}
