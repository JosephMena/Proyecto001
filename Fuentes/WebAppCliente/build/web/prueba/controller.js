angular.module('rest.controllers',[])
        .controller('MenuListController', function ($scope,$state,popupService,$window,menu){
            $scope.menus= Menu.query();
            $scope.deleteMenu= function (menu){
                if(popupService.showPopup('¡seguro de eliminar este?')){
                    menu.$delete(function(){
                        $window.location.href='';
                    });
                }
            };
}).controller('MenuViewController', function ($scope,$stateParams,Menu){
    
    $scope.menu=Menu.get({id:$stateParams.id});
}).controller('MenuCreatorController', function ($scope,$state,$stateParams,Menu){

$scope.menu=new Menu();

$scope.addMenu=function (){
    $scope.menu.$save(function (){
        $state.go('menu');
    });
};
}).controller('MenuEditController',function ($scope,$state,$stateParams,Menu){

$scope.updateMenu=function (){
    $scope.menu.$update(function (){
        $state.go('menu');
    });
};

$scope.loadMenu= function (){
    $scope.menu= Menu.get({
        id:$stateParams.id
    });
    
    
};

$scope.loadMenu();

})