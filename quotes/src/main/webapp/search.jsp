<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.modules.Quote,java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
    	body{
    		background-image: url(jonny-gios-t1IincPuUyI-unsplash.jpg);
    		background-size: cover;
    		background-position: top;
			}
    	.main{
    		display: flex;
    		justify-content: space-around;
    		flex-wrap:wrap;
    		padding: 4%;
    		}
    	.subdiv{
    		background-color: white;
    		width: 30%;
    		margin-bottom: 2%;
    		margin-top: 2%;
    		padding: 10px;
    		border-radius: 5px;
    	}
    </style>
</head>
<body>
        <div class="main">
			<% 
				ArrayList<Quote> lst = (ArrayList<Quote>) request.getAttribute("array");
					for(Quote q:lst){
				%>
				<div class="subdiv">
					<h4> <%= q.getAuthor() %> </h4>
					<h5> <%= q.getValue() %> </h5>
				</div>
				<% } %>
        </div>
</body>
</html>