-- Crear tabla: PROVINCIA
CREATE TABLE provincia(
    id_provincia INT,
    nombre VARCHAR(30),
    CONSTRAINT pk_provincia PRIMARY KEY(id_provincia)
);
-- Crear tabla: DEPARTAMENTO
CREATE TABLE departamento(
    id_departamento INT,
    nombre VARCHAR(30) DEFAULT 'Nuevo',
    presupuesto FLOAT CHECK
        (
            presupuesto BETWEEN 1000 AND 5000
        ),
        id_provincia INT,
        CONSTRAINT pk_departamento PRIMARY KEY(id_departamento),
        CONSTRAINT fk_provincia FOREIGN KEY(id_provincia) REFERENCES provincia(id_provincia)
);
-- Crear tabla: TRABAJADOR
CREATE TABLE trabajador(
    id_trabajador INT,
    nombre VARCHAR(30),
    salario FLOAT CHECK
        (salario >= 0),
        comision FLOAT
    CHECK
        (comision < salrio / 2),
        id_provincia INT,
        id_departamento INT,
        CONSTRAINT pk_trabajador PRIMARY KEY(id_trabajador),
        CONSTRAINT fk_provincia FOREIGN KEY(id_provincia) REFERENCES provincia(id_provincia),
        CONSTRAINT fk_departamento FOREIGN KEY(id_departamento) REFERENCES departamento(id_departamento)
);
-- Crear tabla: PROVINCIA
CREATE TABLE provincia(
    id_provincia INT,
    nombre VARCHAR(30),
    CONSTRAINT pk_provincia PRIMARY KEY(id_provincia)
);
-- Crear tabla: DEPARTAMENTO
CREATE TABLE departamento(
    id_departamento INT,
    nombre VARCHAR(30) DEFAULT 'Nuevo',
    presupuesto FLOAT CHECK
        (
            presupuesto BETWEEN 1000 AND 5000
        ),
        id_provincia INT,
        CONSTRAINT pk_departamento PRIMARY KEY(id_departamento),
        CONSTRAINT fk_provincia FOREIGN KEY(id_provincia) REFERENCES provincia(id_provincia)
);
-- Crear tabla: TRABAJADOR
CREATE TABLE trabajador(
    id_trabajador INT,
    nombre VARCHAR(30),
    salario FLOAT CHECK
        (salario >= 0),
        comision FLOAT
    CHECK
        (comision < salrio / 2),
        id_provincia INT,
        id_departamento INT,
        CONSTRAINT pk_trabajador PRIMARY KEY(id_trabajador),
        CONSTRAINT fk_provincia FOREIGN KEY(id_provincia) REFERENCES provincia(id_provincia),
        CONSTRAINT fk_departamento FOREIGN KEY(id_departamento) REFERENCES departamento(id_departamento)
);
