# JavaWeb
step 1: add class files in your project

step 2: import MyCaptcha class to your jsp as follows
<%@page import="professional_company.MyCaptcha"%>

step 3: create object of MyCaptcha class this object will contain 
captcha characters in image as well as in string form

<%
MyCaptcha c=new MyCaptcha();
%>


step 4: create image tag as follows:

<pre> <img alt="image not fount" src="data:image/jpg;base64, <%=c.img %>">   ignore comment </pre>

you can get captcha characters in string form using <%c.text%>
