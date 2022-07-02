<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>To do List</title>
		<link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css"
                		rel = "stylesheet">
	</head>
	<body>

	<div class="container">
		<form:form method = "post" modelAttribute="client">
		    <form:hidden path="id"/>
		    <fieldset class= "form-group">
            <form:label path="name">Client Name</form:label>
           <form:input type="text" path="name" class="form-control" required="required"/>

           </fieldset>

           <fieldset class= "form-group">
                   <form:label path="gender">Gender</form:label>
                   <form:input type="text" path="gender" class="form-control" required="required"/>
           </fieldset>
           <fieldset class= "form-group">
                       <form:label path="age">Age</form:label>
                      <form:input type="text" path="age" class="form-control" required="required"/>
                      </fieldset>
           <fieldset class= "form-group">
                   <form:label path="creditScore">Credit Score</form:label>
                   <form:input type="text" path="creditScore" class="form-control" required="required"/>
           </fieldset>
           <fieldset class= "form-group">
                   <form:label path="loansDefaulted">Loans Defaulted?</form:label>
                   <form:input type="text" path="loansDefaulted" class="form-control" required="required"/>
           </fieldset>
		  <button type="submit" class="btn btn-success">Add</button>
		  <a type= "button" class="btn btn-danger" href="/list-clients">Cancel</a>


		</form:form>
	</div
		<script src ="webjars/jquery/3.6.0/jquery.min.js"></script>
        <script sec = "webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
</html>