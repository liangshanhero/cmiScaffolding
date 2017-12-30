/*
Navicat MySQL Data Transfer

Source Server         : localhost-3306
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-08-04 11:09:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '赵文耘《软件工程》');
INSERT INTO `book` VALUES ('2', '马世禄《数据库原理》');
INSERT INTO `book` VALUES ('3', '《现代软件测试原理》');
INSERT INTO `book` VALUES ('6', '《spring 3 reference》');
INSERT INTO `book` VALUES ('7', '《数据库基础》');
INSERT INTO `book` VALUES ('8', '《数据库高级技术》');
INSERT INTO `book` VALUES ('9', 'å¥½ç©');
INSERT INTO `book` VALUES ('10', 'Java');
INSERT INTO `book` VALUES ('11', 'Software Engineer');

-- ----------------------------
-- Table structure for book2course
-- ----------------------------
DROP TABLE IF EXISTS `book2course`;
CREATE TABLE `book2course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT '请添加一个名词',
  `book` bigint(20) NOT NULL,
  `course` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `teacher` (`course`),
  KEY `book` (`book`),
  CONSTRAINT `book2course_ibfk_1` FOREIGN KEY (`book`) REFERENCES `book` (`id`),
  CONSTRAINT `book2course_ibfk_2` FOREIGN KEY (`course`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book2course
-- ----------------------------
INSERT INTO `book2course` VALUES ('1', null, '1', '4');
INSERT INTO `book2course` VALUES ('2', null, '1', '5');
INSERT INTO `book2course` VALUES ('3', null, '1', '3');
INSERT INTO `book2course` VALUES ('4', null, '2', '1');
INSERT INTO `book2course` VALUES ('5', null, '7', '1');
INSERT INTO `book2course` VALUES ('6', null, '8', '1');
INSERT INTO `book2course` VALUES ('7', null, '3', '5');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '数据库');
INSERT INTO `course` VALUES ('3', '软件体系结构');
INSERT INTO `course` VALUES ('5', '软件工程');
INSERT INTO `course` VALUES ('4', '面向对象程序设计');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `housecertificate` bigint(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `housecertificate` (`housecertificate`),
  CONSTRAINT `department_ibfk_1` FOREIGN KEY (`housecertificate`) REFERENCES `housecertificate` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('3', '网络工程系', null);
INSERT INTO `department` VALUES ('4', '地理信息系', '2');
INSERT INTO `department` VALUES ('6', '数学系', null);

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device
-- ----------------------------
INSERT INTO `device` VALUES ('3', '扩音器');
INSERT INTO `device` VALUES ('5', '投影仪');
INSERT INTO `device` VALUES ('1', '服务器');
INSERT INTO `device` VALUES ('4', '计算机');

-- ----------------------------
-- Table structure for housecertificate
-- ----------------------------
DROP TABLE IF EXISTS `housecertificate`;
CREATE TABLE `housecertificate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `number` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `depart` bigint(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `depart` (`depart`),
  CONSTRAINT `housecertificate_ibfk_1` FOREIGN KEY (`depart`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of housecertificate
-- ----------------------------
INSERT INTO `housecertificate` VALUES ('2', '258', '番禺', '4');

-- ----------------------------
-- Table structure for idcard
-- ----------------------------
DROP TABLE IF EXISTS `idcard`;
CREATE TABLE `idcard` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `number` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `student` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `student` (`student`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of idcard
-- ----------------------------
INSERT INTO `idcard` VALUES ('1', '441823', '清远', '2017-03-01', '3');

-- ----------------------------
-- Table structure for idcard2student
-- ----------------------------
DROP TABLE IF EXISTS `idcard2student`;
CREATE TABLE `idcard2student` (
  `idcard` bigint(20) NOT NULL COMMENT '一对一的关系',
  `student` bigint(20) NOT NULL,
  PRIMARY KEY (`idcard`,`student`),
  UNIQUE KEY `student` (`student`) USING BTREE,
  UNIQUE KEY `idcard` (`idcard`),
  CONSTRAINT `idcard2student_ibfk_1` FOREIGN KEY (`idcard`) REFERENCES `idcard` (`id`),
  CONSTRAINT `idcard2student_ibfk_2` FOREIGN KEY (`student`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of idcard2student
-- ----------------------------
INSERT INTO `idcard2student` VALUES ('1', '4');

-- ----------------------------
-- Table structure for office
-- ----------------------------
DROP TABLE IF EXISTS `office`;
CREATE TABLE `office` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `department` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `article` (`department`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of office
-- ----------------------------
INSERT INTO `office` VALUES ('2', '111', '6');
INSERT INTO `office` VALUES ('3', '112', '6');
INSERT INTO `office` VALUES ('4', '113', '6');
INSERT INTO `office` VALUES ('5', '211', '6');
INSERT INTO `office` VALUES ('6', '212', '6');
INSERT INTO `office` VALUES ('7', '213', '6');
INSERT INTO `office` VALUES ('8', '508', '6');
INSERT INTO `office` VALUES ('9', '软件工程系主任办公室', '6');
INSERT INTO `office` VALUES ('10', '510', '6');

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '信息南楼510');
INSERT INTO `room` VALUES ('2', '教三302');
INSERT INTO `room` VALUES ('3', '启林S501');
INSERT INTO `room` VALUES ('6', '风雨体育馆');

-- ----------------------------
-- Table structure for room2device
-- ----------------------------
DROP TABLE IF EXISTS `room2device`;
CREATE TABLE `room2device` (
  `id` bigint(20) NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT '请添加一个名词',
  `room` bigint(20) NOT NULL,
  `device` bigint(20) NOT NULL,
  PRIMARY KEY (`room`,`device`),
  UNIQUE KEY `id` (`id`),
  KEY `teacher` (`device`),
  KEY `book` (`room`),
  CONSTRAINT `room2device_ibfk_1` FOREIGN KEY (`room`) REFERENCES `room` (`id`),
  CONSTRAINT `room2device_ibfk_2` FOREIGN KEY (`device`) REFERENCES `device` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room2device
-- ----------------------------
INSERT INTO `room2device` VALUES ('0', null, '1', '5');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('4', '刘仕晓');
INSERT INTO `student` VALUES ('2', '叶愉君');
INSERT INTO `student` VALUES ('101', '巴乔');
INSERT INTO `student` VALUES ('100', '牛顿');
INSERT INTO `student` VALUES ('5', '许大可');
INSERT INTO `student` VALUES ('3', '许骁驹');
INSERT INTO `student` VALUES ('1', '邓丽君');
INSERT INTO `student` VALUES ('6', '马拉多拉');

-- ----------------------------
-- Table structure for student2teacher
-- ----------------------------
DROP TABLE IF EXISTS `student2teacher`;
CREATE TABLE `student2teacher` (
  `student` bigint(20) NOT NULL,
  `teacher` bigint(20) NOT NULL,
  PRIMARY KEY (`student`,`teacher`),
  KEY `teacher` (`teacher`),
  CONSTRAINT `student2teacher_ibfk_1` FOREIGN KEY (`student`) REFERENCES `student` (`id`),
  CONSTRAINT `student2teacher_ibfk_2` FOREIGN KEY (`teacher`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student2teacher
-- ----------------------------
INSERT INTO `student2teacher` VALUES ('1', '51');
INSERT INTO `student2teacher` VALUES ('2', '51');
INSERT INTO `student2teacher` VALUES ('3', '51');
INSERT INTO `student2teacher` VALUES ('4', '51');
INSERT INTO `student2teacher` VALUES ('5', '51');
INSERT INTO `student2teacher` VALUES ('6', '51');
INSERT INTO `student2teacher` VALUES ('4', '52');
INSERT INTO `student2teacher` VALUES ('5', '52');
INSERT INTO `student2teacher` VALUES ('6', '52');
INSERT INTO `student2teacher` VALUES ('100', '52');
INSERT INTO `student2teacher` VALUES ('1', '53');
INSERT INTO `student2teacher` VALUES ('3', '53');
INSERT INTO `student2teacher` VALUES ('4', '53');
INSERT INTO `student2teacher` VALUES ('101', '53');
INSERT INTO `student2teacher` VALUES ('1', '55');
INSERT INTO `student2teacher` VALUES ('3', '55');
INSERT INTO `student2teacher` VALUES ('5', '55');
INSERT INTO `student2teacher` VALUES ('6', '55');
INSERT INTO `student2teacher` VALUES ('100', '55');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `office` bigint(20) DEFAULT NULL,
  `leader` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `office` (`office`),
  KEY `leader` (`leader`),
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`office`) REFERENCES `office` (`id`),
  CONSTRAINT `teacher_ibfk_2` FOREIGN KEY (`leader`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('51', '梁早清', '10', null);
INSERT INTO `teacher` VALUES ('52', '严尚维', '10', '51');
INSERT INTO `teacher` VALUES ('53', '张义青', '10', '51');
INSERT INTO `teacher` VALUES ('55', '郑婵', '10', '51');

-- ----------------------------
-- View structure for book2courseview
-- ----------------------------
DROP VIEW IF EXISTS `book2courseview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `book2courseview` AS select `course`.`name` AS `courseName`,`book`.`name` AS `bookName` from ((`book` join `book2course`) join `course`) where ((`book2course`.`book` = `book`.`id`) and (`book2course`.`course` = `course`.`id`)) ;

-- ----------------------------
-- View structure for room2deviceview
-- ----------------------------
DROP VIEW IF EXISTS `room2deviceview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `room2deviceview` AS select `room`.`name` AS `roomName`,`device`.`name` AS `deviceName` from ((`room2device` join `room`) join `device`) where ((`room2device`.`room` = `room`.`id`) and (`room2device`.`device` = `device`.`id`)) ;
