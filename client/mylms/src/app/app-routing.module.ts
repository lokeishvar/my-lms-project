import { NgModule } from '@angular/core';
import { RouterModule, Routes, UrlSegment } from '@angular/router';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { CreateNewPasswordComponent } from './create-new-password/create-new-password.component';

const routes: Routes = [
  {
    path: "",
    component: HomeComponent
  },
  {
    path: "app-home",
    component: HomeComponent
  },
  {
    path : "app-signup",
    component: SignupComponent
  },
  {
    path : "app-login",
    component: LoginComponent
  },
  {
    path : "app-dashboard",
    component: DashboardComponent
  },
  {
    path : "app-forgot-password",
    component: ForgotPasswordComponent
  },
  {
    path : "app-create-new-password",
    component: CreateNewPasswordComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
