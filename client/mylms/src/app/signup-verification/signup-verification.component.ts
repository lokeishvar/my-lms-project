import { Component } from '@angular/core';
import { MyLmsService } from '../mylms.service';

@Component({
  selector: 'app-signup-verification',
  templateUrl: './signup-verification.component.html',
  styleUrls: ['./signup-verification.component.css']
})
export class SignupVerificationComponent {

  signupVerificationMessage: any;

  constructor(private service: MyLmsService) {
    this.service.signupVerification().subscribe(
      r1 => {
        this.signupVerificationMessage = r1.message;
    }
    )
  }
}
