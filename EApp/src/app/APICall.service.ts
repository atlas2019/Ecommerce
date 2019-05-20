import { Injectable } from "@angular/core";
import { HttpClient  ,HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable()

export class APICall {
  ret: any;
  constructor(private http: HttpClient) {}

  authenticate(logindisplay){
    return this.http.post('http://localhost:8080/Aclogin/create',logindisplay);
}

test(registerdisplay){
  return this.http.post('http://localhost:8080/Aclogin/authenticate',registerdisplay);
}

}