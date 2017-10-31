define(['angular'],function(angular){
	angular.module('table-directive',[])
	.directive('btable',function(){
        return {
            restrict:'A',
            link:function(scope,element,attrs){
                console.log(scope.columns);
                console.log(scope.$eval(attrs.btable))
                var options = scope.$eval(attrs.btable);
                $(element).bootstrapTable({
                    classes:'table table-striped jambo_table table-condensed',
                    pagination:true,
                    sidePagination:'client',
                    toolbar:options['toolbar'],
                    search:true,
                    url:options['url'],
                    showRefresh:true,
                    singleSelect:true,
                    clickToSelect:true,
                    columns: scope.columns
                });

            }
        }
    });
});