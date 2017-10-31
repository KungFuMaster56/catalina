define(['pages/system/userConfig/user.module','bootstrap-dialog','bootstrap-datetimepicker','pages/system/userConfig/userService']
,function(user,BootstrapDialog){
    user.controller('userController',function($scope,userService){
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
})