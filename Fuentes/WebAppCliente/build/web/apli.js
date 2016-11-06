angular.module('nutritionApp').controller('nutritionController',['$nutrition','$scope',function($nutrition,$scope){
        
        'use strict';
        $scope.selected=[];
        
        $scope.query={
            filter:'',
            order:'name',
            limit:5,
            page:1
        }
        
        function success(dessert){
            $scope.dessert=dessert;
        }
        
        //int the future we may see a few built in alternate headers but in the mean time
        //you can implement you own search header and do something like
        
        $scope.search=function(predicate){
            $scope.filter= predicate;
            $scope.deferred=$nutrition.desserts.get($scope.query,success)
                    .$promise;
        };
        
        $scope.onOrderChange = function (order){
            return $nutrition.desserts.get($scope.query,success).$promise;
        };
        
        $scope.onPaginationChange = function (page, limit){
            return $nutrition.desserts.get($scope.query,success).$promise;
        };
        
        
        
}]);