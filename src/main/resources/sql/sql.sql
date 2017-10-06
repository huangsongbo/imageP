--java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite

--2017.10.6

--模版表
CREATE TABLE `sys_res_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `template_name` varchar(124) DEFAULT '' COMMENT '模版名称',
  `pic_id` bigint(20) DEFAULT '-1' COMMENT '图片id',
  `usage_amount` int(11) DEFAULT '0' COMMENT '人气/使用量',
  `gmt_create` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模版表';

--标签表
CREATE TABLE `sys_label` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `label_name` varchar(124) DEFAULT '' COMMENT '标签名称',
  `gmt_create` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签表';

--图片资源
CREATE TABLE `res_pic` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pic_path` varchar(256) DEFAULT '' COMMENT '图片相对路径',
  `pic_size` varchar(64) DEFAULT '' COMMENT '图片大小',
  `pic_width` varchar(64) DEFAULT '' COMMENT '图片宽',
  `pic_length` varchar(64) DEFAULT '' COMMENT '图片长',
  `pic_type` varchar(64) DEFAULT '' COMMENT '图片类型/fileKey',
  `gmt_create` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片资源表';

--用户作品表
CREATE TABLE `user_production` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `production_code` varchar(64) DEFAULT '' COMMENT '作品编码',
  `pic_id` bigint(20) DEFAULT '-1' COMMENT '图片id',
  `gmt_create` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户作品表';

--模版/标签中间表
CREATE TABLE `sys_template_label_rel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `template_id` bigint(20) DEFAULT '-1' COMMENT '模版id',
  `label_id` bigint(20) DEFAULT '-1' COMMENT '标签id',
  `gmt_create` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `is_deleted` int(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模版/标签中间表';