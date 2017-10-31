define(['angular','bootstrap-table'],function(angular){
   return  angular.module('myApp.pages.system.user').directive('btable',function(){
        return {
            restrict:'E',
            /*scope:{
                tableData:'@',

            },*/
            template:'<table id="table"></table>',
            replace:true,
            link:function(scope,el,attrs){
            	console.log(scope.tableData)
                $('#table').bootstrapTable({
                    classes:'table table-striped jambo_table table-condensed',
                    pagination:true,
                    sidePagination:'client',
                    toolbar:'#toolbar',
                    search:true,
                    singleSelect:true,
                    clickToSelect:true,
                    columns: [{checkbox:true},{
                        field: 'user_name',
                        title: '用户名',
                        halign:'center',
                        align:'center',
                        valign:'middle'
                    }, {
                        field: 'login_account',
                        title: '登录名',
                        halign:'center',
                        align:'center',
                        valign:'middle'
                    }/*,{
                    field: 'handler',
                        title: '操作',
                        width:'20%',
                        halign:'center',
                        align:'center',
                        valign:'middle',
                        formatter:function(value,row,index){
                                return ['<button class="btn btn-success editable-table-button btn-xs"><i class="fa fa-pencil"></i>编辑</button>',
                                        '<button class="btn btn-danger editable-table-button btn-xs "><i class="fa fa-trash"></i>删除</button>'
                                ].join('  ')
                        }
                }*/],
                    data: scope.tableData
                });

            }
        }
    })

})