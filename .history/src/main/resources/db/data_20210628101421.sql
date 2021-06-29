CREATE TABLE `auth`.`jwt_blacklisted` (
  `id` INT NOT NULL,
  `jti` VARCHAR(2000) NULL,
  `created_date` DATETIME NULL,
  PRIMARY KEY (`id`));
