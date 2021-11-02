<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="io.yawahbi.bean.Etudiant" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affiche Etudiant</title>
</head>
<body>
	
	<%
		Etudiant etudiant=(Etudiant)request.getAttribute("etudiant");
	%>

	<font color="green">${form.resultat}</font></br></br>
	Num Apogee : ${etudiant.getNumApogee()}</br></br>
	Nom : ${etudiant.getNom()}</br></br>
	Prenom : ${etudiant.getPrenom()}</br></br>
	Numero de telephone : ${etudiant.getNumTel()}</br></br>
	Adresse mail : ${etudiant.getAdresseMail()}</br></br>
	Filiere : ${etudiant.getFiliere()}

</body>
</html>