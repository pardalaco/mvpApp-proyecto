<?php
include __DIR__. "/conexion.php";
echo '
<!DOCTYPE html>
<html>
<head>
	<title>MVP</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="estilo.css">
     <link rel="preconnect" href="https://fonts.googleapis.com">
     <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
     <link href="https://fonts.googleapis.com/css2?family=Merriweather:ital@1&family=Playfair+Display:ital,wght@0,700;1,700&display=swap" rel="stylesheet">
</head>
<body>
	<header> 
               
                <h1>INSTANT GROCERY SHOPPING</h1> 
               
                </header>
  
	<ul>
		 	<li> <a class="active"> Ofertas</a> </li>
		 	<li> <a href="..\index.html"> Página principal </a> </li>
      <li> <a href="../comparar/index.html"> Comparador precio y disponibilidad </a> </li>
			<li style="float: right;">  <a href= "http://www.epsa.upv.es/?lang=es" target="_blank"> EPSA</a> </li>
	</ul>

	<div class="presentacio">
		<p> En este apartado de nuestra página web, podrá comprobar si existen ofertas en los diferentes supermercados.
    </p> 
    </div>
    <div class = "desplegable">
          <form action = "mercado.php" method = "post">
          <p>';
               

               $get_nombres1 = "SELECT * FROM supermercados ORDER BY Nombre,Direccion";
                $get_nombres2 = $conn->query($get_nombres1);
              foreach($get_nombres2 as $row){
              $nombre = $row['Nombre'];
              $lugar = $row['Direccion'];
              $codigo = $row['Codigo'];
            
            echo '<input type="checkbox" name="'.$codigo.'">'.$nombre." (".$lugar.")".'<br>';
            
            }
               echo'
               
          </p>
           <input type="submit" value="Enviar">
          </form>
    </div> 

</body>
</html>

';