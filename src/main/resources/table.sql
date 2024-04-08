show databases;
create database interview;
create table user_info(
user_id bigint auto_increment primary key,
user_name varchar(40),
user_password varchar(40),
mobile_no bigint unique,
email varchar(40)
);

select * from user_info;
create table employee(
employee_id bigint auto_increment primary key,
emploee_name varchar(50),
gender varchar(50),
desingnation varchar(50),
mobile_No bigint,
email varchar(50)

);

select * from employee;

alter table employee change emploee_name employee_name varchar(50);

create table  salary(
salary_id bigint auto_increment primary key,
gross bigint,
basic bigint,
HRA bigint,
va bigint,
total bigint,
employee_id bigint,
foreign key(employee_id) references employee (employee_id)


);
select * from salary;

create table attandance (
attandance_id bigint auto_increment primary key,
per_days bigint,
employee_id bigint,
foreign key(employee_id) references employee(employee_id)

);
select e.employee_id ,e.employee_name ,a.per_days,s.gross,s.basic,s.HRA,s.va,s.total from employee e,salary s,attandance  a where e.employee_id=s.employee_id and e.employee_id=a.employee_id;

select * from attandance;


