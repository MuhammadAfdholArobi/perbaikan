-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Nov 2023 pada 05.02
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uts_22090139_a`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_22090139_a`
--

CREATE TABLE `tabel_22090139_a` (
  `NO` int(11) NOT NULL,
  `nama_umkm` varchar(50) DEFAULT NULL,
  `bidang` enum('Kuliner','Fashion','Agrobisnis','Otomotif') DEFAULT NULL,
  `Tahun_pendirian` int(11) DEFAULT NULL,
  `kategori` enum('Usaha Mikro','Usaha Kecil','Usaha Menengah') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tabel_22090139_a`
--

INSERT INTO `tabel_22090139_a` (`NO`, `nama_umkm`, `bidang`, `Tahun_pendirian`, `kategori`) VALUES
(1, 'halo', 'Kuliner', 2023, 'Usaha Mikro'),
(2, 'sdcdsc', 'Fashion', 2223, 'Usaha Mikro'),
(3, 'sdasdsa', 'Fashion', 2223, 'Usaha Mikro'),
(4, 'sdasdsa', 'Fashion', 2223, 'Usaha Menengah');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tabel_22090139_a`
--
ALTER TABLE `tabel_22090139_a`
  ADD PRIMARY KEY (`NO`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tabel_22090139_a`
--
ALTER TABLE `tabel_22090139_a`
  MODIFY `NO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
