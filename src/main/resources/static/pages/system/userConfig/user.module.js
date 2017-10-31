define(['angular','pages/table.directive','pages/system/userConfig/userService'],function(angular){
   var user = angular.module('myApp.pages.system.user',['table-directive','user.service']).
    config(routeConfig)
    .controller('userController',function($scope,userService){
        $scope.name="用户管理";
        $scope.columns=userService.columns;
        $scope.add = function(){
        	userService.addUser();
        };
        $scope.edit = function(){
        	 var rows = $('table[btable]').bootstrapTable('getSelections');
        	 var flag = rows.length>0?true:false;
        	 userService.editUser(rows,flag);
        };
        $scope.del = function(){
            var rows = $('table[btable]').bootstrapTable('getSelections');
            var flag = rows.length>0?true:false;
            userService.delUser(rows,flag);
        };
    });

    function routeConfig($stateProvider){
        $stateProvider.state('user',{
            url:'/user',
            templateUrl:'pages/system/userConfig/userConfig.html'
        })
    }
    return user;
});
