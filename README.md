# JavaWeb
We can use these classes collectively to create captcha image in our login page

Classes can be used in following way in jsp file

<%@page import="professional_company.MyCaptcha"%>
<html>
<body>
<br>
<%
MyCaptcha c=new MyCaptcha();
%>
<img alt="image not fount" src="data:image/jpg;base64, <%=c.img %>">     
<br>
<!--  <h1>text data is:  <%=c.text%>   </h1> -->
<br>
Enter captcha: <input type=text>
<br>
<br>
<input type="submit">

</body>
</html>

At line no 11 we created object Mycaptcha which contains captcha character string and image
on line no 13 we include captcha image in our jsp file.
