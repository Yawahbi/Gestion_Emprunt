<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cree Etudiant</title>
</head>
<body>


	<form action="creerEtudiant" method="POST">
		<fieldset style="border-color:blue">
			<legend style="color:blue">Informations Etudiant</legend>
			<table width=60%>
				<tr>
					<td>Num Apogee<span style="color:red" >*</span></td>
					<td><input type="text" name="numApogee" ></td>
					<td><span class="erreur">${form.erreurs['numApogee']}</span></td>
				</tr>
				<tr>
					<td>Nom<span style="color:red" >*</span></td>
					<td><input type="text" name="nom"></td>
					<td><span class="erreur">${form.erreurs['nom']}</span></td>
				</tr>
				<tr>
					<td>Prenom</td>
					<td><input type="text" name="prenom" ></td>
					<td><span class="erreur">${form.erreurs['prenom']}</span></td>
				</tr>
				<tr>
					<td>Numero de telephone<span style="color:red" >*</span></td>
					<td><input type="text" name="numTel" ></td>
					<td><span class="erreur">${form.erreurs['numTel']}</span></td>
				</tr>
				<tr>
					<td>Adresse mail</td>
					<td><input type="text" name="adresseMail" ></td>
					<td><span class="erreur">${form.erreurs['adresseMail']}</span></td>
				</tr>
				<tr>
					<td>Filiere</td>
					<td><input type="text" name="filiere" "></td>
					<td><span class="erreur">${form.erreurs['filiere']}</span></td>
				</tr>
			</table>
			<font color="red">${form.resultat}</font></br></br>
		</fieldset>
		</br>
		<input type="submit" name="submit" value="Valider">
		<input type="reset" name="reset" value="Remettre à zéro">
	</form>
	
</body>
</html>