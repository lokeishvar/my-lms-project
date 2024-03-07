package com.example.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lms.dto.EmailVerificationStatus;
import com.example.lms.dto.LoginSuccessStatus;
import com.example.lms.dto.OTPCheckStatus;
import com.example.lms.dto.OTPSendStatus;
import com.example.lms.dto.PasswordResetStatus;
import com.example.lms.dto.SignupSuccessStatus;
import com.example.lms.entity.AppUser;
import com.example.lms.service.AppUserService;

@RestController
@RequestMapping("appuser")
@CrossOrigin
public class AppUserController {

	@Autowired
	private AppUserService appUserService;
	
	
	// signup
	@PostMapping("signup")
	public ResponseEntity<SignupSuccessStatus> save(@RequestBody AppUser appUser) throws Exception {
		return ResponseEntity.ok(appUserService.save(appUser));
	}
	
	@GetMapping("verifyMailId/{token}/{email}")
	public ResponseEntity<EmailVerificationStatus> verifyEmailId(@PathVariable String token, @PathVariable String email) {
		return ResponseEntity.ok(appUserService.verifyMailId(token, email));
	}
	
	
	
	// adminLogin
	@PostMapping("adminlogin")
	public ResponseEntity<LoginSuccessStatus> adminLogin(@RequestBody AppUser adminObject) {
		return ResponseEntity.ok(appUserService.adminLogin(adminObject));
	}
	
	// clientLogin
	@PostMapping("clientlogin")
	public ResponseEntity<LoginSuccessStatus> clientLogin(@RequestBody AppUser clientObject) {
		return ResponseEntity.ok(appUserService.clientLogin(clientObject));
	}
	
	// client forgot password
	@GetMapping("forgotpassword/{recoveryEmailOrMobileNo}")
	public ResponseEntity<OTPSendStatus> forgotPassword(@PathVariable String recoveryEmailOrMobileNo) throws Exception {
		System.out.println(recoveryEmailOrMobileNo);
		return ResponseEntity.ok(appUserService.forgotPassword(recoveryEmailOrMobileNo));
	}
	
	// client otp input and checked in client side
	@GetMapping("getClientOtp/{clientOtp}")
	public String getClientOtp(@PathVariable String clientOtp) {
		return clientOtp;
	}
	
	// otp check server
	@GetMapping("otpCheck/{otp}/{email}")
	public ResponseEntity<OTPCheckStatus> otpCheck(@PathVariable String otp, @PathVariable String email) {
		return ResponseEntity.ok(appUserService.otpCheck(otp, email));
	}
	
	
	// passwordreset
	@GetMapping("passwordreset/{clientEmail}/{newPassword1}/{newPassword2}")
	public ResponseEntity<PasswordResetStatus> passwordReset(@PathVariable String clientEmail, @PathVariable String newPassword1, @PathVariable String newPassword2) {
		return ResponseEntity.ok(appUserService.passwordReset(clientEmail, newPassword1, newPassword2));
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	