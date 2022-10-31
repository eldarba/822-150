create schema `coupon_system`;
use `coupon_system`;

create table `company`(
`id` int primary key auto_increment,
`name` varchar(255),
`email` varchar(255),
`password` varchar(255)
);

create table `coupon`(
`id` int primary key auto_increment,
`company_id` int ,
foreign key (`company_id`) references `company`(`id`),
`category` enum('FOOD', 'ELECTRICITY', 'VACATION', 'CAMPING', 'CLOATHING'),
title varchar(255),
description varchar(255),
`start_date` date,
`end_date` date,
`amount` int,
`price` double,
`image` varchar(255)
);

create table `customer`(
`id` int primary key auto_increment,
`first_name` varchar(255),
`last_name` varchar(255),
`email` varchar(255),
`password` varchar(255)
);

create table `customer_coupon`(
`customer_id` int, 
`coupon_id` int,
primary key(`customer_id`, `coupon_id`),
foreign key (`customer_id`) references `customer`(`id`),
foreign key (`coupon_id`) references `coupon`(`id`)
);



