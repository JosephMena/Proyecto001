import { Component,OnInit, Input } from '@angular/core';

@Component({
  selector: 'saludo',
  templateUrl: 'menuNormal.html',
  styleUrls: ['app/estilosMenuNormal.css']
})
export class AppMenuNormal implements OnInit{
	dato = 'Joseph Mena';
	constructor() {}

	ngOnInit() {
		console.log('componente AppMenuNormal inicializado...');
	}
	
}