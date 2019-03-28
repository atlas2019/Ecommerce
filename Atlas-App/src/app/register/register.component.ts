
//This is Register Component, which acts as Parent Component 

import { Component } from '@angular/core';
import { APICall } from 'src/app/APICall.service';
import { Router } from '@angular/router';

@Component({
  selector: 'reg-root',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
  providers: [APICall]
})
export class registerComponent {

  data: any;
  registerdisplay: any={};  //display all the details registerd, on console
  registerres: number;  //for login response [0/1]

  //Provides labels for creating forms

  fields = [{
    "type": "text",
    "name": "FirstName",
    "label": "FirstName",
    "value": " ",
    "required": true,
  },
  {
    "type": "text",
    "name": "LastName",
    "label": "LastName",
    "value": " ",
    "required": true,
  },
  {
    "type": "text",
    "name": "password",
    "label": "Password",
    "value": " ",
    "required": true,
  },
  {
    "type": "text",
    "name": "Email",
    "label": "Email",
    "value": " ",
    "required": true,
  },
  {
    "type": "text",
    "name": "Address",
    "label": "Address",
    "value": " ",
    "required": true,
  }
  ];


  //This is for calling service API
  constructor(private api: APICall,private router: Router) { }

  //Recieve event is defined here in Parent 
  receiveregisterdata($event) {
    this.data = $event;

    this.registerdisplay = {
      "Firstname": this.data[0].value,
      "Lastname": this.data[1].value,
      "Password": this.data[2].value,
      "Email": this.data[3].value,
      "Address": this.data[4].value
    }

    this.registerres = 1;

    //routes the collected response to respective page 
    if (this.registerres == 0) {
      this.router.navigate(['/register']);
    }
    else {
      this.router.navigate(['/product']);
    }
  }


}



