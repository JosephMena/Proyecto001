import { Component,OnInit, Input } from '@angular/core';

@Component({
  selector: 'saludo',
  templateUrl: 'inicio.html'
})
export class AppInicio implements OnInit{
	dato = 'Joseph Mena';
	constructor() {}

	ngOnInit() {
		console.log('componente AppInicio inicializado...');
	}
	
}