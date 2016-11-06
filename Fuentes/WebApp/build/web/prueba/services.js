angular.module('movieApp.service',[]).factory('Movie',function ($resource){
    return $resource('http://movieapp-13534.onmodulus.net/api/movies/:id',{id:'@_id'},{
        update:{
            method:'PUT'
        }
    });
    
    
}).service('popupService', function ($window){
    this.showPopup=function (message){
        return $window.confirm(message);
    }
})