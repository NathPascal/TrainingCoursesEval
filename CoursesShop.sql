-- Construction BDD --
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS CoursesShop;
CREATE DATABASE CoursesShop;
USE CoursesShop;

-- Construction de la table des catégories d'articles --

CREATE TABLE T_Categories (
	IdCategory 				INT(4) 		 PRIMARY KEY AUTO_INCREMENT,
	CatName 				VARCHAR(30)  NOT NULL,
	Description 			VARCHAR(100) NOT NULL
) ENGINE = InnoDB;

insert into T_Categories (IdCategory, CatName, Description) values (1 , 'PC' , 'ordinateur portable ou pas');
insert into T_Categories (IdCategory, CatName, Description) values (2 , 'SmartPhone' , 'Tel derniere generation avec ecran tactile');
insert into T_Categories (IdCategory, CatName, Description) values (3 , 'Materiel IT' , 'Tout matos informatique');
insert into T_Categories (IdCategory, CatName, Description) values (4 , 'SE et Logiciel' , 'Systeme dexploitation et autre Software');

select * from t_categories;

-- -----------------------------------------------------------------------------
-- - Construction de la table des articles en vente                         ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Articles (
	IdArticle				int(4)		PRIMARY KEY AUTO_INCREMENT,
	Description				varchar(30)	NOT NULL,
	Brand					varchar(30)	NOT NULL,
	UnitaryPrice			float(8)	NOT NULL DEFAULT 0,
	IdCategory				int(4),
	FOREIGN KEY (IdCategory)	REFERENCES T_Categories(IdCategory)
) ENGINE = InnoDB;

INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory ) VALUES ( 'Souris'     ,	'Logitoch', 65			, 3 );
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory ) VALUES ( 'Clavier'    ,	'Microhard', 49.5 		, 3);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory ) VALUES ( 'Systeme d''exploitation',	'Fenetres Vistouille',	150 , 4);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'Tapis souris', 'Chapeau Bleu',5 		, 3);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'Cle USB 8 To', 'Syno', 8 				, 3);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'Laptop'      , 	'PH',	1199        , 1);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'CD x 500'    , 'CETME', 250 			, 3);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'DVD-R x 100' , 'CETME', 99 			, 3);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'DVD+R x 100' , 'CETME', 105			, 3);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'Batterie Laptop', 'PH',	80 			, 3);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'Casque Audio', 'Syno',	55 			, 3);
INSERT INTO T_Articles ( Description, Brand , IdCategory  ) VALUES ( 'WebCam'      , 	'Logitoch' 							, 3);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'MacBook', 'Apple',	2000 			, 1);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'S10', 'Samsung',	1500				, 2);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'Iphone150', 'Apple',	200000			, 2);
INSERT INTO T_Articles ( Description, Brand, UnitaryPrice , IdCategory  ) VALUES ( 'Office', 'Microsoft',	150 			, 4);


SELECT * FROM T_Articles;