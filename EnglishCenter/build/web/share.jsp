<%-- 
    Document   : share
    Created on : Dec 30, 2018, 8:09:25 PM
    Author     : Trung Cuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Góc chia sẻ </title>
        <link rel="shortcut icon" href ="icon/logo.jpg" />
    </head>
    <body>
          <jsp:include page="header.jsp"></jsp:include>  
          <div id="content" style="padding: 5% 10%; text-align: center;">
  			<h1> CÁC CHIA SẺ </h1>
 
  			<div style="width: 100%; padding: 5% 5%; text-align: center;">
  		<div style="width: 80%; ">
  				<video src="video.mp4" autobuffer autoloop loop controls poster="img/khoahoc1.png" width="80%" height="100%"  ></video>
  				<div style="width: 20%; float: right; font-size: 1em">
  					<br><br> <br><h1> Góc chia sẻ 1  </h1>
  					
					 </div>
  			</div>
  			<div style="width: 80%">
  				<video src="video.mp4" autobuffer autoloop loop controls poster="img/tintuc1.png" width="80%" height="100%"  ></video>
  				<div style="width: 20%; float: right; font-size: 1em">
  					<br><br> <br><h1> Góc chia sẻ 2  </h1>
  					
					 </div>
  			</div> 
  			<div style="width: 80%">
  				<video src="video.mp4" autobuffer autoloop loop controls poster="img/khoahoc3.png" width="80%" height="100%"  ></video>
  				<div style="width: 20%; float: right; font-size: 1em">
  					<br><br> <br><h1> Góc chia sẻ 3 </h1>
  					
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
