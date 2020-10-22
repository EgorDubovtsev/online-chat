<!DOCTYPE html>
<html>
<head>
	<title>Online Chat</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
	<script src="../../resources/js/selectInterlocutorScripts.js"></script>
		<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet">
			<style>
        	<%@include file="../../resources/css/main.css"%>
        	<%@include file="../../resources/css/select.css"%>
        	</style>
</head>
<body>
	<div class="background">
		<h1 class="header">Online Chat</h1>
		<div class="bodyWrapper">
			<div class="formArc searchFormArc">
				<div class="searchForm">
					<input type="text" id="searchLine" name="opponentName" class="opponentName" />
					<button class="btn searchBtn" id="search">Search</button>
				</div>
				<div class="searchResults"></div>
			</div>
		</div>
</div>
</body>
</html>