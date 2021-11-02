<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cree Etudiant</title>
	<style>
		table td:first-child{
			width:300px;
		}
	</style>
</head>
<body>

 	<c:if test="${not empty erreur}">
 		<font color=red>${erreur}</font>
 	</c:if>
	<form action="creerEmprunt" method="GET">
		<fieldset style="border-color:blue">
			<legend style="color:blue">Informations Etudiant</legend>
			<table>
				<tr>
					<td>Num Apogee<span style="color:red" >*</span></td>
					<td><input type="number" name="numApogee"></td>
				</tr>
				<tr>
					<td>Nom<span style="color:red" >*</span></td>
					<td><input type="text" name="nom"></td>
				</tr>
				<tr>
					<td>Prenom</td>
					<td><input type="text" name="prenom"></td>
				</tr>
				<tr>
					<td>Numero de telephone<span style="color:red" >*</span></td>
					<td><input type="text" name="numTel"></td>
				</tr>
				<tr>
					<td>Adresse mail</td>
					<td><input type="email" name="adresseMail"></td>
				</tr>
				<tr>
					<td>Filiere</td>
					<td><input type="text" name="filiere"></td>
				</tr>
			
			</table>
		</fieldset>
		</br>
		
		<fieldset style="border-color:blue">
			<legend style="color:blue">Informations Emprunt</legend>
			<table >
				<tr>
					<td>Reference<span style="color:red" >*</span></td>
					<td><input type="text" name="reference"></td>
				</tr>
				<tr>
					<td>Date<span style="color:red" >*</span></td>
					<td><input type="date" name="date"></td>
				</tr>
				<tr>
					<td >Periode<span style="color:red" >*</span></td>
					<td><input type="number" name="periode"></td>
				</tr>
			</table>
		</fieldset>
		</br>
		
		<input type="submit" name="submit" value="Valider">
		<input type="reset" name="reset" value="Remettre à zéro">
	</form>
	
</body>
</html>