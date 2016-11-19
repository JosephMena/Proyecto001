import { Component,OnInit, Input } from '@angular/core';

@Component({
  templateUrl: 'menuNormal.html',
  styleUrls: ['app/estilosMenuNormal.css']
})
export class AppMenuNormal implements OnInit{
	constructor() {}

	ngOnInit() {
		console.log('componente AppMenuNormal inicializado...');
	}
	
}