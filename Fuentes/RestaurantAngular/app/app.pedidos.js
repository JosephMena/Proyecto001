"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var AppPedidos = (function () {
    function AppPedidos() {
        var _this = this;
        this.rows = [];
        this.selected = [];
        this.columns = [
            { prop: 'Ticket' },
            { name: 'Cliente' },
            { name: 'Cantidad' },
            { name: 'Fecha' },
            { name: 'Estado' }
        ];
        this.fetch(function (data) {
            _this.rows = data;
        });
    }
    AppPedidos.prototype.fetch = function (cb) {
        var req = new XMLHttpRequest();
        req.open('GET', "data/dataTest.json");
        req.onload = function () {
            cb(JSON.parse(req.response));
        };
        req.send();
    };
    AppPedidos.prototype.onSelect = function (_a) {
        var selected = _a.selected;
        console.log('Select Event', selected, this.selected);
        this.selected.splice(0, this.selected.length);
        (_b = this.selected).push.apply(_b, selected);
        var _b;
    };
    AppPedidos.prototype.onActivate = function (event) {
        console.log('Activate Event', event);
    };
    AppPedidos.prototype.ngOnInit = function () {
        console.log('componente AppPedidos inicializado...');
    };
    AppPedidos = __decorate([
        core_1.Component({
            templateUrl: 'pedidosCocina.html',
            styleUrls: ['app/estilosPedidosCocina.css']
        }), 
        __metadata('design:paramtypes', [])
    ], AppPedidos);
    return AppPedidos;
}());
exports.AppPedidos = AppPedidos;
//# sourceMappingURL=app.pedidos.js.map