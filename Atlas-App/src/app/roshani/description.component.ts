import { Component,OnInit} from '@angular/core';
import simple from 'src/assets/simple.json';
//import { user } from './user.service';
import { Router } from '@angular/router';
import { HttpClientModule, HttpClient } from '@angular/common/http';

@Component({
  selector: 'ex-root',
  templateUrl: './description.component.html',
  styleUrls: ['./description.component.css'],
  providers:[HttpClient]
})
export class descriptionComponent {
  temps:any={};
  data:any;

 constructor(private http: HttpClient, private router: Router) {
     console.log('Reading local json files');
   console.log(simple);
   this.http.get<any>('assets/simple.json')
          .subscribe(data => {
             //console.log(data);
             this.temps = data});
          }    
          
          next(){
            this.router.navigate(['./cart']);
          }
          checkout(){
            this.router.navigate(['./payment']);
          }
   ngOnInit():void {} 
  }
  

   

