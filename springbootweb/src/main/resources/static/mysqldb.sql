CREATE TABLE `springboot`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `status` VARCHAR(2) NOT NULL AFTER `password`,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);
  
CREATE TABLE `springboot`.`role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `role_UNIQUE` (`role` ASC) VISIBLE);

 CREATE TABLE `springboot`.`user_role` (
  `userid` INT NOT NULL,
  `roleid` INT NOT NULL,
  INDEX `userid_idx` (`userid` ASC) VISIBLE,
  PRIMARY KEY (`userid`, `roleid`),
  INDEX `roleid_idx` (`roleid` ASC) VISIBLE,
  CONSTRAINT `userid`
    FOREIGN KEY (`userid`)
    REFERENCES `springboot`.`user` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `roleid`
    FOREIGN KEY (`roleid`)
    REFERENCES `springboot`.`role` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);
    
 CREATE TABLE `springboot`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(500) NULL,
  PRIMARY KEY (`id`));