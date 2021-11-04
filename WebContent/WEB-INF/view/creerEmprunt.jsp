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

	<form action="creerEmprunt" method="POST">
		<fieldset style="border-color:blue">
			<legend style="color:blue">InformEtudiantations Etudiant</legend>
			<table>
				<tr>
					<td>Num Apogee<span style="color:red" >*</span></td>
					<td><input type="text" name="numApogee"></td>
					<td><span class="erreur">${formEtudiant.erreurs['numApogee']}</span></td>
				</tr>
				<tr>
					<td>Nom<span style="color:red" >*</span></td>
					<td><input type="text" name="nom"></td>
					<td><span class="erreur">${formEtudiant.erreurs['nom']}</span></td>
				</tr>
				<tr>
					<td>Prenom</td>
					<td><input type="text" name="prenom"></td>
					<td><span class="erreur">${formEtudiant.erreurs['prenom']}</span></td>
				</tr>
				<tr>
					<td>Numero de telephone<span style="color:red" >*</span></td>
					<td><input type="text" name="numTel"></td>
					<td><span class="erreur">${formEtudiant.erreurs['numTel']}</span></td>
				</tr>
				<tr>
					<td>Adresse mail</td>
					<td><input type="text" name="adresseMail"></td>
					<td><span class="erreur">${formEtudiant.erreurs['adresseMail']}</span></td>
				</tr>
				<tr>
					<td>Filiere</td>
					<td><input type="text" name="filiere"></td>
					<td><span class="erreur">${formEtudiant.erreurs['filiere']}</span></td>
				</tr>
			
			</table>
		</fieldset>
		</br>
		
		<fieldset style="border-color:blue">
			<legend style="color:blue">InformEtudiantations Emprunt</legend>
			<table >
				<tr>
					<td>Reference<span style="color:red" >*</span></td>
					<td><input type="text" name="reference"></td>
					<td><span class="erreur">${formEmprunt.erreurs['reference']}</span></td>
				</tr>
				<tr>
					<td>Date<span style="color:red" >*</span></td>
					<td><input type="text" name="date"></td>
					<td><span class="erreur">${formEmprunt.erreurs['date']}</span></td>
				</tr>
				<tr>
					<td >Periode<span style="color:red" >*</span></td>
					<td><input type="text" name="periode"></td>
					<td><span class="erreur">${formEmprunt.erreurs['periode']}</span></td>
				</tr>
			</table>
		</fieldset>
		</br>
		<font color="red">${form.resultat}</font></br></br>
		<input type="submit" name="submit" value="Valider">
		<input type="reset" name="reset" value="Remettre à zéro">
	</form>
	
</body>
</html>