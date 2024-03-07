import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { MyLmsService } from '../mylms.service';

@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent {
  
  forgotPasswordForm : FormGroup;
  otpNo: any;
  otpStatus: any;


  otpSubmitForm : FormGroup;
  clientOtpSubmit: any;

  // clientOtpEntered: any;
  // otpCheckMessage: any;

  constructor(formBuilder: FormBuilder, private service: MyLmsService) {
    this.forgotPasswordForm = formBuilder.group({
      recoveryEmailOrMobileNo : new FormControl()
    })

    this.otpSubmitForm = formBuilder.group({
      clientOtp : new FormControl()
    })
  }

  forgotPassword() {
    this.service.clientForgotPassword(this.forgotPasswordForm.get("recoveryEmailOrMobileNo").value).subscribe(
      r1 => {
        this.otpNo = r1.otpMessage;
        this.otpStatus = r1.otpStatus;
      }
    )
  }

  clientOtp() {
    this.service.clientOtp(this.otpSubmitForm.get("clientOtp").value).subscribe(
      r1 => {
        this.clientOtpSubmit = r1;
        console.log(r1);
        if(r1 == this.otpNo) {
          this.otpCheck();
        }
      }
    )
  }

  otpCheck() {
    document.getElementById('otpcheck').style.visibility = "visible";
  }
  


}


  // otpCheck(otp: string) {
  //   this.service.clientOtpCheck(otp).subscribe(
  //     r1 => {
  //       this.otpCheckMessage = r1;
  //     }
  //   )
  // }