<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>proba jsp</title>
</head>
<body>

	<h1>Nazwa użytkownika:</h1>
	<form action="${pageContext.request.contextPath}/LoginServlet"
		method="get">
		<input type="text" name="login"> <input type="submit"
			value="Wyślij">
	</form>
	<div id="przycisk1">Witaj</div>


	<a href="${pageContext.request.contextPath}/DataBaseConnect">Idź do serwletu</a>

	</br>
	</br>

	<jsp:include page='../fragments/proba2.jspf' />
</body>
<script>
        document.querySelector("#przycisk1").addEventListener("click",()=>{
       
        	  var xhr = new XMLHttpRequest();
        	    xhr.onreadystatechange = function() {
        	        if (xhr.readyState == 4) {
        	            var data = xhr.responseText;
        	            document.querySelector("#przycisk1").innerHTML = data;
        	          
        	        }
        	    }
        	    xhr.open('get', "${pageContext.request.contextPath}/fragments/proba2.jspf", true);
        	    xhr.open('GET', "${pageContext.request.contextPath}/DataBaseConnect", true);
        	    xhr.send(null);
        	
        });
	</script>
</html>