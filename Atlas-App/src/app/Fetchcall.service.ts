//fetch the information from the cart


import { Injectable } from "@angular/core";
import { HttpClient  ,HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()

export class FetchCall {
  ret: any;
  constructor(private http: HttpClient) {}
  ;

  authenticate(cartdisplay){

      return this.http.post('http://localhost:8080/Account/fetchCart',cartdisplay);
  }
  test(cartdisplay){
  
    console.log("in fetchcall");
    return this.http.post('http://localhost:8080/Account/fetchCart',cartdisplay);
    
}
}



















