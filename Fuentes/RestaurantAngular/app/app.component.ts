import { Component } from '@angular/core';
import { AppSaludo }   from './app.saludo';
import { MdToolbar } from '@angular/material';

@Component({
	selector: 'apprest',
	templateUrl: 'template.html'
})
export class AppComponent { 
	title = 'Titulo';
	persona = '';
	visible2 = false;
	decirAdios() {
		this.visible2 = true;
	}
}
