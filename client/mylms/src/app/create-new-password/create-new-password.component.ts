import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { MyLmsService } from '../mylms.service';

@Component({
  selector: 'app-create-new-password',
  templateUrl: './create-new-password.component.html',
  styleUrls: ['./create-new-password.component.css']
})
export class CreateNewPasswordComponent {

  passwordChangeForm: FormGroup;
  message : any;

  constructor(private formBuilder: FormBuilder, private service: MyLmsService) {
    this.passwordChangeForm = formBuilder.group({
      clientEmail : new FormControl(),
      newPassword1: new FormControl(),
      newPassword2: new FormControl()
    })
  }

  passwordReset() {
    this.service.passwordReset(this.passwordChangeForm.get('clientEmail').value, this.passwordChangeForm.get('newPassword1').value, this.passwordChangeForm.get('newPassword2').value).subscribe(
      r1 => {
        this.message = r1.passwordResetMessage;
      }
    )
  }
}
