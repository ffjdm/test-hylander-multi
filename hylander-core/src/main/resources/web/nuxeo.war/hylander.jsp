<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset="utf-8">

    <!-- Enable IE Standards mode -->
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <title></title>
    <link rel="icon" type="image/png" href="<c:out value="${pageContext.servletContext.contextPath}" />/icons/favicon.png" />
    <link rel="shortcut icon" type="image/x-icon" href="<c:out value="${pageContext.servletContext.contextPath}" />/icons/favicon.ico" />
    <meta name="description" content="">
</head>
<body>
<c:out value="${customMessage}"/>
</body>
</html>
