angular.module('restApp',['ui.route','ngResource','rest.controllers','rest.service']);


angular.module('restApp').config(function ($stateProvider,$httpProvider){
    
    $stateProvider.state('menu',{
        url:'menu',
        templateUrl:'prueba/menu.html',
        controller:'MenuListController'
    }).state('viewMenu',{
        url:'/menu/:id/view',
        templateUrl:'prueba/menu-view.html',
        controller:'MenuViewController'
    }).state('newMenu',{
        url:'/menu/new',
        templateUrl:'prueba/menu-add.html',
        controller:'MenuCreatorController'
    }).state('editMenu',{
        url:'/menu/:id/edit',
        templateUrl:'prueba/menu-edit.html',
        cotroller:'MenuEditController'
    });
}).run(function ($state){
    $state.go('menu');
});