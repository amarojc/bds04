INSERT INTO tb_user(email, password, created_At) VALUES('bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', TIMESTAMP WITH TIME ZONE '2023-07-23T18:49:07.12345Z');
INSERT INTO tb_user(email, password, created_At) VALUES('ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', TIMESTAMP WITH TIME ZONE '2023-07-23T18:49:07.12345Z' );

INSERT INTO tb_role(authority, created_At) VALUES ('ROLE_ADMIN', TIMESTAMP WITH TIME ZONE '2023-07-23T18:49:07.12345Z');
INSERT INTO tb_role(authority, created_At) VALUES ('ROLE_CLIENT', TIMESTAMP WITH TIME ZONE '2023-07-23T18:49:07.12345Z');


INSERT INTO tb_user_role(user_id, role_id) VALUES(1, 1);
INSERT INTO tb_user_role(user_id, role_id) VALUES(1, 2);
INSERT INTO tb_user_role(user_id, role_id) VALUES(2, 2);


INSERT INTO tb_city(name) VALUES ('São Paulo');
INSERT INTO tb_city(name) VALUES ('Brasília');
INSERT INTO tb_city(name) VALUES ('Fortaleza');
INSERT INTO tb_city(name) VALUES ('Salvador');
INSERT INTO tb_city(name) VALUES ('Manaus');
INSERT INTO tb_city(name) VALUES ('Curitiba');
INSERT INTO tb_city(name) VALUES ('Goiânia');
INSERT INTO tb_city(name) VALUES ('Belém');
INSERT INTO tb_city(name) VALUES ('Porto Alegre');
INSERT INTO tb_city(name) VALUES ('Rio de Janeiro');
INSERT INTO tb_city(name) VALUES ('Belo Horizonte');

INSERT INTO tb_event(name, date, url, city_id) VALUES ('Feira do Software', '2021-05-16', 'https://feiradosoftware.com', 1);
INSERT INTO tb_event(name, date, url, city_id) VALUES ('CCXP', '2021-04-13', 'https://ccxp.com.br', 1);
INSERT INTO tb_event(name, date, url, city_id) VALUES ('Congresso Linux', '2021-05-23', 'https://congressolinux.com.br', 2);
INSERT INTO tb_event(name, date, url, city_id) VALUES ('Semana Spring React', '2021-05-03', 'https://devsuperior.com.br', 3);
