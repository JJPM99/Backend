INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES('josejavi','12345',1,'Jose','Puerta','puertajj@hotmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES('alex99','12345',1,'Alejandro','Mariñez','alejandro_mx@hotmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');


INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (1,1);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2,2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2,1);