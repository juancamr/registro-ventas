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

INSERT INTO producto (codigo, marca, nombre, costo_unidad, precio_venta, stock, indicador)
VALUES
    ('REP001', 'Marca1', 'Repuesto1', 10.50, 15.99, 50, 'OK'),
    ('REP002', 'Marca2', 'Repuesto2', 8.25, 12.99, 30, 'OK'),
    ('REP003', 'Marca3', 'Repuesto3', 12.75, 19.99, 20, 'OK'),
    ('REP004', 'Marca1', 'Repuesto4', 9.99, 14.99, 40, 'OK'),
    ('REP005', 'Marca2', 'Repuesto5', 7.50, 11.99, 60, 'OK'),
    ('REP006', 'Marca3', 'Repuesto6', 11.25, 16.99, 25, 'OK'),
    ('REP007', 'Marca1', 'Repuesto7', 13.50, 20.99, 35, 'OK'),
    ('REP008', 'Marca2', 'Repuesto8', 10.75, 17.99, 45, 'OK'),
    ('REP009', 'Marca3', 'Repuesto9', 9.25, 13.99, 55, 'OK'),
    ('REP010', 'Marca1', 'Repuesto10', 8.99, 12.99, 50, 'OK');

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
    username VARCHAR(20) unique key,
    password VARCHAR(70)
)

