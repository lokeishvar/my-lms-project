import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeadernavComponent } from './headernav/headernav.component';
import { NumbersComponent } from './numbers/numbers.component';
import { AboutComponent } from './about/about.component';
import { AboutcontentComponent } from './aboutcontent/aboutcontent.component';
import { PackagesComponent } from './packages/packages.component';
import { HttpClientModule } from '@angular/common/http';
import { CoursecontentComponent } from './coursecontent/coursecontent.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { CreateNewPasswordComponent } from './create-new-password/create-new-password.component';
import { SignupVerificationComponent } from './signup-verification/signup-verification.component';

@NgModule({
  declarations: [
    AppComponent,
    HeadernavComponent,
    NumbersComponent,
    AboutComponent,
    AboutcontentComponent,
    PackagesComponent,
    CoursecontentComponent,
    SignupComponent,
    LoginComponent,
    HomeComponent,
    FooterComponent,
    DashboardComponent,
    ForgotPasswordComponent,
    CreateNewPasswordComponent,
    SignupVerificationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
  
 }
