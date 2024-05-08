CREATE DATABASE servimotos;
USE servimotos;

CREATE TABLE IF NOT EXISTS reporte (
    id_reporte INT PRIMARY KEY auto_increment,
    fecha date,
    monto_total DECIMAL(20)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS cliente (
    id_cliente INT PRIMARY KEY auto_increment,
    dni INT,
    nombre VARCHAR(30),
    telefono VARCHAR(30),
    direccion VARCHAR(30),
    indicador VARCHAR(2)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS proveedor (
    id_proveedor INT PRIMARY KEY auto_increment,
    nombre VARCHAR(30),
    telefono VARCHAR(30),
    ruc VARCHAR(30),
    direccion VARCHAR(30),
    indicador VARCHAR(2)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS boleta (
    id_boleta INT PRIMARY KEY auto_increment,
    id_cliente INT,
    id_reporte INT,
    monto_total DECIMAL(20),
    indicador VARCHAR(2),
    fecha DATE,
    CONSTRAINT fk_cliente FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
    CONSTRAINT fk_reporte FOREIGN KEY (id_reporte) REFERENCES reporte(id_reporte)
) Engine=InnoDb;

CREATE TABLE IF NOT EXISTS producto (
    id_producto INT PRIMARY KEY auto_increment, 
    id_proveedor INT,
    codigo VARCHAR(30),
    marca VARCHAR(30),
    nombre VARCHAR(30),
    costo_unidad DECIMAL(20),
    precio_venta DECIMAL(20),
    stock INT,
    indicador VARCHAR(2),
    constraINT fk_proveedor foreign KEY (id_proveedor) references proveedor(id_proveedor)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS detalle_boleta (
    id_detalle_boleta int primary key auto_increment,
    id_producto INT,
    id_boleta INT,
    cantidad INT,
    monto_total DECIMAL(20),
    indicador VARCHAR(2),
    CONSTRAINT fk_producto foreign key (id_producto) references producto(id_producto),
    CONSTRAINT fk_boleta foreign KEY (id_boleta) references boleta(id_boleta)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS administrador (
    id_admin INT PRIMARY KEY auto_increment,
    nombres VARCHAR(30), 
    password VARCHAR(60)
)

