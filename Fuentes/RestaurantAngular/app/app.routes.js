"use strict";
var app_inicio_1 = require('./app.inicio');
var app_menu_normal_1 = require('./app.menu.normal');
var app_pedidos_1 = require('./app.pedidos');
exports.AppRoutes = [
    { path: '', component: app_inicio_1.AppInicio },
    { path: 'menuNormal', component: app_menu_normal_1.AppMenuNormal },
    { path: 'pedidos', component: app_pedidos_1.AppPedidos }
];
//# sourceMappingURL=app.routes.js.map