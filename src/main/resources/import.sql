INSERT INTO `bureau` VALUES(1, 'Mairie');
INSERT INTO `bureau` VALUES(2, 'Salle des fêtes');
INSERT INTO `bureau` VALUES(3, 'Ambroise Paré');
INSERT INTO `bureau` VALUES(4, 'Jules Ferry');
INSERT INTO `bureau` VALUES(5, "Jeanne d'Arc");
INSERT INTO `bureau` VALUES(6, 'Salle Descartes');
INSERT INTO `bureau` VALUES(7, 'Salle Clément Marot');
INSERT INTO `bureau` VALUES(8, 'Médiathèque');
INSERT INTO `bureau` VALUES(9, 'Paul-Louis Courrier');
INSERT INTO `bureau` VALUES(10, 'Théâtre Beaumarchais');

INSERT INTO `liste`(`id`,`tete_de_liste`,`nom_de_liste`) VALUES(1, "Thierry Boutard", "Ensemble, agissons pour Amboise");
INSERT INTO `liste`(`id`,`tete_de_liste`,`nom_de_liste`) VALUES(2, "Brice Ravier", "Jouons collectifs !");
INSERT INTO `liste`(`id`,`tete_de_liste`,`nom_de_liste`) VALUES(3, "Sandra Guichard", "Amboise 2020 réinventons demain");
INSERT INTO `liste`(`id`,`tete_de_liste`,`nom_de_liste`) VALUES(4, "Christophe Galland", "Un nouvel élan pour Amboise");
INSERT INTO `liste`(`id`,`tete_de_liste`,`nom_de_liste`) VALUES(96, NULL, "Nuls");
INSERT INTO `liste`(`id`,`tete_de_liste`,`nom_de_liste`) VALUES(97, NULL, "Blancs");
INSERT INTO `liste`(`id`,`tete_de_liste`,`nom_de_liste`) VALUES(98, NULL, "Votants");
INSERT INTO `liste`(`id`,`tete_de_liste`,`nom_de_liste`) VALUES(99, NULL, "Inscrits");

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(1,99,897);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(2,99,853);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(3,99,1058);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(4,99,583);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(5,99,846);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(6,99,813);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(7,99,964);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(8,99,723);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(9,99,793);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(10,99,912);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(1,98,589);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(2,98,517);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(3,98,667);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(4,98,326);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(5,98,456);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(6,98,478);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(7,98,554);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(8,98,526);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(9,98,521);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(10,98,559);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(1,97,54);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(2,97,7);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(3,97,16);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(4,97,5);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(5,97,5);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(6,97,5);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(7,97,3);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(8,97,6);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(9,97,12);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(10,97,9);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(1,96,18);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(2,96,29);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(3,96,28);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(4,96,18);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(5,96,13);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(6,96,14);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(7,96,26);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(8,96,21);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(9,96,16);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(10,96,25);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(1,1,262);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(1,2,185);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(1,3,52);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(1,4,72);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(2,1,193);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(2,2,168);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(2,3,49);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(2,4,78);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(3,1,282);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(3,2,181);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(3,3,79);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(3,4,97);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(4,1,145);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(4,2,84);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(4,3,28);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(4,4,51);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(5,1,222);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(5,2,117);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(5,3,46);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(5,4,58);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(6,1,279);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(6,2,106);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(6,3,45);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(6,4,34);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(7,1,256);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(7,2,155);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(7,3,64);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(7,4,53);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(8,1,273);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(8,2,116);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(8,3,62);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(8,4,54);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(9,1,254);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(9,2,155);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(9,3,42);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(9,4,54);

INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(10,1,246);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(10,2,169);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(10,3,89);
INSERT INTO `scrutin`(`bureau_id`, `liste_id`, `voix`)  VALUES(10,4,70);