import {Component, OnInit } from '@angular/core';
import {FormControl, FormGroupDirective, NgForm, Validators, FormGroup, FormBuilder} from '@angular/forms';
import {ErrorStateMatcher} from '@angular/material/core';
 export class MyErrorStateMatcher implements ErrorStateMatcher {
 isErrorState(control: FormControl | null, form: FormGroupDirective | NgForm | null): 
   boolean {
     const isSubmitted = form && form.submitted;
      return !!(control && control.invalid && (control.dirty || control.touched || isSubmitted));

    const invalidCtrl = !!(control && control.invalid && control.parent.dirty);
    const invalidParent = !!(control && control.parent && control.parent.invalid && control.parent.dirty);

    return (invalidCtrl || invalidParent);
  }
}
@Component({
  selector: 'app2-root',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class registerComponent {
   myForm : FormGroup;
  title = 'EApp';
   hide  =  true;
  hide1 = true;
    emailFormControl = new FormControl('', [Validators.required,Validators.email,]);
    matcher = new MyErrorStateMatcher();

    constructor(private formBuilder: FormBuilder) {
      this.myForm = this.formBuilder.group({
        password: ['', [Validators.required]],
        confirmPassword: ['']
      }, { validator: this.checkPasswords });
  
    }
  
    checkPasswords(group: FormGroup) { // here we have the 'passwords' group
      let pass = group.controls.password.value;
      let confirmPass = group.controls.confirmPassword.value;
  
      return pass === confirmPass ? null : { notSame: true }
    }
}
