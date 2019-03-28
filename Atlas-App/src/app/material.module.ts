
//Angular Material is specified

import { NgModule } from  '@angular/core';
import { FormsModule} from '@angular/forms';
import {MatButtonModule,MatToolbarModule,MatIconModule,MatCardModule,MatFormFieldModule,MatInputModule,MatListModule} from  '@angular/material';
 
@NgModule({
    imports: [MatIconModule,MatButtonModule, MatToolbarModule,FormsModule, MatCardModule,MatFormFieldModule,MatInputModule,MatListModule,],
     
    exports: [FormsModule,MatIconModule,MatButtonModule,MatToolbarModule, MatCardModule,MatFormFieldModule,MatInputModule,],
     
    })
    
export  class  MaterialModule { }