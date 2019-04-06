import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FlexLayoutModule } from '@angular/flex-layout';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatCardModule,MatToolbarModule, MatButtonModule, MatFormFieldModule, MatInputModule, MatSliderModule, MatDrawerContent, MatDrawer, MatCheckboxModule } from '@angular/material';
import { MaterialModule } from './material.module';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { loginComponent } from './login/login.component';
import { registerComponent } from './register/register.component';
import { InputComponent } from './textinput/input.component';
import { HttpClientModule } from '@angular/common/http';
import { InterceptorModule } from './interceptor.module';
import { productComponent } from './product/product.component';
import {MatMenuModule} from '@angular/material/menu';
import {MatSelectModule} from '@angular/material/select';
import {MatIconModule} from '@angular/material/icon';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatRadioModule} from '@angular/material/radio';
import {demoComponent} from './akshata/demo.component';
import {filterComponent} from './akshata/filter.component'
import {MatGridListModule} from '@angular/material/grid-list';
import { Ng5SliderModule } from 'ng5-slider';
import {filtertestComponent} from './akshata/filtertest.component';
import { OrderBy } from './akshata/orderBy.pipe';
import {projectComponent} from './akshata/project.component';
import {descriptionComponent} from './description/description.component';


@NgModule({
  declarations: [
    AppComponent,
    loginComponent,
    registerComponent,
    InputComponent,
    productComponent,
    demoComponent,
    filterComponent,
    filtertestComponent,
    OrderBy,
    projectComponent
 
  ],
  imports: [
    InterceptorModule,
    MatGridListModule,
   MatSidenavModule,
    MatRadioModule,
    HttpClientModule,
    BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule,
    MatSliderModule,
    MaterialModule,
    FlexLayoutModule,
    FormsModule,
    MatCardModule,
    MatToolbarModule,
    MatButtonModule,
    MatFormFieldModule,
    MatSelectModule,
    MatInputModule,
    MatIconModule,
    MatMenuModule,
    MatCheckboxModule,
    Ng5SliderModule
  ],

  //This loads the first Componenet to be executed
  bootstrap: [AppComponent]
})
export class AppModule { }




