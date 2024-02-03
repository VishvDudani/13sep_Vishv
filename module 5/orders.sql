-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 03, 2024 at 05:23 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vishv`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `ord_no` int(11) DEFAULT NULL,
  `purch_amt` double DEFAULT NULL,
  `ord_date` varchar(20) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `salesman_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`ord_no`, `purch_amt`, `ord_date`, `customer_id`, `salesman_id`) VALUES
(70001, 150.5, '1997', 3005, 5002),
(70009, 270.65, '1993', 3001, 5005),
(70002, 65.26, '1997', 3002, 5001),
(70004, 110.5, '1987', 3009, 5003),
(70007, 948.5, '1993', 3005, 5002),
(70005, 2400.6, '1978', 3007, 5001),
(70008, 5760, '1993', 3002, 5001),
(70010, 1983.43, '1992', 3004, 5006),
(70003, 2480.4, '1992', 3009, 5003),
(70012, 250.45, '1979', 3008, 5002),
(70011, 75.29, '1987', 3003, 5007),
(70013, 3045.6, '1983', 3002, 5001);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD KEY `salesman_id` (`salesman_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`salesman_id`) REFERENCES `salespeople` (`salesman_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
