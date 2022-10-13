/*
 Navicat Premium Data Transfer

 Source Server         : my
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : florist

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 13/10/2022 14:11:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for flower
-- ----------------------------
DROP TABLE IF EXISTS `flower`;
CREATE TABLE `flower`  (
  `fname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `fdescribe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `picUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of flower
-- ----------------------------
INSERT INTO `flower` VALUES (' Corolla Rose', 1, ' Allow you three lifetimes to accompany the twilight of the dynasty', 298.00, 'http://localhost:5000/static/img/1.jpg');
INSERT INTO `flower` VALUES ('Pink carnation', 2, 'Gentle people are treasures on earth', 239.00, 'http://localhost:5000/static/img/2.jpg');
INSERT INTO `flower` VALUES ('Rose tulips', 3, 'Eternal love. The love of a young girl is sincere and beautiful', 521.00, 'http://localhost:5000/static/img/3.jpg');
INSERT INTO `flower` VALUES ('Sunflower', 4, ' Pick a ray of sunshine, make a bookmark, and warm every day.', 198.00, 'http://localhost:5000/static/img/4.jpg');
INSERT INTO `flower` VALUES ('Lily', 5, 'I like you!Bless you ,Wish you the most beautiful place', 198.00, 'http://localhost:5000/static/img/5.jpg');
INSERT INTO `flower` VALUES ('Broken Ice Blue Rose\n\n', 6, 'The hope for you is the stars and the sea', 469.00, 'http://localhost:5000/static/img/6.jpg');
INSERT INTO `flower` VALUES ('Diana Pink Rose', 7, 'The sun caresses your face, never forgetting the beautiful picture; The hug you gave me accelerated my heartbeat. Happiness is so beautiful!', 599.00, 'http://localhost:5000/static/img/7.jpg');
INSERT INTO `flower` VALUES ('Aisha Rose', 8, 'I want to spoil you as a princess and give you all the tenderness', 636.00, 'http://localhost:5000/static/img/8.jpg');

-- ----------------------------
-- Table structure for shoppingcart
-- ----------------------------
DROP TABLE IF EXISTS `shoppingcart`;
CREATE TABLE `shoppingcart`  (
  `userId` int(0) NOT NULL,
  `flowerId` int(0) NOT NULL,
  PRIMARY KEY (`userId`, `flowerId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'alice', '123456');
INSERT INTO `users` VALUES (2, 'boby', '123456');
INSERT INTO `users` VALUES (10, 'boby', '123456');

SET FOREIGN_KEY_CHECKS = 1;
