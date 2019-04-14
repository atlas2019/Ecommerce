//import { Component,OnInit} from '@angular/core';
import simple from 'src/assets/simple.json';
//import { user } from './user.service';
import { Router } from '@angular/router';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Component, Input, Output, EventEmitter, OnInit } from '@angular/core';
import { Cartcall } from '../Cartcall.service';

@Component({
  selector: 'ex-root',
  templateUrl: './description.component.html',
  styleUrls: ['./description.component.css'],
  providers:[HttpClient,Cartcall]
})

export class descriptionComponent {
  temps:any={};
  data:any;
  ret: any;
  cartres: any;
  cartcreate: any={};
  addcart:any=[];

  @Input() childMessage: any;
  
   cart: any=[];

 constructor(private http: HttpClient, private router: Router,private api: Cartcall) {
    this.http.get<any>(this.ret)
       .subscribe(data => {
          console.log(data);
  console.log(this.data);
  this.ret=this.data;
          } );   
        }   

        next(){
          this.addcart={
            "userid":Number(localStorage.getItem("userid")),
            "product":[this.childMessage]

            
            };
        
         // this.addcart=this.childMessage;
        this.api.authenticate(this.addcart).subscribe(cart=>{
           this.cartres=cart;
           console.log(this.cart)
        });
      
   }
              // Routing Part for next component//
         //  next(){
         //    this.router.navigate(['./cart']);
         //  }
           checkout(){
              this.router.navigate(['./cart']);
           }
   ngOnInit():void {} 
  }
  

   

