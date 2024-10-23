-- Construction BDD --

DROP DATABASE IF EXISTS CoursesShop;
CREATE DATABASE CoursesShop;
USE CoursesShop;

-- Construction de la table des catégories -- 

CREATE TABLE T_Categories (
	IdCategory INT(4) NOT NULL AUTO_INCREMENT,
	CatName VARCHAR(30) NOT NULL,
	CatDescription VARCHAR(100) NOT NULL,
) ENGINE = InnoDB;

INSERT INTO T_Categories (IdCategory, CatName, CatDescription) VALUES (1, 'Java', 'tout ce qu"il y a à savoir sur Java');
INSERT INTO T_Categories (IdCategory, CatName, CatDescription) VALUES (2, 'Web', 'Mise en forma page web');
INSERT INTO T_Categories (IdCategory, CatName, CatDescription) VALUES (3, 'Autre', 'Autre que Java: langage de programmation, frameworks...');

SELECT * FROM T_Categories;

-- Construction de la tables des formations -- 

CREATE TABLE T_Courses (
	IdCourse INT(4) PRIMARY KEY AUTO_INCREMENT,
	CourName VARCHAR(30) NOT NULL,
	CourDescription VARCHAR(100) NOT NULL,
	Duration INT(11) NOT NULL DEFAULT '0',
	Format VARCHAR(30) NOT NULL,
	Price FLOAT(8) NOT NULL DEFAULT '0',
	IdCategory INT(4),
	FOREIGN KEY (IdCategory) REFERENCES T_Categories(IdCategory)
) ENGINE = InnoDB; 

INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('Java', 'Java SE8: Syntaxe et POO', 20, 'Presentiel', 100, 1);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('Java avancee', 'Exceptions, fichier Jdbc, thread...', 20, 'Presentiel', 100, 1);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('Spring', 'Spring core/MVC/Security', 20, 'Presentiel', 100, 1);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('PHP frameworks', 'Symphony', 15, 'Distanciel', 80, 3);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('C#', 'DotNet Core', 20, 'Distanciel', 100, 3);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('HTML', 'Syntaxe', 15, 'Distanciel', 80, 2);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('CSS', 'Syntaxe', 15, 'Distanciel', 80, 2);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('UML', 'Use case, Diagramme de classe et de séquence', 20, 'Presentiel', 100, 3);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('Figma', 'les différentes fonctionnalités', 10, 'Distanciel', 50, 3);
INSERT INTO T_Courses ( CourName, CourDescription, Duration, Format, Price , IdCategory ) VALUES ('Eclipse', 'les différentes fonctionnalités', 10, 'Distanciel', 50, 3);

SELECT * FROM  T_Courses;