<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body>
	<h2>Student Loan Information</h2>

	<table border="1">
		<tr>
			<th>Months into Term</th>
			<th>Updated Balance</th>
			<th>Monthly Payments</th>
		</tr>
		<c:forEach items="${MONTHS}" var="month">
			<tr>
				<td>${month}</td>
				<td>${month.updatedBalance(month}</td>
				<td>${month.monthlyPay(month)}</td>
			</tr>

	</table>

</body>
</html>