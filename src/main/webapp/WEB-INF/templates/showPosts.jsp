
<!DOCTYPE html>
<html ng-app="showPosts">
<head>
	<title>Posts list angular!</title>
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular.min.js" ></script>
	<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular-sanitize.js"></script>
	<script src= "resources/js/posts.js"></script>
</head>
<body >
	<div class="posts-container" ng-controller="Posts" >
		I have {{posts.length}} posts !
		<br>
		My first angular calc {{ 16 + 3 }}
		
		<ul>			
			<li ng-repeat= "post in posts">
			<div class ="postContainer">
			<div id ="post_header_container" >
			<p id="postTitleContainer" class="span6" ng-bind-html="post.title"></p>
			<p id="postDateContainer" class="span6" ng-bind-html="post.datetime"></p>
			</div>
			<p id="postBodyContainer" ng-bind-html="post.body"></p>			
			</div>
			</li>
		</ul>
	</div>
</body>
</html>