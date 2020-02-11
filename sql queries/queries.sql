create database casestudy
use casestudy
 

create table project(
project_id int not null primary key,
project_name varchar(100) not null);

create table department(
department_id int not null primary key,
department_name varchar(100) not null);

create table employee(
employee_id int not null primary key,
employee_name varchar(100) not null,
employee_designation varchar(100) not null,
employee_salary bigint not null,
employee_dateofjoining date not null,
employee_dateofbirth date not null,
employee_age int not null,
foreign key (department_id) references department(department_id));
drop table project
drop table department
drop table employee





create table department(
department_id int not null,
depaertment_name varchar(20) not null);

alter table department add constraint primary_key primary key(department_id);

