<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page  import="com.quoteimp.test"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quote generator</title>
<link rel="stylesheet" href="index.css">
</head>
<body>
    <div class="container">
        <h2>Quote of The Day</h2>
        <p id="quote"><%= request.getAttribute("quote") %></p>
        <p id="author-name"><%= request.getAttribute("author") %></p>
        <div class="btn">
        	<form action="random">
        		<button>New Quote</button>
        	</form>
            <form action="searchauth">
            	<button>Search by Author</button>
            </form>
        </div>
    </div>
	
	
</body>
</html>