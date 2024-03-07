import { Component } from '@angular/core';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-headernav',
  templateUrl: './headernav.component.html',
  styleUrls: ['./headernav.component.css']
})
export class HeadernavComponent {
  logout() {
    document.getElementById('logout').style.visibility = "hidden";
    document.getElementById('dashboard').style.visibility = "hidden";
    document.getElementById('login').style.visibility = "visible";
    document.getElementById('signup').style.visibility = "visible";
  }
}
