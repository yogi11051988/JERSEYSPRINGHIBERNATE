//UserManagement table preserve info in this table 

CREATE TABLE `userdata`.`user_info` (
  `ID` INT(10) NOT NULL,
  `FIRSTNAME` VARCHAR(25) NOT NULL,
  `LASTNAME` VARCHAR(25) NULL,
  `EMAIL` VARCHAR(50) NOT NULL,
  `PASSWORD` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID`));