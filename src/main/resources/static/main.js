'use strict';

(function(){
    var requireConfig = {
        paths:{
            "jquery":"lib/js/jquery.min",
            "bootstrap":"lib/bootstrap/js/bootstrap.min",
            "angular":'lib/js/angular.min',
            "router":'lib/js/angular-ui-router.min',
            "bootstrap-table":"lib/js/bootstrap-table.min",
            "bootstrap-bable-zh":"lib/js/bootstrap-table-zh-CN",
            "bootstrap-dialog":'lib/js/bootstrap-dialog.min',
            "custom":'lib/js/custom',
            'moment':'lib/js/moment-with-locales.min',
            "bootstrap-datetimepicker":'lib/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min',
            "pnotify":"lib/pnotify/dist/pnotify",
            "pnotify.buttons":"lib/pnotify/dist/pnotify.buttons",
            "iCheck":'lib/iCheck/icheck.min',
            "treeview":'lib/bootstrap-treeview/js/bootstrap-treeview.min',
            "select2":'lib/select2/js/select2.min'
        },
        shim:{
            'angular':{
                exports:'angular'
            },
            'router':{
                deps:['angular'],
                exports:'router'
            },
            'custom':{
                deps:['jquery','bootstrap'],
                exports:'custom'
            },
            'bootstrap':{
                deps:['jquery']
            },"bootstrap-table":{
                deps:['jquery']
            },
            'bootstrap-bable-zh':{
                deps:['bootstrap-table']
            },"bootstrap-datetimepicker":{
            	deps:['jquery','bootstrap']
            },"treeview":{
            	deps:['jquery','bootstrap']
            },"select2":{
            	deps:['jquery','bootstrap']
            }
        },
        urlArgs: "bust=" + (new Date()).getTime()
    }

    require.config(requireConfig);

    require(['angular','jquery','bootstrap','app','custom','bootstrap-bable-zh'],function(angular){
        angular.bootstrap(document,["myApp"]);
    });
})();

