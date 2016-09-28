var app = angular.module('showPosts', ['ngSanitize']);
app.controller('Posts', function($scope,$http){
	$http.get("http://localhost:8080/posts.json").
		success(function(data) {
		$scope.posts = data;		
	});
})
