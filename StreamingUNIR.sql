CREATE DATABASE StreamingUNIR;

USE StreamingUNIR;

CREATE TABLE IF NOT EXISTS Usuario (
	idUser INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50) NULL,
	username VARCHAR(20) NOT NULL,
	correo VARCHAR(50) NULL,
	password VARCHAR(15) NOT NULL,
	PRIMARY KEY(idUser)
);

CREATE TABLE IF NOT EXISTS TipoMovimiento (
	idTipoMov INT AUTO_INCREMENT,
	tipo VARCHAR(20),
	PRIMARY KEY(idTipoMov)
);

INSERT INTO TipoMovimiento (tipo) VALUES ('Alquiler');
INSERT INTO TipoMovimiento (tipo) VALUES ('Compra');

CREATE TABLE IF NOT EXISTS Bitacora (
	idBitacora INT NOT NULL AUTO_INCREMENT,
    idMultimediabitacorabitacora_ibfk_2bitacora_ibfk_1 INT NOT NULL,
	idTipoMov INT NOT NULL,
	idUusuarioser INT NULL,
	username VARCHAR(20),
	fecha DATE,
	PRIMARY KEY(idBitacora),
    FOREIGN KEY(idMultimedia) REFERENCES Multimedia(idMultimedia),
	FOREIGN KEY(idUser) REFERENCES Usuario(idUser),
	FOREIGN KEY(idTipoMov) REFERENCES TipoMovimiento(idTipoMov)
);


CREATE TABLE IF NOT EXISTS Categoria (
	idCategoria INT NOT NULL AUTO_INCREMENT,
	categoria VARCHAR(30),
	PRIMARY KEY(idCategoria)
);

INSERT INTO Categoria (categoria) VALUES ('Pelicula');
INSERT INTO Categoria (categoria) VALUES ('Serie');
INSERT INTO Categoria (categoria) VALUES ('Kdrama');
INSERT INTO Categoria (categoria) VALUES ('Anime');
INSERT INTO Categoria (categoria) VALUES ('Documental');
INSERT INTO Categoria (categoria) VALUES ('Shows');

CREATE TABLE IF NOT EXISTS Genero (
	idGenero INT NOT NULL AUTO_INCREMENT,
	genero VARCHAR(30),
	PRIMARY KEY(idGenero)
);

INSERT INTO Genero (genero) VALUES ('Accion');
INSERT INTO Genero (genero) VALUES ('Sci-Fi');
INSERT INTO Genero (genero) VALUES ('Terror');
INSERT INTO Genero (genero) VALUES ('Drama');
INSERT INTO Genero (genero) VALUES ('Romance');
INSERT INTO Genero (genero) VALUES ('Comedia');

CREATE TABLE IF NOT EXISTS Multimedia (
	idMultimedia INT NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(50),
	sinopsis VARCHAR(250),
	director VARCHAR(50),
	anio_publicacion INT,
	duraciongenero VARCHAR(15),
	criticas VARCHAR(30),
	trailer VARCHAR(50),
	idCategoria INT,
	idGenero INT,
	anio_Subido VARCHAR(15),
	imagen VARCHAR(250),
	PRIMARY KEY(idMultimedia),
	FOREIGN KEY(idCategoria) REFERENCES Categoria(idCategoria),
	FOREIGN KEY(idGenero) REFERENCES Genero(idGenero)
);

INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('Bastardo Sin Gloria',
 'II Guerra Mundial, Francia, Shosanna presencia la ejecución de su familia por orden del coronel nazi Hans Landa. Huye a Paris y adopta una nueva identidad como propietaria de un cine. Mientras el teniente Aldo Raine adiestra a un grupo de soldados judíos. Los hombres de Raine y una actriz alemana que agente doble, deben llevar a cabo una misión que hará caer a los jefes del Tercer Reich. El destino quiere que todos se encuentren bajo la marquesina de un cine donde Shosanna espera para vengarse.',
 'Quentin Tarantino',
 2009,
 '2h 33m',
 'https://www.rottentomatoes.com/m/inglourious_basterds/reviews',
 'https://www.youtube.com/watch?v=XrDTjOV7kU0',
 1,
 1,
 2009,
 'https://spoilertime.com/wp-content/uploads/2019/08/7e12ea38a8245339bab45ad785499ad5-576x1024.jpg');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('MAD MAX: Furia en camino', 'Aunque está decidido a vagar solo por el páramo post-apocalíptico, Mad Max se une a Furiosa, una comandante fugitiva, y su banda, quienes están tratando de escapar de un señor de la guerra.', 'George Miller', 2015, '2horas', 'https://www.rottentomatoes.com/m/mad_max_fury_road/reviews', 'https://www.youtube.com/watch?v=1bsnGZq2zDU', 1, 1, 2015, 'https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b1d1ee169328487.644a87f7d7000.jpg');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('El Justiciero', 'El exagente secreto estadounidense Robert McCall continúa combatiendo por su cuenta a secuestradores, maltratadores y otros delincuentes que se cruzan en su solitaria vida de conductor de un servicio de VTC. Ahora, sin embargo, va a tener que intervenir en un asunto que le afecta personalmente.', 'Antoine Fuqua', 2014, '2h 12m', 'https://www.rottentomatoes.com/m/the_equalizer_2013', 'https://www.youtube.com/watch?v=j7RlqH5PXLo', 1, 1, 2015, 'https://musicart.xboxlive.com/7/08350d00-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('Rescate Imposible', 'Un equipo del Delta Force sufre una emboscada en territorio enemigo, pero un oficial novato se niega a abandonar a sus compañeros. Se inicia entonces una batalla infernal por la supervivencia en la que solo reciben la ayuda de un piloto de drones.', 'William Eubank', 2024, '1h 54m', 'https://www.rottentomatoes.com/m/land_of_bad', 'https://www.youtube.com/watch?v=oNV-Lubri8s', 1, 1, 2024, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8JKzEuacLE_RTIVhVMWmgdghm2Ckkvpt4fQ&s');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('House of Dragon', 'La trama de esta serie, radica en la asunción al trono de Viserys Targaryen (Paddy Considine), quien, a falta de un heredero, deberá decidir quién será la persona que ocupe su lugar en el Trono de Hierro, después de su muerte.', 'Alan Taylor', 2024, '2 temporadas', 'https://www.rottentomatoes.com/tv/house_of_the_dragon', 'https://www.youtube.com/watch?v=-nbh77bt9jY&pp=ygUSbGEgY2FzYSBkZWwgZHJhZ29u', 2, 1, 2024, 'https://m.media-amazon.com/images/M/MV5BM2QzMGVkNjUtN2Y4Yi00ODMwLTg3YzktYzUxYjJlNjFjNDY1XkEyXkFqcGc@._V1_.jpg');

INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('Volver al futuro', 'Una máquina del tiempo transporta a un adolescente a los años 50, cuando sus padres todavía estudiaban en la secundaria.', 'Robert Zemeckis', 1985, '1h 56m', 'https://www.rottentomatoes.com/m/back_to_the_future', 'https://www.youtube.com/watch?v=GM6_MHRc4Xo', 1, 2, 1985, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSARwCFB6M36a-YEdVSHKjbJjAiic23UyYlvA&s');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('Presagio', 'Después de leer unas predicciones terribles en una cápsula del tiempo, un profesor de astronomía cree que su familia jugará un papel importante en unos eventos que están por suceder.', 'Alex Proyas', 2009, '2h 1m', 'https://www.rottentomatoes.com/m/presagio/reviews?type=user', 'https://www.youtube.com/watch?v=QeeiTXWEp-k&pp=ygUIcHJlc2FnaW8%3D', 1, 2, 2009, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrRKBDmbUQPyNOR8FEl9ZOuw3NRr5t6lIkww&s');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('El Origen', 'Dom Cobb es un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarles los secretos de sus subconscientes. Su habilidad lo ha vuelto muy popular en el mundo del espionaje corporativo, pero ha tenido un gran costo en la gente que ama.', 'Christopher Nolan', 2010, '2h 28m', 'https://www.rottentomatoes.com/m/inception/reviews', 'https://www.youtube.com/watch?v=BZOMKZ0AwC8&pp=ygUJZWwgb3JpZ2Vu', 1, 2, 2010, 'https://m.media-amazon.com/images/I/81RvLBMmKiL._AC_UF894,1000_QL80_.jpg');

INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('La Inmaculada', 'Una monja estadounidense llega a un convento de la campiña italiana. Allí descubre que, a pesar de ser virgen, está embarazada. Al mismo tiempo, comienza a sospechar que algo perverso ocurre entre los muros del convento.', 'Michael Mohan', 2024, '1h 29m', 'https://www.rottentomatoes.com/m/immaculate_2024/reviews', 'https://www.youtube.com/watch?v=1QbnnwkOXrU', 1, 3, 2024, 'https://static.cinepolis.com/resources/mx/movies/posters/414x603/45982-582191-20240403081748.jpg');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('Hell Girl', 'La historia gira en torno a una chica llamada Ai Enma cuya existencia es conocida sólo por un pequeño grupo de personas y la mayoría de estas personas la conocen como Jigoku Shoujo. Su existencia es conocida por el servicio que se rumorea que proporciona, aunque eso también está lejos de conocimiento común.', 'Takahiro Ōmori', 2005, '2 temporadas', 'https://www.rottentomatoes.com/tv/hell_girl/s01', 'https://www.youtube.com/watch?v=Zo5wuctIMWk&pp=ygUKaGVsbCBnaXJscw%3D%3D', 4, 3, 2005, 'https://imgsrv.crunchyroll.com/cdn-cgi/image/fit=contain,format=auto,quality=85,width=480,height=720/catalog/crunchyroll/31d961e6cef0710a252f964a367996a8.jpe');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('La Reina de Lagrimas', 'La reina de las tiendas departamentales y su esposo, proveniente de un pueblo pequeño, atraviesan una crisis conyugal hasta que el amor comienza a florecer otra vez.', 'Jang Young-woo', 2024, '1 temporada', 'https://www.rottentomatoes.com/tv/queen_of_tears', 'https://www.youtube.com/watch?v=7KrqSUG5fRo&pp=ygUYbGEgcmVpbmEgZGUgbGFzIGxhZ3JpbWFz', 3, 4, 2024, 'https://pics.filmaffinity.com/La_reina_de_las_laagrimas_Serie_de_TV-819654052-large.jpg');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('Casate con mi esposo', 'Cuando una mujer presencia la aventura entre su mejor amiga y su marido, y es asesinada por ellos, retrocede en el tiempo para cambiar su futuro y buscar venganza.', 'Park Won-kook', 2024, '1 temporada', 'https://www.rottentomatoes.com/tv/marry_my_husband', 'https://www.youtube.com/watch?v=VTrGmWRZMA4&pp=ygUUY2FzYXRlIGNvbiBtaSBlc3Bvc28%3D', 3, 5, 2024, 'https://m.media-amazon.com/images/S/pv-target-images/b126f64c26d9ea6b2d52f999c0475b428aaa2e33c981a1b7736e2ffe003d3d0a.png');
INSERT INTO Multimedia (titulo, sinopsis, director, anio_publicacion, duracion, criticas, trailer, idCategoria, idGenero, anio_Subido, imagen)
VALUES ('Son como niños', 'Un grupo de amigos y excompañeros descubren que envejecer no siempre significa madurar cuando se reúnen para honrar la memoria de su entrenador de baloncesto.', 'Dennis Dugan', 2010, '1h 42m', 'https://www.rottentomatoes.com/m/grown_ups', 'https://www.youtube.com/watch?v=yMEDiKD7cyE&pp=ygUXc29uIGNvbW8gbmnDsW9zIHRyYWlsZXI%3D', 1, 6, 2010, 'https://m.media-amazon.com/images/S/pv-target-images/7b86f2a7e80941d97c265348873a82c73450c0286ed1d1eeb7d86440ec707de5.jpg');

CREATE TABLE IF NOT EXISTS Inventario (
	idInvetario INT NOT NULL AUTO_INCREMENT,
	idTipoMov INT NOT NULL,
	idUser INT NULL,
	uername VARCHAR(30),
	PRIMARY KEY(idInvetario),
	FOREIGN KEY(idTipoMov) REFERENCES TipoMovimiento(idTipoMov)
);

