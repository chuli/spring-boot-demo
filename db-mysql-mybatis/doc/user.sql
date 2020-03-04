CREATE TABLE `user` (
    `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `user_name` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '用户名',
    `user_password` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '密码',
    PRIMARY KEY (`id`),
    KEY `idx_user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;