import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';


@Injectable()

export class ALERT {
  data: any;
  constructor(private http: HttpClient) { }
  x: any;



  getLogin(data: any) {
    let obs = this.http.post("http://localhost:8080/Ecommerceapp/authenticate", data);
    x: obs.subscribe((response) => console.log(response));
    console.log(data);
    console.log(this.x);
  }

  get() {
    return this.x;
  }
}