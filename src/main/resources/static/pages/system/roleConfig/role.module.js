define(['angular'],function(angular){
   angular.module('myApp.pages.system.role',[]).
   config(routeConfig);

   function routeConfig($stateProvider){
       $stateProvider.state('role',{
           url:'/role',
           templateUrl:'pages/system/roleConfig/roleConfig.html',
           title:'权限管理'
       })
   }
});