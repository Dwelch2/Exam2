<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>5 Deadly Viruses of All Time</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
        img {
            width:150px;
            length: 300px;
        }
    </style>
</head>
<body>

<h2>5 Deadly Viruses of All Time</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>MortalityRate</th>
        <th>Images</th>
    </tr>
    <c:forEach var = "listvirus" items = "${viruslist}">
        <tr>
            <td>${listvirus.id}</td>
            <td>${listvirus.name}</td>
            <td>${listvirus.description}</td>
            <td>${listvirus.symptoms}</td>
            <td>${listvirus.duration}</td>
            <td>${listvirus.mortalityrate}%</td>
            <td><img src ="${listvirus.image}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
