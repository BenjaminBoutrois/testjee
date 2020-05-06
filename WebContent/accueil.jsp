<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="metier.Utilisateur" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Accueil</title>
	</head>
	<body>
		<% Utilisateur utilisateur = (Utilisateur)session.getAttribute("utilisateur"); %>
		<h1>Vous êtes sur votre page personnelle, <%= utilisateur.getLogin() %>.</h1>
	</body>
</html>