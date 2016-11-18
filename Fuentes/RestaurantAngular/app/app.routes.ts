import { AppInicio } from './app.inicio';
import { AppMenuNormal } from './app.menu.normal';
import { AppPedidos } from './app.pedidos';

export const AppRoutes = [
  { path: '', component:  AppInicio},
  { path: 'menuNormal', component: AppMenuNormal },
  { path: 'pedidos', component: AppPedidos }
];