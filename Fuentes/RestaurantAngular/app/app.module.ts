import { NgModule }      			from '@angular/core';
import { BrowserModule } 			from '@angular/platform-browser';
import { FormsModule } 				from '@angular/forms';
import { RouterModule } 			from '@angular/router';
import { MaterialModule } 			from '@angular/material';
import { HttpModule }    			from '@angular/http';
import { AppRoutes } 				from './app.routes';
import { AppComponent }   			from './app.component';
import { AppInicio }   				from './app.inicio';
import { AppMenuNormal }   			from './app.menu.normal';
import { AppPedidos }   			from './app.pedidos';
import { AppCocina }   				from './app.cocina';
import { Angular2DataTableModule }	from 'angular2-data-table';

@NgModule({
  imports:      [ 
					MaterialModule.forRoot(),
					RouterModule.forRoot(AppRoutes),
					BrowserModule,
					FormsModule,
					HttpModule,
					Angular2DataTableModule
				],
  declarations: [ AppComponent,AppInicio,AppMenuNormal,AppCocina,AppPedidos ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
