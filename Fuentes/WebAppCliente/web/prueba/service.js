angular.module('rest.service',[]).factory('Menu',function($resource){
    return $resource('localhost:8084/WebApp/rest/menu/:id',{id:'@_id'},{
        update: {
            method:'PUT'
        }
    }) ;
}).service('popupService', function ($window){
    this.showPopup=function (message){
        return $window.confirm(message);
    };
});