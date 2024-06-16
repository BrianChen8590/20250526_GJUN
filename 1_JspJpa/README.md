
# 資料庫
```sql
CREATE DATABASE  IF NOT EXISTS `company` 

USE `company`;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
INSERT INTO `member` VALUES (1,'a','o','000','taipei','444'),(2,'teacher','uu','99999','高雄','123456789'),(5,'ttt','qwer','123456','taipei','00000000'),(6,'teee','eee','111','aa','77'),(7,'teee','eee','111','aa','77'),(8,'teee','eee','111','aa','77'),(9,'tt','aa','11','d','11');
UNLOCK TABLES;
```
