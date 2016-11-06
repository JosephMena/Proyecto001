angular.module('appPedido',['ngResource'])
        .factory('User', ['$resource', function ($resource) {
    return $resource(
            'http://http://localhost:8084/WebApp/rest/user/:id', 
            {},//parameters
            {
                update: {
                      method: 'PUT' // To send the HTTP Put request when calling this custom update method.
                }
                 
            }, 
            {
                stripTrailingSlashes: false
            }
    );
}]);
        
        
        
        
        
        
        
