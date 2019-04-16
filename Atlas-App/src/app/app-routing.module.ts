import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { registerComponent } from './register/register.component';
import { loginComponent } from './login/login.component';
import { filterComponent } from './akshata/filter.component';
import {descriptionComponent} from './description/description.component';
import { projectComponent } from './productlanding/project.component';
import { orderComponent } from './checkout/order.component';
import { cartComponent } from './cart/cart.component';
import { checkoutComponent } from './checkout/checkout.component';


//Defines Page Routing

const routes: Routes = [
  { path: '', redirectTo: './', pathMatch: 'full' },
  { path: 'register', component: registerComponent },
  { path: 'login', component: loginComponent },
  { path:'filter',component:filterComponent},
  {path: 'description', component:descriptionComponent },
  {path:'product', component:projectComponent},
  {path:'order', component:orderComponent},
  {path:'cart', component:cartComponent},
  {path:'checkout', component:checkoutComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
