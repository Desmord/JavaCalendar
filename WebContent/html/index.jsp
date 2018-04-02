<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta name="description" content="Kalendarz roślin">
<meta name="keywords"
	content="Mikołaj,Chojnacki,programowanie,webdeveloper,frond,frondend,frond-end">
<meta name="author" content="Mikołaj Chojnacki">

<link rel="stylesheet" href="../css/reset.css">
<link href="https://fonts.googleapis.com/css?family=PT+Sans:400,700"
	rel="stylesheet">
<link rel="stylesheet" href="../css/main.css">

<title>Mikołaj Chojnacki</title>

</head>
<body>
<div class="container">

		<div class="mainMenu">
			<div id="addButton">Dodaj roślinę</div>
			<div id="saveButton">Zapisz zmiany</div>
		</div>

		<div class="legend">
			<div class="legendItem">
				<div class="colorDiv green"></div>
				- wykonano
			</div>
			<div class="legendItem">
				<div class="colorDiv red"></div>
				- wykonać
			</div>
			<div class="legendItem">
				<div class="colorDiv black"></div>
				- nie dotyczy
			</div>
			<div class="legendItem">
				<div class="colorDiv orange"></div>
				- do zapisu
			</div>
		</div>

		<div class="items">
			<!--   <div class="item">
                <div class="name black">nawza</div>
                <div class="action green">data1</div>
                <div class="action orange">data2</div>
                <div class="action red">data3</div>
                <div class="action black">
                    puste bo nie dotyczy
                </div>
                <div class="action red">data4</div>
                <div class="info" name="nazwaROsliny">info</div>
            </div>
            <div class="item">
                <div class="name black">nawza</div>
                <div class="action">cz1</div>
                <div class="action">cz2</div>
                <div class="action">cz3</div>
                <div class="action">cz4</div>
                <div class="action">cz5</div>
                <div class="info">info</div>
            </div>
            <div class="item">
                <div class="name black">nawza</div>
                <div class="action">cz1</div>
                <div class="action">cz2</div>
                <div class="action">cz3</div>
                <div class="action">cz4</div>
                <div class="action">cz5</div>
                <div class="info">info</div>
            </div>
            -->
		</div>


	</div>
</body>

<script>
        document.querySelector("#addButton").addEventListener("click",()=>{
       
        	  var xhr = new XMLHttpRequest();
        	    xhr.onreadystatechange = function() {
        	        if (xhr.readyState == 4) {
        	            var data = xhr.responseText;
        	            var text = document.querySelector(".items").innerHTML;
        	            document.querySelector(".items").innerHTML = text+data;
        	          
        	        }
        	    }
        	    xhr.open('get', "${pageContext.request.contextPath}/LoginServlet", true);
        	    xhr.send(null);
        	
        });
	</script>
</html>