CREATE TABLE `user` (
	`id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`email` VARCHAR(255) NOT NULL,
	`password` VARCHAR(512) NOT NULL,
	PRIMARY KEY (id)
) ENGINE=INNODB CHARACTER SET UTF8MB4 COLLATE UTF8MB4_UNICODE_CI;
