
angular.module('app',[])
.controller('appController',['$scope','$http',function($scope ,$http){
    
    $scope.logeo=function(){
        
        var user=$("#user").val();
        var pass=$("#pass").val();
        
        var data='user='+user+'&pass='+pass;
    $("#basicModal").modal('hide');                    
        $http({
            method:'POST',
            url: 'home',
            data: data,
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        });
        
    };
    
      

    }]);