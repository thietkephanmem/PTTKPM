-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 24, 2017 at 11:20 AM
-- Server version: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `onlineshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `bangthamso`
--

CREATE TABLE `bangthamso` (
  `MaThamSo` int(11) NOT NULL,
  `TenThamSo` varchar(50) NOT NULL,
  `TinhTrang` varchar(20) NOT NULL,
  `GiaTri` varchar(50) NOT NULL,
  `Kieu` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `chitietdonhang`
--

CREATE TABLE `chitietdonhang` (
  `ma_donhang` int(20) NOT NULL,
  `ma_SP` varchar(50) NOT NULL,
  `soluong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `donhang`
--

CREATE TABLE `donhang` (
  `ma_don_hang` int(11) NOT NULL,
  `ten_don_hang` varchar(50) NOT NULL,
  `ngay_giao` datetime NOT NULL,
  `ngay_dat` datetime NOT NULL,
  `nguoi_nhan` varchar(50) NOT NULL,
  `diachi_nguoinhan` varchar(50) NOT NULL,
  `email_nguoinhan` varchar(50) NOT NULL,
  `SDT_nguoinhan` varchar(20) NOT NULL,
  `user` varchar(50) NOT NULL,
  `trang_thai` int(20) NOT NULL,
  `PTTT` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `giaban`
--

CREATE TABLE `giaban` (
  `gia` int(20) NOT NULL,
  `ngay_lap` datetime NOT NULL,
  `ma_sp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `loaisanpham`
--

CREATE TABLE `loaisanpham` (
  `ma_loai_sp` int(11) NOT NULL,
  `ten_loai_sp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `nguoidung`
--

CREATE TABLE `nguoidung` (
  `dia_chi` varchar(50) DEFAULT NULL,
  `ma_phanquyen` int(11) NOT NULL,
  `ten_nguoidung` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `user` varchar(50) NOT NULL,
  `ten_nguoi_dung` varchar(50) NOT NULL,
  `SDT` varchar(20) NOT NULL,
  `gioi_tinh` varchar(20) NOT NULL,
  `ngay_sinh` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `nhasanxuat`
--

CREATE TABLE `nhasanxuat` (
  `ma_nha_sx` int(20) NOT NULL,
  `ten_nha_sx` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `dia_chi` varchar(50) NOT NULL,
  `logo` varchar(50) NOT NULL,
  `SDT` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `phanquyen`
--

CREATE TABLE `phanquyen` (
  `ma_phanquyen` int(11) NOT NULL,
  `ten_phanquyen` varchar(50) NOT NULL,
  `mo_ta` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `phuongthucthanhtoan`
--

CREATE TABLE `phuongthucthanhtoan` (
  `ma_PTTT` int(20) NOT NULL,
  `ten_PTTT` varchar(50) NOT NULL,
  `mo_ta` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

CREATE TABLE `sanpham` (
  `ma_sp` varchar(20) NOT NULL,
  `ten_sp` varchar(50) NOT NULL,
  `mau_sac` varchar(20) DEFAULT NULL,
  `kich_thuoc` varchar(20) DEFAULT NULL,
  `gia` int(11) NOT NULL,
  `soluong` int(11) NOT NULL,
  `ma_loai` int(11) NOT NULL,
  `hinh_anh` varchar(50) NOT NULL,
  `ngay_nhap` date NOT NULL,
  `mo_ta` varchar(100) DEFAULT NULL,
  `trang_thai` varchar(20) DEFAULT NULL,
  `nha_sx` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `sanphamkhuyenmai`
--

CREATE TABLE `sanphamkhuyenmai` (
  `ma_sp_km` int(20) NOT NULL,
  `ngay_batdau_km` datetime NOT NULL,
  `ngay_ketthuc_km` datetime NOT NULL,
  `chiet_khau` int(20) NOT NULL,
  `ma_sp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bangthamso`
--
ALTER TABLE `bangthamso`
  ADD PRIMARY KEY (`MaThamSo`);

--
-- Indexes for table `chitietdonhang`
--
ALTER TABLE `chitietdonhang`
  ADD PRIMARY KEY (`ma_donhang`);

--
-- Indexes for table `donhang`
--
ALTER TABLE `donhang`
  ADD PRIMARY KEY (`ma_don_hang`);

--
-- Indexes for table `giaban`
--
ALTER TABLE `giaban`
  ADD PRIMARY KEY (`ngay_lap`,`ma_sp`);

--
-- Indexes for table `loaisanpham`
--
ALTER TABLE `loaisanpham`
  ADD PRIMARY KEY (`ma_loai_sp`);

--
-- Indexes for table `nguoidung`
--
ALTER TABLE `nguoidung`
  ADD PRIMARY KEY (`user`);

--
-- Indexes for table `nhasanxuat`
--
ALTER TABLE `nhasanxuat`
  ADD PRIMARY KEY (`ma_nha_sx`);

--
-- Indexes for table `phanquyen`
--
ALTER TABLE `phanquyen`
  ADD PRIMARY KEY (`ma_phanquyen`);

--
-- Indexes for table `phuongthucthanhtoan`
--
ALTER TABLE `phuongthucthanhtoan`
  ADD PRIMARY KEY (`ma_PTTT`);

--
-- Indexes for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`ma_sp`);

--
-- Indexes for table `sanphamkhuyenmai`
--
ALTER TABLE `sanphamkhuyenmai`
  ADD PRIMARY KEY (`ma_sp_km`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bangthamso`
--
ALTER TABLE `bangthamso`
  MODIFY `MaThamSo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `chitietdonhang`
--
ALTER TABLE `chitietdonhang`
  MODIFY `ma_donhang` int(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `donhang`
--
ALTER TABLE `donhang`
  MODIFY `ma_don_hang` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `loaisanpham`
--
ALTER TABLE `loaisanpham`
  MODIFY `ma_loai_sp` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `nhasanxuat`
--
ALTER TABLE `nhasanxuat`
  MODIFY `ma_nha_sx` int(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `phanquyen`
--
ALTER TABLE `phanquyen`
  MODIFY `ma_phanquyen` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `phuongthucthanhtoan`
--
ALTER TABLE `phuongthucthanhtoan`
  MODIFY `ma_PTTT` int(20) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
