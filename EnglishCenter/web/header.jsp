<%-- 
    Document   : header
    Created on : Dec 30, 2018, 5:46:59 PM
    Author     : Trung Cuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
           <link rel="stylesheet" type="text/css" href="css/style.css"> 
	<link rel="shortcut icon" href ="icon/logo.jpg" />
	<script src="js/index.js" type="text/javascript" charset="utf-8" async defer></script>
    </head>
    <body>
     <div id="header">
			
			<div id="logo" style="width:80%">

				<a href="index.jsp""><img src="icon/icon_logo.png"  alt="Đây là logo" heigh="150x" width=" 200px" style="padding: 1em 0 ;"> </a> 
				<div id = "tentt">
					<h1>FIGHT ENGLISH</h1>
				</div>
			</div> 

  			<div id="menu" class="center" >
  				<ul>
  					<li>
  						<a href="index.jsp" > <img src="icon/icon_home.png"  style="text-align:center;" width="40px" heigh="40px"></a>
  						
  					</li>
  					<li> 
  						<a href="intro.jsp">Giới thiệu </a>
						
	  				</li>
	  				<li> 
	  					<a href="course.jsp">Khóa học </a> 
						
	  				</li>
	  				<li> 
	  					<a href="news.jsp">Tin tức </a>  
						
	  				</li>
	  				<li> 
	  					<a href="share.jsp"> Góc chia sẻ </a> 
						
	  				</li>
	  				<li> 
	  					<a href="tuyendung.jsp">Tuyển dụng </a> 
						
	  				</li>
	  			</ul>
  			</div>	
  		</div> 
        <div class="slideshow-container">
		
			  <div class="mySlides fade">
			    <img src="img/banner_01.png" style="width:70%" >
			    <div class="text"> <span style="font-size: 20px">Talkshow làm chủ Ielts, làm chủ cuộc đời </span><br> <br> Tham gia ngay talkshow:"Làm chủ ielts, làm chủ cuộc đời" để được chia sẻ phương pháp học tiếng anh cũng như định hướng du học và nghề nghiệp
			    	
			    </div>
			  </div>

			 
			  <div class="mySlides fade">
			    <img src="img/banner_02.png" style="width:70%">
			    <div class="text"> <span style="font-size: 20px">Talkshow làm chủ Ielts, làm chủ cuộc đời </span><br> <br> Tham gia ngay talkshow:"Làm chủ ielts, làm chủ cuộc đời" để được chia sẻ phương pháp học tiếng anh cũng như định hướng du học và nghề nghiệp
			    	
			    </div>
			  </div> 

			  <div class="mySlides fade">
			    <img src="img/banner_01.png" style="width:70%" >
			    <div class="text"> <span style="font-size: 20px">Talkshow làm chủ Ielts, làm chủ cuộc đời </span><br> <br> Tham gia ngay talkshow:"Làm chủ ielts, làm chủ cuộc đời" để được chia sẻ phương pháp học tiếng anh cũng như định hướng du học và nghề nghiệp
			    	
			    </div>
			  </div>
			 
			  
			</div>
			<br>
			 
			<div style="text-align:center">
			  <span class="dot" onclick="currentSlide(0)"></span> 
			  <span class="dot" onclick="currentSlide(1)"></span> 
			  <span class="dot" onclick="currentSlide(2)"></span> 
			</div>
    </body>
    
</html>
