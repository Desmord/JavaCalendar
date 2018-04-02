-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Czas generowania: 02 Kwi 2018, 18:51
-- Wersja serwera: 10.1.30-MariaDB
-- Wersja PHP: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `plants`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `plants`
--

CREATE TABLE `plants` (
  `name` varchar(50) NOT NULL,
  `spray` varchar(10) NOT NULL,
  `sparyDays` varchar(10) NOT NULL,
  `watering` varchar(10) NOT NULL,
  `wateringDays` varchar(10) NOT NULL,
  `exaggeration` varchar(10) NOT NULL,
  `exaggerationDays` varchar(10) NOT NULL,
  `pruning` varchar(10) NOT NULL,
  `pruningDays` varchar(10) NOT NULL,
  `fertilization` varchar(10) NOT NULL,
  `fertilizationDays` varchar(10) NOT NULL,
  `plantingDescription` varchar(500) DEFAULT NULL,
  `wateringDescription` varchar(500) DEFAULT NULL,
  `requirementsDescription` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `plants`
--

INSERT INTO `plants` (`name`, `spray`, `sparyDays`, `watering`, `wateringDays`, `exaggeration`, `exaggerationDays`, `pruning`, `pruningDays`, `fertilization`, `fertilizationDays`, `plantingDescription`, `wateringDescription`, `requirementsDescription`) VALUES
('Cytryna', '2018-04-02', '1', '2018-04-01', '5', '2018-03-20', '120', '2018-01-01', '90', '2018-01-01', '180', 'Cytryna zwyczaja', 'woda przegotowana miekka', 'ph5-6.5 slonecznie'),
('Kawa', '2018-04-02', '1', '2018-04-01', '5', '2018-03-20', '120', '2018-01-01', '90', '2018-01-01', '180', 'Cytryna zwyczaja', 'woda przegotowana miekka', 'ph5-6.5 slonecznie'),
('Skrzydokwiat', '2018-04-02', '1', '2018-04-01', '5', '2018-03-20', '120', '2018-01-01', '90', '2018-01-01', '180', 'Cytryna zwyczaja', 'woda przegotowana miekka', 'ph5-6.5 slonecznie');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
