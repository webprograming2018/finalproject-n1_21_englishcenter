<%-- 
    Document   : course3
    Created on : Dec 30, 2018, 8:19:31 PM
    Author     : Trung Cuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Khóa học giao tiếp </title>
        <link rel="shortcut icon" href ="icon/logo.jpg" />
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include> 
        <div id="content" style="padding: 5% 10%">
  			<div style="width: 100%; text-align: center;">
 				<h1> KHÓA HỌC GIAO TIẾP </h1> 				
  			</div>
  			<div style="width: 100%">
  				<img src="img/khoahoc3.png" width="50%">
  				<div style="width: 50%; float: right; font-size: 1em">
  					Khóa học trẻ em giúp trẻ em có các bước tiếp cận với tiếng anh dễ dàng hơn, kích thích khả năng tư duy của các bé, hoàn thiện đầy đủ các kỹ năng cần thiết.
  					<br>Nắm được các ngữ pháp cơ bản và phát triển vốn từ vựng cơ bản liên quan đến nhiều ngành nghề như tài chính, ngân hàng, kinh doanh, quản lý… để chuẩn bị cho các khóa học nâng cao điểm số tiếp theo (Toeic A và Toeic B)

					<br>► Nắm được phương pháp và kĩ năng nghe cũng như đọc hiểu, phương pháp làm bài thi 

					<br>► Nắm được sự khác biệt trong cách phát âm Anh-Anh và Anh-Mỹ (Hai loại hình phát âm thường xuyên xuất hiện trong đề thi)

					<br>► Nắm được dạng thức đề thi chuẩn thông qua các bài tập, bài kiểm tra giữa kì và cuối kì do chính Ms Hoa biên soạn và kiểm tra chất lượng theo thể thức của Đề thi TOEIC chuẩn.

					<br>► Học được cách vận dụng ngôn ngữ TOEIC trong môi trường giao tiếp quốc tế.

					<br>► Nâng cao vốn từ vựng cũng như kĩ năng giải quyết tình huống trong môi trường làm việc thông qua hoạt động ngoại khóa của CLB Paint Yourself Business English Club (Tổ chức Chủ Nhật hàng tuần, 4:00 P.M-6:00 P.M) 

					 </div>
  			</div> 
  			<div style="width: 100%; padding: 5% 5%; text-align: center;">
  				<h1>Các khóa học khác </h1>
  				<div style="width: 100%">
  				<img src="img/khoahoc2.png" width="50%">
  				<div style="width: 50%; float: right; font-size: 1em">
  					<br><br> <br><h1> Khóa học THPT </h1>
  					<br><a href="course2.jsp" title=""> Xem thêm </a>
					 </div>
  			</div> 
  			<div style="width: 100%">
  				<img src="img/khoahoc1.png" width="50%">
  				<div style="width: 50%; float: right; font-size: 1em">
  					<br><br> <br><h1> Khóa học trẻ em </h1>
  					<br><a href="course1.jsp" title=""> Xem thêm </a>
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
