import { Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs/Rx';
import { HttpClient } from '@angular/common/http';
import { Router } from "@angular/router";
import { user } from '../user.service';

@Component({
  selector: 'project-root',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css'],
  providers:[HttpClient,user]
})
export class projectComponent implements OnInit 
 {  
  show :boolean;    //initisalising value to pass the value to product description  
  result:any;
  data:any={};
  productdisplay:any=[];  //calls api and displays the product details
  productres: any;        //stores the response value

 constructor(private http: HttpClient,private router: Router,private api:user)
  {}
    
   ngOnInit(){
    this.show=true;
    console.log("In Product Component");
    this.api.authenticate(this.data).subscribe(data=>{
        this.productres=data;
        console.log(this.productres);
       // console.log("in productlanding")
      });
   }

   // exceutes on, click() which then routes to product description page
product(x){
  this.show=false;
  this.result=x;    
}
}