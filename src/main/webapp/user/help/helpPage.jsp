<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/user/common/assertUserConnected.jsp" %>

<html>
<head>
    <title>Help</title>
</head>
<body style="padding-top: 70px; padding-bottom: 45px;">
<%@ include file="../common/navbar.jsp" %>
<div class="container">
    <div class="jumbotron">
        <h1><i class="fas fa-question"></i> Help</h1>
        <p>Helpful info</p>
    </div>
    <%@ include file="../common/help_user.jsp" %>

</div>

<%@ include file="../../common/jsp/footer.jsp" %>
</body>
</html>