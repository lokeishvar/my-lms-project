import { Component } from '@angular/core';
import { Package } from './package';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-packages',
  templateUrl: './packages.component.html',
  styleUrls: ['./packages.component.css']
})
export class PackagesComponent {
  packages : Package[];

  constructor(private http: HttpClient) {
    this.http.get<Package[]>("http://localhost:9090/package/get").subscribe(
      results => {
        this.packages = results;
      }
    );
  }

      

  courseContent() {
    document.getElementById("view").style.visibility = "visible";
  }
}
