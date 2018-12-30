<%-- 
    Document   : course
    Created on : Dec 30, 2018, 7:39:43 PM
    Author     : Trung Cuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Khóa học</title> 
        <link rel="shortcut icon" href ="icon/logo.jpg" />
    </head>
    <body>
         <jsp:include page="header.jsp"></jsp:include> 
      	<div id="content" style="padding: 5% 10%; text-align: center;">
  			<h1>THÔNG TIN CÁC KHÓA HỌC </h1>
 
  			<div style="width: 100%; padding: 5% 5%; text-align: center;">
  		<div style="width: 100%">
  				<img src="img/khoahoc1.png" width="50%">
  				<div style="width: 50%; float: right; font-size: 1em">
  					<br><br> <br><h1> Khóa học trẻ em </h1>
  					<br><a href="course1.jsp" title=""> Xem thêm </a>
					 </div>
  			</div>
  				<div style="width: 100%">
  				<img src="img/khoahoc2.png" width="50%">
  				<div style="width: 50%; float: right; font-size: 1em">
  					<br><br> <br><h1> Khóa học THPT </h1>
  					<br><a href="course2.jsp" title=""> Xem thêm </a>
					 </div>
  			</div> 
  			<div style="width: 100%">
  				<img src="img/khoahoc3.png" width="50%">
  				<div style="width: 50%; float: right; font-size: 1em">
  					<br><br> <br><h1> Khóa học giao tiếp </h1>
  					<br><a href="course3.jsp" title=""> Xem thêm </a>
					 </div>
  			</div>
  			</div> 

  		</div> 
         <jsp:include page="footer.jsp"></jsp:include> 
         <%
    Integer hitsCount = 
      (Integer)application.getAttribute("hitCounter");
    if( hitsCount ==null || hitsCount == 0 ){
       /* First visit */
   
       hitsCount = 1;
    }else{
       /* return visit */
     
       hitsCount += 1;
    }
    application.setAttribute("hitCounter", hitsCount);
%>
<center>
<p>Total number of visits: <%= hitsCount%></p>
</center>
    </body>
</html>
