/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : maps

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-02-21 07:34:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for khachhang
-- ----------------------------
DROP TABLE IF EXISTS `khachhang`;
CREATE TABLE `khachhang` (
  `makh` int(11) NOT NULL AUTO_INCREMENT,
  `diachi` varchar(200) DEFAULT NULL,
  `sdt` int(11) DEFAULT NULL,
  `loaixe` int(11) DEFAULT NULL,
  PRIMARY KEY (`makh`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of khachhang
-- ----------------------------
INSERT INTO `khachhang` VALUES ('1', '235 nguyen van cu, quan 1, tphcm', '1234', '0');
INSERT INTO `khachhang` VALUES ('2', '2 hung vuong, quan 10, tphcm', '123', '1');

-- ----------------------------
-- Table structure for taixe
-- ----------------------------
DROP TABLE IF EXISTS `taixe`;
CREATE TABLE `taixe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lat` varchar(45) DEFAULT NULL,
  `lng` varchar(45) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of taixe
-- ----------------------------
INSERT INTO `taixe` VALUES ('1', '10.762714', '10.762714', null);
INSERT INTO `taixe` VALUES ('2', '10.761743', '106.679452', null);
INSERT INTO `taixe` VALUES ('5', '10.7626391', '106.68202680000002', '227 Nguyễn Văn Cừ, phường 4, Quận 5, Hồ Chí Minh, Việt Nam');
INSERT INTO `taixe` VALUES ('9', '10.772843', '106.66001849999998', '268 Lý Thường Kiệt, phường 14, Quận 10, Hồ Chí Minh, Việt Nam');
