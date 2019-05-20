import { Component } from '@angular/core';
import {FormControl, FormGroupDirective, NgForm, Validators, FormGroup} from '@angular/forms';
import { APICall } from 'src/app/APICall.service';
import {ErrorStateMatcher} from '@angular/material/core';
import { Router } from '@angular/router';
export class MyErrorStateMatcher implements ErrorStateMatcher {
  isErrorState(control: FormControl | null, form: FormGroupDirective | NgForm | null): boolean {
    const isSubmitted = form && form.submitted;
    return !!(control && control.invalid && (control.dirty || control.touched || isSubmitted));
  }
}
@Component({
  selector: 'app1-root',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
 
})

export class LoginComponent {
  loginres :any = [];
  hide  =  true;
  data :any;
  logindisplay: any={};
  myForm : FormGroup;
    emailFormControl = new FormControl('', [Validators.required,Validators.email,]);
    matcher = new MyErrorStateMatcher();
    constructor( private router: Router){}//private api: APICall){ }

    login1(){
   
        this.router.navigate(['/product']);
     }
    
    }
   