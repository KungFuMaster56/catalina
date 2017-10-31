define(['angular'],function(angular){
	angular.module('treeview-directive',[]).
	directive('treeview',function(){
		return {
			restrict:'EA',
			link:function(scope,element,attrs){
				var tree = scope.treeData;
				$(element).treeview({data:tree,showCheckbox:true});
			}
		}
	})
})