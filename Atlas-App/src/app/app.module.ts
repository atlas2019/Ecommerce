import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FlexLayoutModule } from '@angular/flex-layout';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatCardModule, MatToolbarModule, MatButtonModule, MatFormFieldModule, MatInputModule } from '@angular/material';
import { MaterialModule } from './material.module';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { loginComponent } from './login/login.component';
import { registerComponent } from './register/register.component';
import { InputComponent } from './textinput/input.component';
import { HttpClientModule } from '@angular/common/http';
import { InterceptorModule } from './interceptor.module';
import { productComponent } from './product/product.component';
@NgModule({
  declarations: [
    AppComponent,
    loginComponent,
    registerComponent,
    InputComponent,
    productComponent
  ],
  imports: [
    InterceptorModule,
    HttpClientModule,
    BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule,
    MaterialModule,
    FlexLayoutModule,
    FormsModule,
    MatCardModule,
    MatToolbarModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
  ],

  //This loads the first Componenet to be executed
  bootstrap: [AppComponent]
})
export class AppModule { }




