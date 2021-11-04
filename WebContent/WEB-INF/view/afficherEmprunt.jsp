<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="io.yawahbi.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affiche Emprunt</title>
</head>
<body>
	
	<%
		Etudiant etudiant=(Etudiant)request.getAttribute("etudiant");
		Emprunt emprunt=(Emprunt)request.getAttribute("emprunt");
	%>

	<font color="green">${formEmprunt.resultat}</font></br></br>
	Etudiant</br></br>
	Num Apogee : ${etudiant.getNumApogee()}</br></br>
	Nom : ${etudiant.getNom()}</br></br>
	Prenom : ${etudiant.getPrenom()}</br></br>
	Numero de telephone : ${etudiant.getNumTel()}</br></br>
	Adresse mail : ${etudiant.getAdresseMail()}</br></br>
	Filiere : ${etudiant.getFiliere()}</br></br>
	
	Emprunt</br></br>
	Reference : ${emprunt.getReference()}</br></br>
	Date : ${emprunt.getDate()}</br></br>
	Periode : ${emprunt.getPeriode()}</br></br>
	
</body>
</html>