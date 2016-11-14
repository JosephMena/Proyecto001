import { Component,OnInit, Input } from '@angular/core';

@Component({
  selector: 'saludo',
  template: `
			<p>
			  nombre-del-componente works!
			</p>
			<p>
			  {{dato}}
			</p>`
})
export class AppSaludo implements OnInit{
	dato = 'Joseph Mena';
	constructor() {}

	ngOnInit() {
		console.log('componente inicializado...');
	}
	
}