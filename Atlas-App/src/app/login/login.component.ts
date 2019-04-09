
//This is Login Component, which acts as Parent Component 


import { Component, OnInit } from '@angular/core';
import { APICall } from 'src/app/APICall.service';
import { Router } from "@angular/router";

@Component({
  selector: 'login-root',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [APICall]
})
export class loginComponent implements OnInit {
  data: any; 
  logindisplay: any={}; //display the username and passsword in console 
  loginres: any; //for login response [0/1]

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


  ngOnInit(){
  
    }

  //Recieve event is defined here in Parent 
  receivelogindata($event) {
    this.data = $event;

    this.logindisplay = {
      "username": this.data[0].value.trim(),
      "password": this.data[1].value.trim()
    }
    this.api.authenticate(this.logindisplay).subscribe(data=>{
      this.loginres=data;
      //console.log(this.data);
      //console.log(this.loginres);
      if (this.loginres > 0) {
        this.router.navigate(['/project']);
      }
      else {
        this.router.navigate(['/login']);
      }
    })
   
  }




}



