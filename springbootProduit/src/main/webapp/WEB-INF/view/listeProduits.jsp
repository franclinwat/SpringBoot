<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html" charset="ISO-8859-1">

<title>Liste produits</title>
</head>
<body>


<h1>Liste de Produits</h1>

<table>
<tr>
<th>ID</th> <th>Nom Produit</th> <th>Prix</th> <th>Date Creation </th> <th>Suppression</th> <th>Edition</th>
</tr>

<c:forEach items="#{produits}" var="pd"> 

<tr>
<td>${pd.idproduit } </td>
<td>${pd.nomProduit } </td>
<td>${pd.prixProduit } </td>

<td>
<ftm :formatDate pattern ="yyyy-MM-dd"  Value="${pd.dateCreation }" />
</td>

<td>
<a onclick="return confirm('Etes-vous sur ?')"  href="supprimerProduit?id=${pd.idproduit  }"> Supprimer </a>
</td>

<td>
<a href="modifierProduit?id=${pd.idproduit }">Edit</a>
</td>

</tr>

</c:forEach>
</table>
</body>
</html>