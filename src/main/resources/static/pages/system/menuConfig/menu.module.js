define(['angular'],function(angular){
    angular.module('myApp.pages.system.menu',[])
        .config(routeConfig);

    function routeConfig($stateProvider){
        $stateProvider.state('menu',{
            url:'/menu',
            templateUrl:'pages/system/menuConfig/menuConfig.html',
            tile:'菜单管理'
        })
    }
});