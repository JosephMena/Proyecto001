import { Component,OnInit, Input } from '@angular/core';

@Component({
  selector: 'cocina',
  templateUrl: 'cocina.html',
  styleUrls: ['app/estilos.css']
})
export class AppCocina implements OnInit{
	constructor() {}

	ngOnInit() {
		console.log('componente cocina inicializado...');
	}
	
}