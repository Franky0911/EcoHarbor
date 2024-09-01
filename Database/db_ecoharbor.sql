# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_ecoharbor
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    5/27/2024 4:12:17 PM
# --------------------------------------------------------

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI,NO_BACKSLASH_ESCAPES';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'db_ecoharbor'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "db_ecoharbor" /*!40100 DEFAULT CHARACTER SET latin1 */;

USE "db_ecoharbor";


#
# Table structure for table 'tbl_admin'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_admin" (
  "admin_id" int(10) NOT NULL auto_increment,
  "admin_name" varchar(100) default NULL,
  "admin_email" varchar(100) default NULL,
  "admin_password" varchar(100) default NULL,
  PRIMARY KEY  ("admin_id")
) AUTO_INCREMENT=5;



#
# Dumping data for table 'tbl_admin'
#

LOCK TABLES "tbl_admin" WRITE;
/*!40000 ALTER TABLE "tbl_admin" DISABLE KEYS;*/
REPLACE INTO "tbl_admin" ("admin_id", "admin_name", "admin_email", "admin_password") VALUES
	(4,'Franklin James','franklinjamestqr@gmail.com','Abcd@1234');
/*!40000 ALTER TABLE "tbl_admin" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_agency'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_agency" (
  "agency_id" int(10) NOT NULL auto_increment,
  "agency_name" varchar(100) default NULL,
  "agency_logo" varchar(100) default NULL,
  "agency_contact" varchar(100) default NULL,
  "agency_email" varchar(100) default NULL,
  "agency_proof" varchar(100) default NULL,
  "agency_address" varchar(100) default NULL,
  "agency_password" varchar(100) default NULL,
  PRIMARY KEY  ("agency_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_agency'
#

LOCK TABLES "tbl_agency" WRITE;
/*!40000 ALTER TABLE "tbl_agency" DISABLE KEYS;*/
REPLACE INTO "tbl_agency" ("agency_id", "agency_name", "agency_logo", "agency_contact", "agency_email", "agency_proof", "agency_address", "agency_password") VALUES
	(1,'EcoCleann','AgencyLogo_1140.jpg','879423098322','ecocleans@gmail.com','AgencyProof_1040.jpg','Avoly P.O
Muvattupuzhaa
Ernakulam District','Abcd@1234');
/*!40000 ALTER TABLE "tbl_agency" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_complaint'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_complaint" (
  "complaint_id" int(10) NOT NULL auto_increment,
  "complaint_content" varchar(300) default NULL,
  "complaint_date" varchar(100) default NULL,
  "complaint_reply" varchar(300) default NULL,
  "user_id" int(10) default NULL,
  "agency_id" int(10) default NULL,
  "complaint_status" varchar(50) default '0',
  PRIMARY KEY  ("complaint_id")
) AUTO_INCREMENT=13;



#
# Dumping data for table 'tbl_complaint'
#

LOCK TABLES "tbl_complaint" WRITE;
/*!40000 ALTER TABLE "tbl_complaint" DISABLE KEYS;*/
REPLACE INTO "tbl_complaint" ("complaint_id", "complaint_content", "complaint_date", "complaint_reply", "user_id", "agency_id", "complaint_status") VALUES
	(8,'Irresponsible Collection by Agency ','2024-05-22','Dear Michael,

Thank you for bringing this to our attention. We apologize for any inconvenience caused. We are currently investigating the issue and will update you shortly.

Best regards,
EcoHarbor',6,NULL,'1');
REPLACE INTO "tbl_complaint" ("complaint_id", "complaint_content", "complaint_date", "complaint_reply", "user_id", "agency_id", "complaint_status") VALUES
	(9,'Improper Waste Handling','2024-05-22',NULL,6,NULL,'0');
REPLACE INTO "tbl_complaint" ("complaint_id", "complaint_content", "complaint_date", "complaint_reply", "user_id", "agency_id", "complaint_status") VALUES
	(10,'Users not following the guidelines','2024-05-22','Dear EcoClean,

Thank you for bringing this to our attention. We apologize for any inconvenience caused. We are currently investigating the issue and will update you shortly.

Best regards,
EcoHarbor',NULL,1,'1');
REPLACE INTO "tbl_complaint" ("complaint_id", "complaint_content", "complaint_date", "complaint_reply", "user_id", "agency_id", "complaint_status") VALUES
	(11,'agency not good','2024-05-22','srry to hear ',9,NULL,'1');
REPLACE INTO "tbl_complaint" ("complaint_id", "complaint_content", "complaint_date", "complaint_reply", "user_id", "agency_id", "complaint_status") VALUES
	(12,'ee','2024-05-27',NULL,NULL,1,'0');
/*!40000 ALTER TABLE "tbl_complaint" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_feedback'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_feedback" (
  "feedback_id" int(10) NOT NULL auto_increment,
  "feedback_content" varchar(250) default NULL,
  "feedback_date" varchar(100) default NULL,
  "user_id" int(10) default NULL,
  "agency_id" int(10) default NULL,
  PRIMARY KEY  ("feedback_id")
) AUTO_INCREMENT=11;



#
# Dumping data for table 'tbl_feedback'
#

LOCK TABLES "tbl_feedback" WRITE;
/*!40000 ALTER TABLE "tbl_feedback" DISABLE KEYS;*/
REPLACE INTO "tbl_feedback" ("feedback_id", "feedback_content", "feedback_date", "user_id", "agency_id") VALUES
	(7,'So far had my best experience
','2024-05-22',6,NULL);
REPLACE INTO "tbl_feedback" ("feedback_id", "feedback_content", "feedback_date", "user_id", "agency_id") VALUES
	(8,'Had a good experience','2024-05-22',NULL,1);
REPLACE INTO "tbl_feedback" ("feedback_id", "feedback_content", "feedback_date", "user_id", "agency_id") VALUES
	(9,'its so good','2024-05-22',9,NULL);
REPLACE INTO "tbl_feedback" ("feedback_id", "feedback_content", "feedback_date", "user_id", "agency_id") VALUES
	(10,'ee','2024-05-27',NULL,1);
/*!40000 ALTER TABLE "tbl_feedback" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_location'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_location" (
  "location_id" int(11) NOT NULL auto_increment,
  "location_name" varchar(50) default NULL,
  PRIMARY KEY  ("location_id")
) AUTO_INCREMENT=40;



#
# Dumping data for table 'tbl_location'
#

LOCK TABLES "tbl_location" WRITE;
/*!40000 ALTER TABLE "tbl_location" DISABLE KEYS;*/
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(24,' Kizhakkekkara');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(25,' Randar');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(26,' Kottappuram');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(27,' Thiruvumplavu Kshetram');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(28,' St.sebastian.h.s');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(29,' Pareekkapeedika');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(30,' Kavana');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(31,' Kavana Gov. LPS');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(32,' Nadukkara');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(33,' Panchayath Office');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(35,' Anicadu');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(37,' P.h.c');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(38,' Companippady');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(39,'Nirmala College');
/*!40000 ALTER TABLE "tbl_location" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_property'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_property" (
  "property_id" int(11) NOT NULL auto_increment,
  "property_no" varchar(100) default NULL,
  "ward_id" int(11) default NULL,
  "property_oname" varchar(100) default NULL,
  PRIMARY KEY  ("property_id")
) AUTO_INCREMENT=13;



#
# Dumping data for table 'tbl_property'
#

LOCK TABLES "tbl_property" WRITE;
/*!40000 ALTER TABLE "tbl_property" DISABLE KEYS;*/
REPLACE INTO "tbl_property" ("property_id", "property_no", "ward_id", "property_oname") VALUES
	(7,'1',25,'John Doe');
REPLACE INTO "tbl_property" ("property_id", "property_no", "ward_id", "property_oname") VALUES
	(8,'2',26,'Jane Smith');
REPLACE INTO "tbl_property" ("property_id", "property_no", "ward_id", "property_oname") VALUES
	(9,'3',27,'Michael Johnson');
REPLACE INTO "tbl_property" ("property_id", "property_no", "ward_id", "property_oname") VALUES
	(10,'4',28,'Emily Davis');
REPLACE INTO "tbl_property" ("property_id", "property_no", "ward_id", "property_oname") VALUES
	(11,'5',29,'Robert Brown');
REPLACE INTO "tbl_property" ("property_id", "property_no", "ward_id", "property_oname") VALUES
	(12,'1233',25,'Ajay Thomas ');
/*!40000 ALTER TABLE "tbl_property" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_request'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_request" (
  "request_id" int(11) NOT NULL auto_increment,
  "request_date" varchar(100) default '0',
  "user_id" int(11) default NULL,
  "request_status" varchar(100) default '0',
  "request_minimumamount" varchar(100) default '0',
  "actual_amount" varchar(100) default '0',
  PRIMARY KEY  ("request_id")
) AUTO_INCREMENT=50;



#
# Dumping data for table 'tbl_request'
#

LOCK TABLES "tbl_request" WRITE;
/*!40000 ALTER TABLE "tbl_request" DISABLE KEYS;*/
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(30,'2024-05-22',6,'4','70','');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(31,'2024-05-22',6,'2','25','46');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(32,'2024-05-22',8,'2','45','');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(33,'2024-05-22',6,'2','25','7');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(34,'2024-05-22',6,'3','25','54');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(35,'2024-05-22',6,'2','50','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(36,'2024-05-22',9,'3','70','20');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(37,'2024-05-23',6,'2','60','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(38,'2024-05-23',6,'3','30','36');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(39,'2024-05-23',6,'4','100','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(40,'2024-05-27',6,'0','140','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(41,'2024-05-27',6,'0','10','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(42,'2024-05-27',6,'0','95','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(43,'2024-05-27',6,'0','60','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(44,'2024-05-27',6,'0','40','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(45,'2024-05-27',6,'0','15','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(46,'2024-05-27',6,'0','30','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(47,'2024-05-27',6,'0','15','0');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(48,'2024-05-27',6,'3','35','12');
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(49,'2024-05-27',6,'3','90','23');
/*!40000 ALTER TABLE "tbl_request" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_requesttype'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_requesttype" (
  "requesttype_id" int(11) NOT NULL auto_increment,
  "requesttype_status" varchar(100) default '0',
  "wastetype_id" int(11) default NULL,
  "request_id" int(11) default NULL,
  "requesttype_quantity" varchar(100) default '0',
  PRIMARY KEY  ("requesttype_id")
) AUTO_INCREMENT=121;



#
# Dumping data for table 'tbl_requesttype'
#

LOCK TABLES "tbl_requesttype" WRITE;
/*!40000 ALTER TABLE "tbl_requesttype" DISABLE KEYS;*/
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(66,'0',2,30,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(67,'0',3,30,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(68,'0',4,30,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(69,'0',5,30,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(70,'0',2,31,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(71,'0',3,31,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(72,'0',2,32,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(73,'0',3,32,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(74,'0',4,32,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(75,'0',2,33,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(76,'0',3,33,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(77,'0',2,34,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(78,'0',3,34,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(79,'0',2,35,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(80,'0',3,35,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(81,'0',5,35,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(82,'0',2,36,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(83,'0',3,36,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(84,'0',4,36,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(85,'0',5,36,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(86,'0',2,37,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(87,'0',4,37,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(88,'0',6,37,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(89,'0',2,38,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(90,'0',4,38,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(91,'0',2,39,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(92,'0',4,39,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(93,'0',6,39,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(94,'0',7,39,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(95,'0',2,40,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(96,'0',3,40,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(97,'0',4,40,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(98,'0',5,40,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(99,'0',6,40,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(100,'0',7,40,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(101,'0',2,41,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(102,'0',2,42,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(103,'0',4,42,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(104,'0',5,42,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(105,'0',7,42,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(106,'0',2,43,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(107,'0',4,43,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(108,'0',6,43,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(109,'0',3,44,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(110,'0',5,44,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(111,'0',3,45,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(112,'0',2,46,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(113,'0',4,46,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(114,'0',3,47,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(115,'0',3,48,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(116,'0',4,48,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(117,'0',3,49,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(118,'0',4,49,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(119,'0',5,49,'0');
REPLACE INTO "tbl_requesttype" ("requesttype_id", "requesttype_status", "wastetype_id", "request_id", "requesttype_quantity") VALUES
	(120,'0',6,49,'0');
/*!40000 ALTER TABLE "tbl_requesttype" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_transaction'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_transaction" (
  "transaction_id" int(11) NOT NULL auto_increment,
  "transaction_date" varchar(100) default NULL,
  "transaction_type" varchar(100) default NULL,
  "transaction_amount" varchar(100) default NULL,
  "user_id" int(11) default NULL,
  PRIMARY KEY  ("transaction_id")
) AUTO_INCREMENT=54;



#
# Dumping data for table 'tbl_transaction'
#

LOCK TABLES "tbl_transaction" WRITE;
/*!40000 ALTER TABLE "tbl_transaction" DISABLE KEYS;*/
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(19,'2024-05-22','Wallet Amount','500',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(20,'2024-05-22',' Minimum Amount','70',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(21,'2024-05-22',' Minimum Amount','25',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(22,'2024-05-22','Wallet Amount','500',8);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(23,'2024-05-22',' Minimum Amount','45',8);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(24,'2024-05-22','Actual amount','46',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(25,'2024-05-22','Actual amount','0',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(26,'2024-05-22',' Minimum Amount','25',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(27,'2024-05-22',' Minimum Amount','25',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(28,'2024-05-22',' Minimum Amount','50',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(29,'2024-05-22','Wallet Amount','500',9);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(30,'2024-05-22',' Minimum Amount','70',9);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(31,'2024-05-22','Actual amount','20',9);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(32,'2024-05-22','Actual amount','7',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(33,'2024-05-22','Actual amount','85',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(34,'2024-05-22','Wallet Amount','500',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(35,'2024-05-23',' Minimum Amount','60',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(36,'2024-05-23',' Minimum Amount','30',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(37,'2024-05-23','Actual amount','36',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(38,'2024-05-23',' Minimum Amount','100',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(39,'2024-05-27','Wallet Amount','500',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(40,'2024-05-27',' Minimum Amount','140',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(41,'2024-05-27',' Minimum Amount','10',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(42,'2024-05-27',' Minimum Amount','95',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(43,'2024-05-27',' Minimum Amount','60',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(44,'2024-05-27',' Minimum Amount','40',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(45,'2024-05-27',' Minimum Amount','15',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(46,'2024-05-27',' Minimum Amount','30',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(47,'2024-05-27',' Minimum Amount','15',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(48,'2024-05-27',' Minimum Amount','35',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(49,'2024-05-27','Actual amount','12',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(50,'2024-05-27','Wallet Amount','500',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(51,'2024-05-27',' Minimum Amount','90',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(52,'2024-05-27','Actual amount','23',6);
REPLACE INTO "tbl_transaction" ("transaction_id", "transaction_date", "transaction_type", "transaction_amount", "user_id") VALUES
	(53,'2024-05-27','Actual amount','54',6);
/*!40000 ALTER TABLE "tbl_transaction" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_user'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_user" (
  "user_id" int(10) NOT NULL auto_increment,
  "user_contact" varchar(100) default NULL,
  "user_name" varchar(100) default NULL,
  "user_email" varchar(100) default NULL,
  "user_gender" varchar(100) default NULL,
  "user_address" varchar(100) default NULL,
  "ward_id" int(10) default NULL,
  "user_photo" varchar(100) default NULL,
  "user_propno" varchar(100) default NULL,
  "user_password" varchar(100) default NULL,
  "user_proof" varchar(100) default NULL,
  "user_status" varchar(50) default '0',
  "user_wallet" varchar(100) default '0',
  PRIMARY KEY  ("user_id")
) AUTO_INCREMENT=13;



#
# Dumping data for table 'tbl_user'
#

LOCK TABLES "tbl_user" WRITE;
/*!40000 ALTER TABLE "tbl_user" DISABLE KEYS;*/
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status", "user_wallet") VALUES
	(1,'9884277469','Garudan Vasu','vasuannan@gmail.com','Male','Kaduvakattil House
Kuthiravattom P.O
234242
',34,'UserPhoto_1157.jpg','680','Vasuannan@999','UserProof_1661.jpg','3','13');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status", "user_wallet") VALUES
	(4,'4556764523','John Doe',' john.doe@example.com','Male','123 Maple Street, Springfield, IL 62704',25,'UserPhoto_1167.jpg','1','Abcd@1234','UserProof_1030.png','1','0');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status", "user_wallet") VALUES
	(5,'3456787867','Jane Smith','jane.smith@example.com','Female','456 Oak Avenue, Metropolis, NY 10001',37,'UserPhoto_1643.jpg','5','Abcd@1234','UserProof_1957.png','0','0');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status", "user_wallet") VALUES
	(6,'3345675456','Michael Johnson','michael.johnson@example.com','Male','789 Pine Road, Gotham, NJ 07002
',27,'UserPhoto_1395.jpg','3','Abcd@1234','UserProof_1820.png','2','333');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status", "user_wallet") VALUES
	(7,'5674636778','Emily Davis','emily.davis@example.com','Male','321 Birch Lane, Star City, CA 90210',28,'UserPhoto_1902.jpg','4','Abcd@1234','UserProof_1710.png','3','0');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status", "user_wallet") VALUES
	(8,'4564323445','Robert Brown','robert.brown@example.com','Male','654 Cedar Street, Central City, TX 73301',29,'UserPhoto_1987.jpg','5','Abcd@1234','UserProof_1960.png','2','455');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status", "user_wallet") VALUES
	(9,'3244567898','Ajay Thomas','ajaypalakaden@gmail.com','Male','Thodupuzha',36,'UserPhoto_1256.jpg','12','Abcd@12345','UserProof_1841.png','2','410');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status", "user_wallet") VALUES
	(10,'3244567898','Ajay Thomas','ajaypalakaden@gmail.com','Male','weder',26,'UserPhoto_1908.jpg','12','Abcd@1234','UserProof_1129.jpg','0','0');
/*!40000 ALTER TABLE "tbl_user" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_ward'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_ward" (
  "ward_id" int(11) NOT NULL auto_increment,
  "ward_no" varchar(50) default NULL,
  "location_id" int(11) default NULL,
  PRIMARY KEY  ("ward_id")
) AUTO_INCREMENT=39;



#
# Dumping data for table 'tbl_ward'
#

LOCK TABLES "tbl_ward" WRITE;
/*!40000 ALTER TABLE "tbl_ward" DISABLE KEYS;*/
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(25,'1',24);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(26,'2',25);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(27,'3',26);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(28,'4',27);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(29,'5',28);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(30,'6',29);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(31,'7',30);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(32,'8',31);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(33,'9',32);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(34,'10',33);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(35,'11',35);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(36,'12',37);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(37,'13',38);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(38,'14',39);
/*!40000 ALTER TABLE "tbl_ward" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_wastetype'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_wastetype" (
  "wastetype_id" int(10) NOT NULL auto_increment,
  "wastetype_name" varchar(50) default NULL,
  "wastetype_rate" varchar(50) default NULL,
  PRIMARY KEY  ("wastetype_id")
) AUTO_INCREMENT=8;



#
# Dumping data for table 'tbl_wastetype'
#

LOCK TABLES "tbl_wastetype" WRITE;
/*!40000 ALTER TABLE "tbl_wastetype" DISABLE KEYS;*/
REPLACE INTO "tbl_wastetype" ("wastetype_id", "wastetype_name", "wastetype_rate") VALUES
	(2,'Paper Waste','10');
REPLACE INTO "tbl_wastetype" ("wastetype_id", "wastetype_name", "wastetype_rate") VALUES
	(3,'Textile Waste','15');
REPLACE INTO "tbl_wastetype" ("wastetype_id", "wastetype_name", "wastetype_rate") VALUES
	(4,'Plastic Waste','20');
REPLACE INTO "tbl_wastetype" ("wastetype_id", "wastetype_name", "wastetype_rate") VALUES
	(5,'Metal Waste','25');
REPLACE INTO "tbl_wastetype" ("wastetype_id", "wastetype_name", "wastetype_rate") VALUES
	(6,'Rubber Waste','30');
REPLACE INTO "tbl_wastetype" ("wastetype_id", "wastetype_name", "wastetype_rate") VALUES
	(7,'E Waste','40');
/*!40000 ALTER TABLE "tbl_wastetype" ENABLE KEYS;*/
UNLOCK TABLES;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
