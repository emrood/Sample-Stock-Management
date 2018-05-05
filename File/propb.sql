-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Sam 05 Mai 2018 à 18:38
-- Version du serveur :  5.7.14
-- Version de PHP :  7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `propb`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
  `ID` int(11) NOT NULL,
  `f_name` varchar(300) NOT NULL,
  `phone` varchar(12) NOT NULL,
  `adress` varchar(300) NOT NULL,
  `email` varchar(300) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `clients`
--

INSERT INTO `clients` (`ID`, `f_name`, `phone`, `adress`, `email`) VALUES
(1, 'Jean Marc Alain', '36896932', '4, rue faubert, P-au-P', 'marcalain@gmail.com'),
(2, 'Delvas Junior', '36987458', '5, avenue panamericaine', 'dj2007@hotmail.com'),
(3, 'Monique Gilles', '34454543', '12, rue marechaud', 'gillesmoniques@yahoo.fr'),
(4, 'Matias Pierre', '45778294', '45, impasse Lovely', 'matyasnasj@yahoo.fr'),
(5, 'Matador mackendy', '36985425', '5, rue maillard', 'mackendymat@hotmail.com'),
(6, 'Wydline', 'ihihi', '5, Carrefour', 'hfjij@hotmail.com'),
(7, 'Wydline Pierre', '367874554', '5, Carrefour', 'hfjij@hotmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `comments`
--

CREATE TABLE `comments` (
  `ID` int(11) NOT NULL,
  `produits_id` int(11) DEFAULT NULL,
  `comment` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `produits`
--

CREATE TABLE `produits` (
  `ID` int(11) NOT NULL,
  `p_name` varchar(200) NOT NULL,
  `constructor` varchar(80) NOT NULL,
  `price` float NOT NULL,
  `quantite` int(11) NOT NULL,
  `type` varchar(100) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `produits`
--

INSERT INTO `produits` (`ID`, `p_name`, `constructor`, `price`, `quantite`, `type`, `status`) VALUES
(1, 'Jumex', 'REBO', 45, 45, 'Jus', 'Disponible'),
(2, 'Mangue', 'Mache Lakay', 50, 50, 'Fruits', 'Disponible'),
(3, 'Carnation', 'Junior S.A.', 67, 63, 'Produit laitier', 'Disponible'),
(4, 'Marinad', 'F&G S.A', 40.5, 92, 'Aliments et boissons', 'Disponible'),
(5, 'Sweety', 'REBO S.A', 31.5, 0, 'Jus en poudre', 'Rupture de stock'),
(6, 'Ventilateur', 'NASA', 45, 45, 'Electronique', 'Disponible'),
(7, 'Tampico', 'Tropic S.A', 67, 67, 'gazeuse', 'Disponible'),
(8, 'Toro', 'Brana', 98, 456, 'Aliments et boissons', 'Disponible'),
(9, 'Dell Latitude 2025', 'DELL', 25300, 100, 'Matériel informatique', 'Disponible'),
(10, 'Akasan', 'Local S.A', 55.9, 93, 'Aliments et boissons', 'Disponible'),
(12, 'Chaise', 'Canez S.A', 87, 658, 'Meubles', 'Disponible'),
(13, 'Viande Moulue', 'uhu', 56.9, 234, 'Viandes et poissons', 'Disponible'),
(14, 'Manba', 'Produit local S.A', 230, 400, 'Conserve', 'Disponible'),
(15, 'Ciseaux', 'KONA S.A', 45, 120, 'Fournitures', 'Disponible'),
(16, 'Ipad A1632', 'Apple', 45900, 20, 'Materiel Informatique', 'Disponible'),
(17, 'Samsung Galaxy Grand 3', 'Samsung', 25200, 100, 'Matereil Informatique', 'Disponible');

-- --------------------------------------------------------

--
-- Structure de la table `transactions`
--

CREATE TABLE `transactions` (
  `ID` int(11) NOT NULL,
  `client_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `produit_id` int(11) DEFAULT NULL,
  `quantite` int(11) NOT NULL,
  `total` float NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `transactions`
--

INSERT INTO `transactions` (`ID`, `client_id`, `user_id`, `produit_id`, `quantite`, `total`, `date`) VALUES
(1, 1, 1, 2, 45, 45667, '2018-01-14'),
(2, 1, 1, 4, 34, 45345, '2018-01-15'),
(3, 1, 1, 6, 12, 3453, '2017-11-12'),
(4, 1, 1, 3, 4, 345, '2018-02-13'),
(5, 2, 2, 6, 4, 345, '2018-01-14'),
(6, 1, 2, 5, 456, 23423, '2018-01-16'),
(7, 2, 2, 5, 345, 345656, '2018-03-11'),
(8, 3, 1, 6, 4, 268, '2018-03-03'),
(9, 4, 1, 2, 6, 402, '2018-05-03'),
(10, 1, 1, 1, 5, 250, '2018-05-03'),
(11, 5, 1, 6, 4, 268, '2018-05-04'),
(12, 4, 1, 3, 0, 268, '2018-05-05');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `vendor_name` varchar(300) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`ID`, `vendor_name`, `password`) VALUES
(1, 'Nicolas', 'admin'),
(2, 'Martine', 'vendeur2'),
(3, 'Julien', 'vendeur3');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `fk_comments_produits` (`produits_id`);

--
-- Index pour la table `produits`
--
ALTER TABLE `produits`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `fk_transactions_produits` (`produit_id`),
  ADD KEY `fk_transactions_clients` (`client_id`),
  ADD KEY `fk_transactions_users` (`user_id`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `password` (`password`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT pour la table `produits`
--
ALTER TABLE `produits`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT pour la table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
