<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>Cree un produit</title>
</head>

<body>
<form action="saveProduit"  method="post">
 <pre>

nom: <input  type="text"  name="nomProduit">
prix : <input  type="text"  name="prixProduit">
date creation  : <input  type="date"  name="date">
				<input  type="submit"  name="ajouter">

 </pre>
</form>

${msg}
<br/>
<br/>
<a href="ListeProduits">Liste produits</a>
</body>
</html>