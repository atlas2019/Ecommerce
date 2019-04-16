import { Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs/Rx';
import { HttpClient } from '@angular/common/http';
import { Router } from "@angular/router";
//import simple2 from 'src/assets/simple2.json'
import { fetch } from '../fetch.service';

@Component({
  selector: 'order-root',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css'],
  providers:[HttpClient,fetch]
})
export class orderComponent implements OnInit 
 {  
  // result:any;
  data:any=[];           
  orderdisplay:any={};   //displays the orders of particular user
  ret: any;              //stores the value of apicall

 constructor(private http: HttpClient,private router: Router,private api:fetch)
  {}
    
   ngOnInit(){
     this.orderdisplay={
       //"userid":Number(localStorage.getItem("userid")),
       "token":Number(localStorage.getItem("token")),
     }
    console.log("In order Component");
    this.api.authenticate(this.orderdisplay).subscribe(data=>{
        this.ret=data;
        console.log(this.ret);
      });
   }
}