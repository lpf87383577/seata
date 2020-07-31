/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50649
Source Host           : localhost:3306
Source Database       : bank_b

Target Server Type    : MYSQL
Target Server Version : 50649
File Encoding         : 65001

Date: 2020-07-31 15:17:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account_b
-- ----------------------------
DROP TABLE IF EXISTS `account_b`;
CREATE TABLE `account_b` (
  `id` varchar(255) NOT NULL,
  `account` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
