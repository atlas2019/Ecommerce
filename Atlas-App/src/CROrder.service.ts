// cretaes the order for a particular user


import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
//import simple from 'src/assets/simple.json';


@Injectable()

export class CROrder {
  data:any={};
  constructor(private http: HttpClient) { }
  ;
  authenticate(createorder){
  
  console.log("this is createorder")
    return this.http.post('http://localhost:8080/Account/createOrder',createorder);
}
 
  }
