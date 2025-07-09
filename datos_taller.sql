-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-04-2025 a las 23:24:19
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

-- Nombre de la BASE DE DATOS: datos_taller

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `datos_taller`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `customers`
--

CREATE TABLE `customers` (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `customer_lastname` varchar(50) NOT NULL,
  `customer_identification` varchar(50) NOT NULL,
  `customer_number` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `customers`
--

INSERT INTO `customers` (`customer_id`, `customer_name`, `customer_lastname`, `customer_identification`, `customer_number`) VALUES
(3, 'Juan', 'Perez', '12345', '112233');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parts`
--

CREATE TABLE `parts` (
  `part_id` int(11) NOT NULL,
  `part_description` varchar(50) NOT NULL,
  `part_quantity` int(50) NOT NULL,
  `part_unit_cost` double NOT NULL,
  `part_brand` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `parts`
--

INSERT INTO `parts` (`part_id`, `part_description`, `part_quantity`, `part_unit_cost`, `part_brand`) VALUES
(1, 'Aceite', 9, 30000, 'mobile'),
(2, 'Bateria', 5, 90000, 'Panther');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repairs`
--

CREATE TABLE `repairs` (
  `repair_id` int(11) NOT NULL,
  `repair_description` varchar(50) NOT NULL,
  `repair_cost` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `repairs`
--

INSERT INTO `repairs` (`repair_id`, `repair_description`, `repair_cost`) VALUES
(1, 'Carburacion', 50000),
(2, 'Despinchar', 15000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sales`
--

CREATE TABLE `sales` (
  `sale_id` int(11) NOT NULL,
  `sale_customer_identification` varchar(50) NOT NULL,
  `sale_vehicle_registration` varchar(50) NOT NULL,
  `sale_vehicle_model` varchar(50) NOT NULL,
  `sale_vehicle_brand` varchar(50) NOT NULL,
  `sale_vehicle_displacement` int(11) NOT NULL,
  `sale_vehicle_color` varchar(50) NOT NULL,
  `sale_repair_id` int(11) NOT NULL,
  `sale_part_id` int(11) NOT NULL,
  `sale_description` varchar(50) NOT NULL,
  `sale_date` varchar(50) NOT NULL,
  `sale_total_cost` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `sales`
--

INSERT INTO `sales` (`sale_id`, `sale_customer_identification`, `sale_vehicle_registration`, `sale_vehicle_model`, `sale_vehicle_brand`, `sale_vehicle_displacement`, `sale_vehicle_color`, `sale_repair_id`, `sale_part_id`, `sale_description`, `sale_date`, `sale_total_cost`) VALUES
(2, '12345', 'qwerty', '2025', 'yamaha', 150, 'negro', 2, 1, 'Despinchar llanta trasera y cambiar el aceite', 'Fri Apr 25 00:00:00 GMT-05:00 2025', 45000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`user_id`, `user_name`, `user_email`, `user_password`) VALUES
(1, 'admin', 'admin@gmail.com', '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customer_id`),
  ADD UNIQUE KEY `customer_identification` (`customer_identification`);

--
-- Indices de la tabla `parts`
--
ALTER TABLE `parts`
  ADD PRIMARY KEY (`part_id`);

--
-- Indices de la tabla `repairs`
--
ALTER TABLE `repairs`
  ADD PRIMARY KEY (`repair_id`);

--
-- Indices de la tabla `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`sale_id`),
  ADD KEY `sale_repair_id` (`sale_repair_id`),
  ADD KEY `sale_part_id` (`sale_part_id`),
  ADD KEY `sale_customer_identification` (`sale_customer_identification`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `user_email` (`user_email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `customers`
--
ALTER TABLE `customers`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `parts`
--
ALTER TABLE `parts`
  MODIFY `part_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `repairs`
--
ALTER TABLE `repairs`
  MODIFY `repair_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `sales`
--
ALTER TABLE `sales`
  MODIFY `sale_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`sale_part_id`) REFERENCES `parts` (`part_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sales_ibfk_3` FOREIGN KEY (`sale_repair_id`) REFERENCES `repairs` (`repair_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sales_ibfk_4` FOREIGN KEY (`sale_customer_identification`) REFERENCES `customers` (`customer_identification`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
