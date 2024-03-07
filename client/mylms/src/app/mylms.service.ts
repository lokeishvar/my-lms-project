import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core'
;
import { Skill } from './dashboard/skill';

@Injectable({
  providedIn: 'root'
})
export class MyLmsService {
  url : string="http://localhost:9090";
  

  constructor(private http: HttpClient) { }

    signup(appUser: any) {
        return this.http.post<any>(this.url + "/appuser/signup", appUser);
    }

    signupVerification() {
        return this.http.get<any>(this.url + "/appuser/verifyMailId");
    }

    adminLogin(appUser: any) {
        return this.http.post<any>(this.url + "/appuser/adminlogin", appUser);
    }

    clientLogin(appUser: any) {
        return this.http.post<any>(this.url + "/appuser/clientlogin", appUser);
    }

    getSkills() {
        return this.http.get<Skill[]>(this.url + "/skill/getall");
    }

    clientForgotPassword(recoveryEmailOrMobileNo: any) {
        return this.http.get<any>(this.url + "/appuser/forgotpassword/" + recoveryEmailOrMobileNo);
    }

    clientOtp(clientOtp: any) {
        return this.http.get<any>(this.url + "/appuser/getClientOtp/" + clientOtp);
    }

    passwordReset(clientEmail: any, newPassword1: any, newPassword2: any) {
        return this.http.get<any>(this.url + "/appuser/passwordreset/" + clientEmail + "/" + newPassword1 + "/" + newPassword2);
    }

    

}