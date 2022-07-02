<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
	<head>
		<title>To dos for ${name}</title>
		<link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css"
        		rel = "stylesheet">
	</head>
	<body>
	<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
    	<a class="navbar-brand m-1" href="https://www.citi.com/">Citi</a>
    	<div class="collapse navbar-collapse">
    		<ul class="navbar-nav">
    			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
    			<li class="nav-item"><a class="nav-link" href="/list-clients">Client List</a></li>
    		</ul>
    	</div>
    	<ul class="navbar-nav">
    		<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
    	</ul>
    </nav>
	    <div class = "container">

	    <table class="table table-striped">
	        <thead>
	            <tr>
	                <th>S.No</th>
	                <th>Client Name</th>
	                <th>Gender</th>
	                <th>Age</th>
	                <th>Credit Score</th>
	                <th>Loans Defaulted</th>
	                <th></th>
	                <th></th>

	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach items="${clients}" var="client">
	            <tr>
	                <td>${client.id}</td>
	                <td>${client.name}</td>
	                <td>${client.gender}</td>
	                <td>${client.age}</td>
	                <td>${client.creditScore}</td>
	                <td>${client.loansDefaulted}</td>

	                <td><a type= "button" class="btn btn-success" href="/update-client?id=${client.id}">Update</a></td>
	                <td><a type= "button" class="btn btn-warning" href="/delete-client?id=${client.id}">Delete</a></td>

	            </tr>
	            </c:forEach>
	        </tbody>
	    </table>
		<br>
		<div><a class="button" href = "/add-client">Add Client</a></div>

		<script src ="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script sec = "webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>

	</div>
	</body>
</html>