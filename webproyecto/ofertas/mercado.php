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
      <li> <a href="..\ofertas/index.php"> Atras</a> </li>
			<li style="float: right;">  <a href= "http://www.epsa.upv.es/?lang=es" target="_blank"> EPSA</a> </li>
	</ul>
    <div class="desplegable" style="display: flex;
    flex-wrap: wrap;    
    margin: 1%;
    align-items: center;
    justify-content: center;">';
    
    $get_datos = "SELECT * FROM supermercados";
    $get_datos2 = $conn->query($get_datos);
    $buscar;
    foreach($get_datos2 as $row){
      $cod = $row['Codigo'];
      if(isset($_POST[$cod])){
        $buscar = $cod;
      }
    }


    $get_existenciasOfertas = "SELECT IDProducto,Precio FROM existencias WHERE Oferta = true AND CodigoSuper = '{$buscar}'";
    $get_datos2 = $conn->query($get_existenciasOfertas);
    foreach($get_datos2 as $row){
      $ID = $row['IDProducto'];
      $precio = $row['Precio'];
          $get_productos = "SELECT Nombre FROM productos WHERE ID = '{$ID}'";
          $get_productos2 = $conn->query($get_productos);
      $producto;
          foreach($get_productos2 as $row1){
          $producto = $row1['Nombre'];
          }
      echo '<div class="tabla" style="display:block;background: white; margin: 30px; max-width: 300px; border-radius: 20px;">
      <h1 style="text-align: center; font-size: 1.5em;margin-left:10px;">'.$producto.'</h1>
      <p style="text-align: justify; margin-top: 10px; margin-bottom: 10px; margin-left: 30px; margin-right: 30px;">Su precio antes era: '.$precio.' euros.</p>';
      $precio=$precio*(0.8);
      echo'<p style="text-align: justify; margin-top: 10px; margin-bottom: 10px; margin-left: 30px; margin-right: 30px;">Su precio ahora es: '.$precio.' euros.</p>
      <img style="display: block;margin: auto;bottom: 10px; margin-bottom: 10px; width: 180px;height: 180px; margin-top: 10px;" src=..\fotos/'.$producto.'.png>
      </div>';
    }

    echo '
    </div>

</body>
</html>

';

