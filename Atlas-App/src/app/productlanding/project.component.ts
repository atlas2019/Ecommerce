import { Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs/Rx';
import { HttpClient } from '@angular/common/http';
import { Router } from "@angular/router";
//import simple2 from 'src/assets/simple2.json'
import { user } from '../user.service';
@Component({
  selector: 'project-root',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css'],
  providers:[HttpClient,user]
})
export class projectComponent implements OnInit 
 {  
  show :boolean;
  result:any;
  data:any=[];
  productdisplay:any=[];
  ret: any;
  productres: any;

 constructor(private http: HttpClient,private router: Router,private api:user)
  {}
    
   ngOnInit(){
    this.show=true;
    console.log("In Product Component");
    this.api.authenticate(this.data).subscribe(data=>{
        this.ret=data;
        console.log(this.ret);
      });
   }

foo(x){
  this.show=false;
  this.result=x;
}
}