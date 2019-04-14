// creates the cart items

import { Injectable } from "@angular/core";
import { HttpClient  ,HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable()

export class Cartcall {
  ret: any;
  constructor(private http: HttpClient) {}
  ;

  authenticate(cartcreate){
  
    console.log("in the dbcall");
      return this.http.post('http://localhost:8080/Account/createCart',cartcreate);
      
  }

}



















// import { Injectable } from "@angular/core";
// import { HttpClient } from '@angular/common/http';
// import { Observable } from 'rxjs';


// @Injectable()

// export class APICall {
//   ret: any;
//   constructor(private http: HttpClient) { }
//   ;



//   getLogin(data: any) {
//     let promise = new Promise((resolve, reject) => {
//       this.http.post("http://localhost:8080/Ecommerceapp/authenticate", data).toPromise().then(
//         res => {
//           this.ret = res;
//           resolve();
//         }
//       )
//     });
//     return promise;

//   }

// }