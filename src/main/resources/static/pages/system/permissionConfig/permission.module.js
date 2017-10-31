define(['angular'],function(angular){
   angular.module('myApp.pages.system.permission',[])
       .config(routeConfig);

   function routeConfig($stateProvider){
       $stateProvider.state('permission',{
          url:'/permission',
          templateUrl:'pages/system/permissionConfig/permissionConfig.html',
          title:'权限管理'
       });
   }
});