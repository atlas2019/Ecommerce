
//This is Login Component, which acts as Parent Component 


import { Component } from '@angular/core';
import { APICall } from 'src/app/APICall.service';
import { Router } from "@angular/router";

@Component({
  selector: 'login-root',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [APICall]
})
export class loginComponent {
  data: any; 
  logindisplay: any={}; //display the username and passsword in console 
  loginres: number; //for login response [0/1]

  //Provides labels for creating forms

  labels = [{
    "type": "text",
    "name": "userName",
    "label": "Username",
    "value": " ",
    "required": true,
  },
  {
    "type": "text",
    "name": "password",
    "label": "Password",
    "value": " ",
    "required": true,
  }];

  //This is for calling service API
  constructor(private api: APICall, private router: Router) { }

  //Recieve event is defined here in Parent 
  receivelogindata($event) {
    this.data = $event;

    this.logindisplay = {
      "username": this.data[0].value,
      "password": this.data[1].value
    }

    //this.ret=this.api.getLogin(this.dataapi);
    this.loginres = 1;

    if (this.loginres == 0) {
      this.router.navigate(['/login']);
    }
    else {
      this.router.navigate(['/product']);
    }
  }




}

