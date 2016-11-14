import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { MaterialModule } from '@angular/material';
import { HttpModule }    from '@angular/http';
import { AppComponent }   from './app.component';
import { AppSaludo }   from './app.saludo';


@NgModule({
  imports:      [ 
					MaterialModule.forRoot(),
					BrowserModule,
					FormsModule,
					HttpModule
				],
  declarations: [ AppComponent,AppSaludo ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
