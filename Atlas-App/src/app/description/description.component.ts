//import { Component,OnInit} from '@angular/core';
import simple from 'src/assets/simple.json';
//import { user } from './user.service';
import { Router } from '@angular/router';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Component, Input, Output, EventEmitter, OnInit } from '@angular/core';

@Component({
  selector: 'ex-root',
  templateUrl: './description.component.html',
  styleUrls: ['./description.component.css'],
  providers:[HttpClient]
})
export class descriptionComponent {
  temps:any={};
  data:any;
  ret: any;
  @Input() childMessage: any;

 constructor(private http: HttpClient, private router: Router) {
    this.http.get<any>(this.ret)
       .subscribe(data => {
          console.log(data);
  console.log(this.data);
  this.ret=this.data;
          } );   
        }   
              //  Routing Part for next component//
          // next(){
          //   this.router.navigate(['./cart']);
          // }
          // checkout(){
          //   this.router.navigate(['./payment']);
          // }
   ngOnInit():void {} 
  }
  

   

