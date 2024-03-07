import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { MyLmsService } from '../mylms.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

  signupForm: FormGroup;
  message: any;

  constructor(formBuilder: FormBuilder, private service: MyLmsService) {
    this.signupForm = formBuilder.group({
      firstName: new FormControl(),
      email: new FormControl(),
      password: new FormControl()
    })
  }

  signup() {
    this.service.signup(this.signupForm.value).subscribe(
      r1 => {
        this.message = r1.message;
        console.log("sign up form submited");
      }
    )
  }
  

}
