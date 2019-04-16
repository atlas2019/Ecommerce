//creates a new user if not registered

import { Injectable } from "@angular/core";
import { HttpClient  ,HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable()

export class REGCall {
  ret: any;
  data: any;
  constructor(private http: HttpClient) {}
  

  create(registerdisplay){
  

      return this.http.post('http://localhost:8080/Account/createReg',registerdisplay);
      console.log("Regsitercall");
  }
 

}
