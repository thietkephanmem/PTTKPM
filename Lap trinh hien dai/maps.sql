/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : maps

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-02-23 19:32:23
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
  `lat` varchar(45) DEFAULT NULL,
  `latnew` varchar(45) DEFAULT NULL,
  `lng` varchar(45) DEFAULT NULL,
  `lngnew` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`makh`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of khachhang
-- ----------------------------
INSERT INTO `khachhang` VALUES ('1', '237 nguyen van cu, quan 1, tp hcm', '0', '0', '10.764909', '10.764234437442415', '106.68192380000005', '106.68394082117925');
INSERT INTO `khachhang` VALUES ('2', '2 hung vuong, quan 10, tphcm', '123', '1', '10.7612533', '10.7612533', '106.67468980000001', '106.67468980000001');
INSERT INTO `khachhang` VALUES ('3', 'hcm', '123', null, null, null, null, null);

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
