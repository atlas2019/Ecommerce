import { Component, OnInit } from '@angular/core';
//import { APICall } from 'src/app/APICall.service';
//import { Router } from "@angular/router";
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs/Rx';
import corder from 'src/assets/corder.json'
import {CROrder} from 'src/CROrder.service';
import { Router } from '@angular/router';
import { FetchCall } from '../Fetchcall.service';



@Component({
  selector: 'check-root',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css'],
  providers: [HttpClient,CROrder,FetchCall]
})
export class checkoutComponent implements OnInit {
  data:any={};
  createorder:any={};  //creates the order for particular user 
  orderres: any;       //stores respone of order created
  cartres:any=[];    //contains result of the fetchcart 
  cartdisplay: any;    //displays the cart information
  Name:any;
  MobileNo: any;
  ZipCode: any;
  Locality: any;
  Address: any;
  City: any;
  State: any;
  CoD: any;
  product:any=[];
  num=0;

  constructor(private http: HttpClient,private router: Router,private api:CROrder,private xj:FetchCall) {}
  
  //loads the fetchcart,which is to display the elements in oder summary 
    ngOnInit() {
      // console.log("In Checkout Component");
      this.cartdisplay={
        "userid":Number(localStorage.getItem("userid"))
     };
      this.xj.authenticate(this.cartdisplay).subscribe(data=>{
        this.cartres=data;
        this.cartres=this.cartres;
         console.log(this.cartres);
        });
     
    }

    //function creates a order for user when confirmed 
    order(){

      for(let i of this.cartres ){

this.product[this.num]=i.product[0];
this.num++;
      }

     // console.log(this.Name);
      this.createorder={
         "userid":Number(localStorage.getItem("userid")),
         "product":this.product,
         "address":{
                    "name":this.Name,
                    "mobile-no":this.MobileNo,
                    "zipcode": this.ZipCode,
                    "locality":this.Locality,
                    "address":this.Address,
                    "city":this.City,
                    "state":this.State
                  },
         "payment":this.CoD
      }

      this.api.authenticate(this.createorder).subscribe(data=>{
        //console.log(this.data);
        this.orderres=data;
         console.log(this.orderres);
        });
        
    }
}

