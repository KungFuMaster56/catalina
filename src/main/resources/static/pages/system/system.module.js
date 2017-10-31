
define(['angular','pages/system/menuConfig/menu.module'
    ,'pages/system/permissionConfig/permission.module'
    ,'pages/system/roleConfig/role.module'
    ,'pages/system/userConfig/user.module'
    ,'pages/system/departmentConfig/department.module'],function(angular){
    angular.module('myApp.pages.system',[
        'myApp.pages.system.user',
        'myApp.pages.system.role',
        'myApp.pages.system.permission',
        'myApp.pages.system.menu',
        "myApp.pages.system.department"
    ]);
});
