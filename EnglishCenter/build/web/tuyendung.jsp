<%-- 
    Document   : tuyendung
    Created on : Dec 30, 2018, 8:11:19 PM
    Author     : Trung Cuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Tuyển dụng </title>
        <link rel="shortcut icon" href ="icon/logo.jpg" />
    </head>
    <body>
       <jsp:include page="header.jsp"></jsp:include> 
       <div id="content">
			<div style="width: 100%; text-align: center;">
			  	<h1> TUYỂN DỤNG </h1> 
			  	<div>
			  		Trung tâm liên tục tuyển dụng các vị trí :
			  		<br>MÔ TẢ CÔNG VIỆC

			<br>- Phụ trách dạy học theo lịch phân bổ của cấp trên.

			<br>- Lên nội dung, kế hoạch giảng dạy
			<br>- Chuẩn bị tài liệu và giáo cụ cho buổi học
			<br>- Tham gia tổ chức các hoạt động ngoại khoá của công ty
			<br>- Tuân thủ các quy định của Nhà Trường đối với giáo viên nhằm tạo dựng và nâng cao hình ảnh của TOMOKID

			<br>YÊU CẦU CÔNG VIỆC

			<br>+ Học vấn: Kỹ năng giao tiếp tốt, phát âm chuẩn
			<br>+ Yêu trẻ, thích chơi và chăm sóc các con
			<br>+ Kỹ năng giao tiếp, truyền đạt, thuyết phục.
			<br>+ Cẩn thận trong công việc
			<br>+ Thái độ làm việc nghiêm túc, năng động, nhiệt tình, hết mình vì công việc
			<br>+ Cầu tiến, mong muốn phát triển bản thân, có tinh thần học hỏi và biết cách phối hợp làm việc nhóm
			<br>+ Cam kết làm việc lâu dài.

			<br>QUYỀN LỢI
			<br>- Được hưởng mức lương cạnh tranh theo năng lực (6 đến 12 triệu/tháng)
			<br>- Được đào tạo kỹ năng chuyên môn, kỹ năng giao tiếp và các kỹ năng mềm khác.
			<br>- Có thể được thưởng các khóa học về đào tạo kỹ năng mềm để năng cao kỹ năng hơn nữa.
			<br>- Khi trúng tuyển sẽ được hướng dẫn rất tỉ mẩn và chi tiết về cách làm việc.
			<br>- Tomokid rất cởi mở trong quá trình sáng tạo, chính vì thế chúng tôi rất coi trọng và đánh giá cao các ý kiến và sáng kiến của nhân viên.
			<br>- Có chế độ Bảo hiểm xã hội
			<br>- Có thưởng đặc biệt với sự đóng góp lớn cho sự phát triển của trường
			<br>- Con được học miễn phí toàn bộ hoặc một phần tại Tomokid

			<br>THÔNG TIN LIÊN HỆ

			<br>Người liên hệ: Ms Lan Anh
			<br>Địa chỉ liên hệ: Số 143A Hoa Bằng, Yên Hòa, Cầu Giấy, Hà Nội.
			<br>Số điện thoại: 0965 078 096 hoặc 036 7655 343
			<br>Loại hình công việc: Toàn thời gian

			<br>Lương: 6.000.000₫ đến 12.000.000₫ /tháng			  	</div>
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
