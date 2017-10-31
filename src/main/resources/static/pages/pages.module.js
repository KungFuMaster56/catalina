define(['angular','pages/system/system.module','router'],function(angular){
	
    var pages = angular.module('myApp.pages',['ui.router','myApp.pages.system'])
        .config(function($stateProvider,$urlRouterProvider){
            $urlRouterProvider.otherwise('user');
        });
    return pages;
});
