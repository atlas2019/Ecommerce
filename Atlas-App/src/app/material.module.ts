
//Angular Material is specified

import { NgModule } from  '@angular/core';
import { FormsModule} from '@angular/forms';
import {MatButtonModule,MatRadioModule,MatSliderModule,MatToolbarModule,MatIconModule,MatCardModule,MatFormFieldModule,MatInputModule,MatListModule} from  '@angular/material';
 
@NgModule({
    imports: [MatIconModule,MatRadioModule,MatSliderModule,MatButtonModule, MatToolbarModule,FormsModule, MatCardModule,MatFormFieldModule,MatInputModule,MatListModule],
     
    exports: [FormsModule,MatRadioModule,MatIconModule,MatButtonModule,MatToolbarModule, MatCardModule,MatFormFieldModule,MatInputModule],
     
    })
    
export  class  MaterialModule { }