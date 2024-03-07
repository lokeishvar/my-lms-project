import { Component } from '@angular/core';
import { Skill } from './skill';
import { MyLmsService } from '../mylms.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  skills: Skill[];
  constructor(private service: MyLmsService) {
    this.service.getSkills().subscribe(
      r1 => {
          this.skills = r1;
      }
    )
  }
}
