-- Insertar equipos
INSERT INTO equipo (id, nombre) VALUES (1, 'Equipo A');
INSERT INTO equipo (id, nombre) VALUES (2, 'Equipo B');

-- Insertar jugadores
INSERT INTO jugador (id, nombre, edad, posicion, equipo_id) VALUES (1, 'Jugador 1', 25, 'Delantero', 1);
INSERT INTO jugador (id, nombre, edad, posicion, equipo_id) VALUES (2, 'Jugador 2', 28, 'Defensa', 1);
INSERT INTO jugador (id, nombre, edad, posicion, equipo_id) VALUES (3, 'Jugador 3', 30, 'Portero', 2);
INSERT INTO jugador (id, nombre, edad, posicion, equipo_id) VALUES (4, 'Jugador 4', 22, 'Mediocampista', 2);

-- Insertar partidos
INSERT INTO partido (id, equipo_local_id, equipo_visitante_id, fecha) VALUES (1, 1, 2, '2023-10-01 15:00:00');
INSERT INTO partido (id, equipo_local_id, equipo_visitante_id, fecha) VALUES (2, 2, 1, '2023-10-08 18:00:00');

-- Insertar resultados
INSERT INTO resultado (id, goles_local, goles_visitante, partido_id) VALUES (1, 2, 1, 1);
INSERT INTO resultado (id, goles_local, goles_visitante, partido_id) VALUES (2, 0, 3, 2);