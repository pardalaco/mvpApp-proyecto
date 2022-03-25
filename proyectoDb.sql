DROP DATABASE IF exists proyecto;
CREATE DATABASE proyecto;
use proyecto;
DROP TABLE IF EXISTS supermercados;
CREATE TABLE supermercados (
    	Codigo          VARCHAR(10) NOT NULL,
    	Nombre          VARCHAR(40) NOT NULL,
    	Localidad       VARCHAR(40) NOT NULL,
    	CP		BIGINT NOT NULL,
    	Direccion       VARCHAR(80) NOT NULL,
    	CONSTRAINT pk_codigosuper PRIMARY KEY (codigo)
                                
);
DROP TABLE IF EXISTS productos;
CREATE TABLE productos (
	ID          SMALLINT NOT NULL auto_increment,
	Nombre      VARCHAR(80) NOT NULL,
	CONSTRAINT pk_idProducto PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS existencias;
CREATE TABLE existencias (
	IDProducto  	SMALLINT NOT NULL,
	CodigoSuper 	VARCHAR(10) NOT NULL,
    	Unidades	BIGINT NOT NULL DEFAULT 0,
    	Precio		decimal(5,2),
    	Oferta		BOOLEAN DEFAULT false,
	CONSTRAINT pk_idproducto_codigosuper PRIMARY KEY (IDProducto,CodigoSuper),
    	CONSTRAINT fk_idproducto FOREIGN KEY (IDProducto) REFERENCES productos(ID) ON DELETE CASCADE,
    	CONSTRAINT fk_codigosuper FOREIGN KEY (CodigoSuper) REFERENCES supermercados(codigo) ON DELETE CASCADE
);

/* Supermercados */
INSERT INTO supermercados VALUES('mer1','Mercadona','Alcoy', '46873','Santa Rosa');
INSERT INTO supermercados VALUES('mer2','Mercadona','Alcoy', '46872', 'Zona norte');
INSERT INTO supermercados VALUES('lidl1','Lidl','Alcoy', '46871', 'Zona norte');
INSERT INTO supermercados VALUES('lidl2','Lidl','Alcoy', '46881', 'Santa Rosa');
INSERT INTO supermercados VALUES('carr1','Carrefour','Cocentaina', '48881', 'Avenida del Sol');
INSERT INTO supermercados VALUES('carr2','Carrefour','Alcoy', '46881', 'Santa Rosa');

/* Productos */
INSERT INTO productos VALUES('1','nocilla');
INSERT INTO productos VALUES('2','leche');
INSERT INTO productos VALUES('3','pan');
INSERT INTO productos VALUES('4','agua');
INSERT INTO productos VALUES('5','aceite');
INSERT INTO productos VALUES('6','mayonesa');
INSERT INTO productos VALUES('7','uvas');
INSERT INTO productos VALUES('8','manzanas');
INSERT INTO productos VALUES('9','platanos');
INSERT INTO productos VALUES('10','arroz');

/* Existencias */
INSERT INTO existencias VALUES('1','mer1','320', '2.61',false);
INSERT INTO existencias VALUES('1','mer2','420', '2.61',true);
INSERT INTO existencias VALUES('1','lidl1','100', '2.23',false);
INSERT INTO existencias VALUES('1','lidl2','2', '2.23',false);
INSERT INTO existencias VALUES('1','carr1','0', '2.80',false);
INSERT INTO existencias VALUES('1','carr2','740', '2.80',false);
INSERT INTO existencias VALUES('2','mer1','999', '1.43',false);
INSERT INTO existencias VALUES('2','mer2','2333', '1.43',false);
INSERT INTO existencias VALUES('2','lidl1','2112', '1.44',false);
INSERT INTO existencias VALUES('2','lidl2','2422', '1.21',true);
INSERT INTO existencias VALUES('2','carr1','765', '1.21',false);
INSERT INTO existencias VALUES('2','carr2','213', '1.45',false);
INSERT INTO existencias VALUES('3','mer1','233', '0.89',false);
INSERT INTO existencias VALUES('3','mer2','567', '0.89',false);
INSERT INTO existencias VALUES('3','lidl1','798', '0.99',true);
INSERT INTO existencias VALUES('3','lidl2','123', '0.99',false);
INSERT INTO existencias VALUES('3','carr1','321', '0.66',false);
INSERT INTO existencias VALUES('3','carr2','423', '0.66',true);
INSERT INTO existencias VALUES('4','mer1','4556', '0.60',false);
INSERT INTO existencias VALUES('4','mer2','3443', '0.60',true);
INSERT INTO existencias VALUES('4','lidl1','1332', '0.79',false);
INSERT INTO existencias VALUES('4','lidl2','3226', '0.79',false);
INSERT INTO existencias VALUES('4','carr1','2322', '0.86',false);
INSERT INTO existencias VALUES('4','carr2','4230', '0.86',false);
INSERT INTO existencias VALUES('5','mer1','2', '3.60',false);
INSERT INTO existencias VALUES('5','mer2','3', '3.60',false);
INSERT INTO existencias VALUES('5','lidl1','0', '1.79',true);
INSERT INTO existencias VALUES('5','lidl2','0', '1.79',false);
INSERT INTO existencias VALUES('5','carr1','1', '2.86',false);
INSERT INTO existencias VALUES('5','carr2','3', '2.86',false);
INSERT INTO existencias VALUES('6','mer1','160', '1.60',false);
INSERT INTO existencias VALUES('6','mer2','187', '1.60',false);
INSERT INTO existencias VALUES('6','lidl1','231', '0.79',true);
INSERT INTO existencias VALUES('6','lidl2','145', '0.79',true);
INSERT INTO existencias VALUES('6','carr1','167', '1.86',false);
INSERT INTO existencias VALUES('6','carr2','356', '1.86',false);
INSERT INTO existencias VALUES('7','mer1','435', '2.55',false);
INSERT INTO existencias VALUES('7','mer2','343', '2.55',false);
INSERT INTO existencias VALUES('7','lidl1','287', '2.49',true);
INSERT INTO existencias VALUES('7','lidl2','265', '2.49',false);
INSERT INTO existencias VALUES('7','carr1','347', '2.89',false);
INSERT INTO existencias VALUES('7','carr2','98', '2.89',false);
INSERT INTO existencias VALUES('8','mer1','253', '0.50',false);
INSERT INTO existencias VALUES('8','mer2','254', '0.50',true);
INSERT INTO existencias VALUES('8','lidl1','267', '0.45',false);
INSERT INTO existencias VALUES('8','lidl2','266', '0.45',false);
INSERT INTO existencias VALUES('8','carr1','244', '0.59',true);
INSERT INTO existencias VALUES('8','carr2','0', '0.59',false);
INSERT INTO existencias VALUES('9','mer1','245', '0.60',false);
INSERT INTO existencias VALUES('9','mer2','212', '0.60',true);
INSERT INTO existencias VALUES('9','lidl1','233', '0.40',false);
INSERT INTO existencias VALUES('9','lidl2','16', '0.40',false);
INSERT INTO existencias VALUES('9','carr1','0', '0.70',false);
INSERT INTO existencias VALUES('9','carr2','0', '0.70',false);
INSERT INTO existencias VALUES('10','mer1','1245', '0.89',true);
INSERT INTO existencias VALUES('10','mer2','1212', '0.89',true);
INSERT INTO existencias VALUES('10','lidl1','1233', '0.99',false);
INSERT INTO existencias VALUES('10','lidl2','1116', '0.99',false);
INSERT INTO existencias VALUES('10','carr1','1433', '0.79',false);
INSERT INTO existencias VALUES('10','carr2','2412', '0.79',false);

CREATE USER 'consultas'@'%' IDENTIFIED BY '987654321';
GRANT SELECT ON proyecto. * TO 'consultas'@'%';
FLUSH PRIVILEGES;