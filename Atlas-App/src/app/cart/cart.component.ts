import { Component,OnInit} from '@angular/core';
import simple from 'src/assets/simple.json';
import { Router } from '@angular/router';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import {FetchCall} from 'src/app/Fetchcall.service';

@Component({
  selector: 'cart-root',
  templateUrl: './cart.component.html',
 styleUrls: ['./cart.component.css'],
providers:[FetchCall]
})

export class cartComponent {

  cartdisplay: any;   //displays the cart information
  data:any=[];
  cartres: any=[];    //stores the data recieved from cart


  constructor( private router: Router,private api: FetchCall){ }

  //loads or fetch the cartitems, when the page gets loaded
  ngOnInit(){
     this.cartdisplay={
     "userid":Number(localStorage.getItem("userid"))
     }
// this.cartdisplay=this.fetchdisplay;
     //console.log(this.cartdisplay);
      this.api.test(this.cartdisplay).subscribe(data=>{
       // console.log(this.data);
     
        this.cartres=data;
         this.cartres=this.cartres;
        console.log(this.cartres);
        });
}
}