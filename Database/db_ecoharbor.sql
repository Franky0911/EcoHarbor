# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_ecoharbor
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    2/9/2024 2:03:33 PM
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
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tbl_admin'
#

LOCK TABLES "tbl_admin" WRITE;
/*!40000 ALTER TABLE "tbl_admin" DISABLE KEYS;*/
REPLACE INTO "tbl_admin" ("admin_id", "admin_name", "admin_email", "admin_password") VALUES
	(1,'Franklin James','franklinjamestqr@gmail.com','Lonewolf900#');
REPLACE INTO "tbl_admin" ("admin_id", "admin_name", "admin_email", "admin_password") VALUES
	(2,'Ajay Thomas','ajaythomas@gmail.com','Ajaythomas12#');
REPLACE INTO "tbl_admin" ("admin_id", "admin_name", "admin_email", "admin_password") VALUES
	(3,'Gauri Nandana G','gauri@gmail.com','Gauri@1234');
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
	(1,'SreeLaksmis','AgencyLogo_1708.jpg','8078842792','surajks@gmail.com','AgencyProof_1817.jpg','Thodupuzhas','Agency@123');
/*!40000 ALTER TABLE "tbl_agency" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_location'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_location" (
  "location_id" int(11) NOT NULL auto_increment,
  "location_name" varchar(50) default NULL,
  PRIMARY KEY  ("location_id")
) AUTO_INCREMENT=7;



#
# Dumping data for table 'tbl_location'
#

LOCK TABLES "tbl_location" WRITE;
/*!40000 ALTER TABLE "tbl_location" DISABLE KEYS;*/
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(4,'avoli');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(5,'kadavu');
REPLACE INTO "tbl_location" ("location_id", "location_name") VALUES
	(6,'chira');
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
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_property'
#

LOCK TABLES "tbl_property" WRITE;
/*!40000 ALTER TABLE "tbl_property" DISABLE KEYS;*/
REPLACE INTO "tbl_property" ("property_id", "property_no", "ward_id", "property_oname") VALUES
	(2,'123',8,'Ajay');
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
) AUTO_INCREMENT=16;



#
# Dumping data for table 'tbl_request'
#

LOCK TABLES "tbl_request" WRITE;
/*!40000 ALTER TABLE "tbl_request" DISABLE KEYS;*/
REPLACE INTO "tbl_request" ("request_id", "request_date", "user_id", "request_status", "request_minimumamount", "actual_amount") VALUES
	(15,'2024-02-02',13,'0','0','0');
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
);



#
# Dumping data for table 'tbl_requesttype'
#

# No data found.



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
  PRIMARY KEY  ("user_id")
) AUTO_INCREMENT=15;



#
# Dumping data for table 'tbl_user'
#

LOCK TABLES "tbl_user" WRITE;
/*!40000 ALTER TABLE "tbl_user" DISABLE KEYS;*/
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status") VALUES
	(11,'8078842799','Ajay','franklinjamestqr@gmail.com','Male','Thodupuzha',8,'UserPhoto_1383.jpg','123','Admin124#','UserProof_1896.jpg','2');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status") VALUES
	(12,'8078842799','Franklin James ','franklinjamestqr@gmail.com','Male','Thodupuzha',8,'UserPhoto_1826.jpg','123','Admin123#','UserProof_1129.jpg','3');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status") VALUES
	(13,'9876543214','Franklin ','surajks@gmail.com','Male','Karkala',8,'UserPhoto_1027.jpg','111','Admin@123','UserProof_1354.jpg','3');
REPLACE INTO "tbl_user" ("user_id", "user_contact", "user_name", "user_email", "user_gender", "user_address", "ward_id", "user_photo", "user_propno", "user_password", "user_proof", "user_status") VALUES
	(14,'8078842799','Ajay Palakaden','ajaypalakaden@gmail.com','Male','Thodupuzha',11,'UserPhoto_2057.jpg','22','Ajay@1234','UserProof_1831.jpg','3');
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
) AUTO_INCREMENT=12;



#
# Dumping data for table 'tbl_ward'
#

LOCK TABLES "tbl_ward" WRITE;
/*!40000 ALTER TABLE "tbl_ward" DISABLE KEYS;*/
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(8,'16',6);
REPLACE INTO "tbl_ward" ("ward_id", "ward_no", "location_id") VALUES
	(11,'12',4);
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
) AUTO_INCREMENT=11;



#
# Dumping data for table 'tbl_wastetype'
#

LOCK TABLES "tbl_wastetype" WRITE;
/*!40000 ALTER TABLE "tbl_wastetype" DISABLE KEYS;*/
REPLACE INTO "tbl_wastetype" ("wastetype_id", "wastetype_name", "wastetype_rate") VALUES
	(9,'Food wastes','51');
REPLACE INTO "tbl_wastetype" ("wastetype_id", "wastetype_name", "wastetype_rate") VALUES
	(10,'ewaste','72');
/*!40000 ALTER TABLE "tbl_wastetype" ENABLE KEYS;*/
UNLOCK TABLES;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
