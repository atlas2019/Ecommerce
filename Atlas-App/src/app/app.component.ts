import { Component } from '@angular/core';
import { APICall } from 'src/app/APICall.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[APICall]
})
export class AppComponent {
logoutdisplay:any;
data:any;
  constructor(private api: APICall, private router: Router){}


next()
{
  this.logoutdisplay={
    //"userid":Number(localStorage.getItem("userid")),
    "token":Number(localStorage.getItem("token"))
    };
  this.api.test(this.logoutdisplay).subscribe();
  (localStorage.removeItem("token"));
  this.router.navigate(['./login']);
}
}

  