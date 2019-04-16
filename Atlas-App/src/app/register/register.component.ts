
//This is Register Component, which acts as Parent Component 

import { Component, OnInit } from '@angular/core';
import { APICall } from 'src/app/APICall.service';
import { Router } from '@angular/router';
import { REGCall } from 'src/REGCall.service';

@Component({
  selector: 'reg-root',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
  providers: [REGCall]
})
export class registerComponent implements OnInit  {

  data: any;
  registerdisplay: any={};  //display all the details registerd, on console
  registerres: any;  //for login response [0/1]
  actionMessage="Register";
  //Provides labels for creating forms

  fields = [{
    "type": "text",
    "name": "firstName",
    "label": "firstName",
    "value": " ",
    "required": true,
  },
  {
    "type": "text",
    "name": "lastName",
    "label": "lastName",
    "value": " ",
    "required": true,
  },
  {
    "type": "text",
    "name": "password",
    "label": "password",
    "value": " ",
    "required": true,
  },
  // {
  //   "type": "text",
  //   "name": "password",
  //   "label": "Confirm Password",
  //   "value": " ",
  //   "required": true,
  // },
  {
    "type": "text",
    "name": "email",
    "label": "email",
    "value": " ",
    "required": true,
  }
  
  ];


  //This is for calling service API
  constructor(private api: REGCall,private router: Router) { }

  ngOnInit(){}


  //Recieve event is defined here in Parent 
  receiveregisterdata($event) {
    this.data = $event;

    this.registerdisplay = {
      "firstname": this.data[0].value,
      "lastname": this.data[1].value,
      "password": this.data[2].value,
      // "Confirm Password": this.data[3].value,
      "email": this.data[3].value
      
    }

   
    //this.registerres = 1;

    //routes the collected response to respective page
    console.log(this.registerdisplay); 
    this.api.create(this.registerdisplay).subscribe(data=>{
      this.registerres=data;
    if (this.registerres == 0) {
      this.router.navigate(['/register']);
    }
    else {
      this.router.navigate(['/project']);
    }
  });
    }
}

