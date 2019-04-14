// fetches the order information for a paticular user and displays it

import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
//import simple from 'src/assets/simple.json';


@Injectable()

export class fetch {
  data:any={};
  constructor(private http: HttpClient) { }
  ;
  authenticate(orderdisplay){
  

    return this.http.post('http://localhost:8080/Account/fetch',orderdisplay);
}
 
  }

