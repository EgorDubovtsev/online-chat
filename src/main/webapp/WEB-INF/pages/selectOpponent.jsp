<!DOCTYPE html>
<html>
<head>
	<title>Online Chat</title>
		<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet">
			<style>
        	<%@include file="../../css/main.css"%>
        	<%@include file="../../css/select.css"%>
        	</style>
</head>
<body>
	<div class="background">
		<h1 class="header">Online Chat</h1>
		<div class="bodyWrapper">
			<div class="formArc searchFormArc">
				<form class="searchForm">
					<input type="text" name="opponentName" class="opponentName" />
					<button class="btn searchBtn">Search</button>
				</form>
				<form class="searchResults">
					<button class="user">
						<div class="userPhoto"></div>
						<div class="userName">User Name</div>
						<div class="userLogin">login123</div>
					</button>
				</form>
			</div>
		</div>
</div>
</body>
</html>