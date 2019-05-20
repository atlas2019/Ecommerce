import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import{LoginComponent} from './Login/login.component';
import{registerComponent} from './register/register.component';
import { productComponent } from './Product/product.component';
const routes: Routes = [
{ path: '', redirectTo: '/', pathMatch: 'full' },
{ path: 'register', component: registerComponent },
{ path: 'login', component: LoginComponent },
{path:'product',component:productComponent}
 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  
  })
export class AppRoutingModule { }
