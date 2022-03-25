<?php
include __DIR__. "/../conexion/conexion.php";
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
		 	<li> <a class="active">Comparar</a> </li>
		 	<li> <a href="../index.html"> Página principal </a> </li>
      <li> <a href="../comparar/index.html"> Atras</a> </li>
			<li style="float: right;">  <a href= "http://www.epsa.upv.es/?lang=es" target="_blank"> EPSA</a> </li>
	</ul>';
    $get_producto = $_POST["producto"];
    $get_producto = strtolower(trim($get_producto));
    echo '<h1 style="text-align: center; font-size: 1.5em">'.$get_producto.'</h1><img style="display: block;margin: auto;bottom: 10px; margin-bottom: 10px; width: 180px;height: 180px; margin-top: 10px;" src=..\fotos/'.$get_producto.'.png>';

    echo '<div class="desplegable" style="display: flex;
    flex-wrap: wrap;    
    margin: 1%;
    align-items: center;
    justify-content: center;">';
    $get_datos = "SELECT ID,Unidades,Precio,Oferta,supermercados.Nombre,Direccion FROM productos INNER JOIN existencias ON productos.ID = existencias.IDProducto INNER JOIN supermercados ON existencias.CodigoSuper = supermercados.Codigo WHERE productos.Nombre = '{$get_producto}'";
    $get_datos2 = $conn->query($get_datos);
    foreach($get_datos2 as $row){
    	$unidades = $row['Unidades'];
    	$oferta = $row['Oferta'];
    	$precio = $row['Precio'];
    	$nombre = $row['Nombre'];
    	$direccion = $row['Direccion'];
    	if($oferta == true){
    		$precio=$precio*(0.8);
    		echo '<div class="tabla" style="display:block;background:yellow; margin: 30px; max-width: 300px; border-radius: 20px;">
      		<h1 style="text-align: center; font-size: 1.5em;margin-left:10px;">'.$nombre.' ('.$direccion.')</h1>
      		<p style="text-align: justify; margin-top: 10px; margin-bottom: 10px; margin-left: 30px; margin-right: 30px;">OFERTA<br>Su precio es: '.$precio.' euros.<br> 
      		Existencias: '.$unidades.'</p>';
    	}else{
    		echo '<div class="tabla" style="display:block;background:white; margin: 30px; max-width: 300px; border-radius: 20px;">
      		<h1 style="text-align: center; font-size: 1.5em;margin-left:10px;">'.$nombre.' ('.$direccion.')</h1>
      		<p style="text-align: justify; margin-top: 10px; margin-bottom: 10px; margin-left: 30px; margin-right: 30px;">Su precio es: '.$precio.' euros.<br> 
      		Existencias: '.$unidades.'</p>';
    	}
    	echo'</div>';
    }

    

    echo'</div>
    </body>
    </html>';