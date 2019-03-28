import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { registerComponent } from './register/register.component';
import { loginComponent } from './login/login.component';
import { productComponent } from './product/product.component';


//Defines Page Routing

const routes: Routes = [
  { path: '', redirectTo: './', pathMatch: 'full' },
  { path: 'register', component: registerComponent },
  { path: 'login', component: loginComponent },
  { path: 'product', component: productComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
