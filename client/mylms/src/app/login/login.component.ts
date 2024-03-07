import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { MyLmsService } from '../mylms.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginForm: FormGroup;
  message: any;

  constructor(formBuilder: FormBuilder, private service: MyLmsService) {
    this.loginForm = formBuilder.group({
      email: new FormControl(),
      password: new FormControl()
    })
  }

  
  login() {
    var m: string = this.loginForm.get("email").value;
    var n: string = "lokeshcham0505@gmail.com";
    var o: string = this.loginForm.get("password").value;
    if((m == n) && (o == "14m221")) {
      this.service.adminLogin(this.loginForm.value).subscribe(
        r1 => {
          this.message = r1.message;
          console.log("admin login submit");
          console.log(r1);
          console.log(m);
          console.log(n);
        }
      )
      this.showdb();
    }
    else {
      this.service.clientLogin(this.loginForm.value).subscribe(
        r1 => {
          this.message = r1.message;
          console.log("client login submit");
          console.log(r1);
          console.log(this.message);
          if(this.message == "Client Login Successfull") {
            this.showdb();
          }
        }
      )
    }
  }

  showdb() {
    document.getElementById('dashboard').style.visibility = 'visible';
    document.getElementById('login').style.visibility = 'hidden';
    document.getElementById('signup').style.visibility = 'hidden';
    document.getElementById('logout').style.visibility = 'visible';
  }

  // fp() {
  //   this.router.navigateByUrl('app-forgot-password');
  // }
}

