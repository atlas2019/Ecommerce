import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
//import simple from 'src/assets/simple.json';


@Injectable()

export class user {
  data:any={};
  constructor(private http: HttpClient) { }
  ;
  authenticate(productdisplay){
  

    return this.http.post('http://localhost:8080/Product/retrieve',this.data);
}
 
  }

