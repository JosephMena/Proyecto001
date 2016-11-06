angular.module('cuentaClics',[])
        .component('cuentaClics',{
       templateUrl: 'cuenta-clics.html',
       controller: function (){
           var vm=this;
           vm.numClics=0;
           vm.incrementaClic= function(){
               vm.numClics++;
           }
       }     
});