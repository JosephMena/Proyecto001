import { AppInicio } from './app.inicio';
import { AppMenuNormal } from './app.menu.normal';

export const AppRoutes = [
  { path: '', component:  AppInicio},
  { path: 'menuNormal', component: AppMenuNormal }
];