CREATE TABLE TBL_Rol(
    id_rol int AUTO_INCREMENT PRIMARY KEY,
    nombre_rol varchar(15) NOT NULL,
    Descripcion varchar(15)
);

CREATE TABLE TBL_Area(
    id_area int AUTO_INCREMENT PRIMARY KEY,
    nombre_area varchar(15) NOT NULL,
    num_empleados int
);

CREATE TABLE TBL_Proveedor(
    id_proveedor int AUTO_INCREMENT NOT NULL PRIMARY KEY ,
    nom_prove varchar(15) NOT NULL,
    telefono varchar(15)
);

CREATE TABLE TBL_Venta(
    id_venta int AUTO_INCREMENT PRIMARY KEY,
    fechaIngreso datetime NOT NULL,
    importe decimal(6,2) NOT NULL,
    cambio decimal(6,2) NOT NULL
);

CREATE TABLE TBL_Usuario(
    id_usuario int AUTO_INCREMENT PRIMARY KEY,
    nombre_usr varchar(15) NOT NULL,
    contraseña varchar(30) NOT NULL,
    ult_ingreso varchar(15) NOT NULL,
    id_rol int,
    id_area int,
    FOREIGN KEY (id_rol) REFERENCES TBL_Rol(id_rol),
    FOREIGN KEY (id_area) REFERENCES  TBL_Area(id_area)
);

CREATE TABLE TBL_Producto(
    id_producto int AUTO_INCREMENT PRIMARY KEY,
    nombre_prod varchar(30) NOT NULL,
    precio decimal(6,2) NOT NULL,
    cant_bodega int,
    id_proveedor int,
    FOREIGN KEY (id_proveedor) REFERENCES TBL_Proveedor(id_proveedor)
);

CREATE TABLE TBL_CompraVenta(
    id_compravnta int AUTO_INCREMENT PRIMARY KEY,
    fecha_vnta date NOT NULL,
    cantidad decimal(6,2),
);


