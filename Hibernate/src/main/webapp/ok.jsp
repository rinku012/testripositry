
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<link rel="icon" type="image/png"
	href="/img/customLogo.png" sizes="16*16" />
<title>User Page</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			dateFormat : 'mm/dd/yy',
			//defaultDate : "06/06/2001",
			changeMonth : true,
			changeYear : true,
			//yearRange: "c-20:c+0",
			//yearRange : "1980:2002",
			//maxDate:'0',
			// minDate:0
			yearRange : "-40:-18"
		});
	});
</script>
<body>
	
	

	<center>
		<form action="" method="post">
			
			<div align="center">
				<h1>

					
					<tr>
						<th><font size="5px">Update User</font></th>
					</tr>
					
					<tr>
						<th><font size="5px"> Add User </font></th>
					</tr>
					
				</h1>

				<h3>
					<font color="red"> </font>
					<font color="green"> </font>
				</h3>

			</div>
			<input type="hidden" name="id" value=""> <input
				type="hidden" name="createdBy" value="">
			<input type="hidden" name="modifiedBy"
				value=""> <input type="hidden"
				name="createdDatetime"
				value="">
			<input type="hidden" name="modifiedDatetime"
				value="">

			<table>
				<tr>
					<th align="left">First Name <span style="color: red">*</span>
						:
					</th>
					<td><input type="text" name="firstName"
						placeholder="Enter First Name" size="25"
						value=""></td>
					<td style="position: fixed"><font color="red"></font></td>

				</tr>

				<tr>
					<th style="padding: 3px"></th>
				</tr>

				<tr>
					<th align="left">Last Name<span style="color: red">*</span></th>
					<td><input type="text" name="lastName"
						placeholder="Enter Last Name" size="25"
						value=""></td>
					<td style="position: fixed"><font color="red"> </font></td>
				</tr>
				<tr>
					<th style="padding: 3px"></th>
				</tr>

				<tr>
					<th align="left">LoginId <span style="color: red">*</span> :
					</th>
					
				</tr>
			</table>
		</form>
	</center>

	</body>
</html>