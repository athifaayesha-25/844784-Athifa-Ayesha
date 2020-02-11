create database loan
use loan 

drop database loan

create database price
use price

drop database price

create database product
use product

drop database product

create database mydatabase
use mydatabase

create table customer(
customer_id int not null,
customer_name varchar(100) not null,
customer_mobile bigint not null,
customer_address varchar(100) not null,
customer_dob varchar(50) not null,
customer_emailid varchar(50) not null
)

describe customer

alter table customer
add customer_age int not null;

describe customer;

alter table customer
add customer_deposit bigint not null
after customer_address;

describe customer;

alter table customer
drop column customer_emailid;

describe customer;

alter table customer
change column customer_dob customer_dateofbirth varchar(50) not null;

alter table customer
change column customer_dob customer_dateofbirth date not null;

describe customer;
describe customer_table;

alter table customer
modify customer_name varchar(50) null;

describe customer;

alter table customer
rename to customer_table;

describe customer_table;

/*truncate table customer
select* from customer*/

insert into customer_table values(100, 'pooja', 8553988507, 'chennai','pooja@gmail.com',2500000, 1000000,25/12/1997,21,5);
insert into customer_table values(101, 'jhanvi', 8217746185, 'chennai','jhanvi@gmail.com',3500000, 19000000,28/11/1997,22,9);
insert into customer_table values(102, 'priya', 7795183948, 'chennai','priya@gmail.com',1500000, 1400000,05/11/1998,20,8);
insert into customer_table values(103, 'rajini', 9449610970, 'tambaram','rajini@gmail.com',0500000, 1600000,25/09/1999,19,12);
insert into customer_table values(104, 'shruthi', 9441360929, 'sholinganallur','shruthi@gmail.com',3400000, 1200000,29/05/1995,23,14);

alter table customer_table
add customer_contactno bigint not null;

alter table customer_table
add customer_workinghours bigint not null
after customer_age;
describe customer_table;

describe customer_table;
alter table customer_table
add customer_emailid varchar(100) not null
after customer_address;
describe customer_table;

select *
from customer_table
where customer_address='chennai';
describe customer_table;

alter table customer_table
drop column customer_contactno;
describe customer_table;

select *
from customer_table
where customer_address='chennai'
and customer_id<103;

select*
from customer_table
where customer_address='chennai'
or customer_id<105;

select*
from customer_table
where(address='chennai' and customer_name='jhanvi')
or(customer_id<6);

select distinct customer_address
from customer_table;

select *
from customer_table
where customer_address='chennai'
order by customer_name asc;

select *
from customer_table
where customer_address='chennai'
order by customer_name desc;

select customer_name,customer_address
from customer_table
where customer_id<105
order by customer_name desc,customer_address asc;

select customer_address,count(*)
from customer_table;

select customer_address,count(*)
from customer_table
group by customer_address;

select customer_name, min(customer_workinghours) as "minimum working hour"
from customer_table
group by customer_name;

select customer_name
from customer_table
where customer_address like 'ch%';

select customer_name
from customer_table
where customer_address like 'tamb_ram';

select customer_name
from customer_table
where customer_address not like 'che%';

select *
from customer_table
where customer_name in ('pooja','jhanvi','priya');

select *
from customer_table
where customer_name not in ('pooja','jhanvi','priya');

select * 
from customer_table
where customer_id between 100 and 102;

select *
from customer_table
where customer_dateofbirth between cast('1997-12-25' as date) and cast('1999-09-25' as date);
 
select customer_name,su

create table product(
product_id int not null,
product_name varchar(100) not null,
product_price bigint not null,
product_quantity bigint not null,
product_dateofmanufacture varchar(100) not null);

describe product;

insert into product values(289,'washing machine',22400,1,13/04/1995);

describe product;

update customer_table
set customer_name='jhanvi'
where customer_id=100;

set sql_safe_updates=0;

select customer_name,customer_address
from customer_table;


