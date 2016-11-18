import { Component,OnInit, Input } from '@angular/core';


@Component({
  templateUrl: 'pedidosCocina.html',
  styleUrls: ['app/estilosPedidosCocina.css']
  
})
export class AppPedidos implements OnInit{

	rows = [];

  selected = [];

  columns: any[] = [
    { prop: 'Ticket'} , 
    { name: 'Cliente' }, 
    { name: 'Cantidad' },
	{ name: 'Fecha' },
	{ name: 'Estado' }
  ];

	constructor() {
		this.fetch((data) => {
			this.rows = data;
		});
	}
	
	fetch(cb) {
    const req = new XMLHttpRequest();
    req.open('GET', `data/dataTest.json`);

    req.onload = () => {
      cb(JSON.parse(req.response));
    };

    req.send();
  }

  onSelect({ selected }) {
    console.log('Select Event', selected, this.selected);

    this.selected.splice(0, this.selected.length);
    this.selected.push(...selected);
  }

  onActivate(event) {
    console.log('Activate Event', event);
  }
	
	ngOnInit() {
		console.log('componente AppPedidos inicializado...');
	}
	
}