create database casestudy1;

create table department(
department_id int not null,
depaertment_name varchar(20) not null);

alter table department add constraint primary_key primary key(department_id);

describe department;

insert into department values(1001,'lkm');
insert into department values(1002,'javacap');
insert into department values(1003,'netcap');
commit;

create table project(
project_id varchar(20) not null,
project_name varchar(50) not null);

alter table project add constraint primary_key primary key(project_id);
describe project;

insert into project values('p1','retail');
insert into project values('p2','insurance');
insert into project values('p3','resources');
insert into project values('p4','banking');
insert into project values('p5','internal project');
commit;

describe project;

create table employee(

select *
from actor
where first_name='scarlett';

select *
from actor
where last_name='Johansson';

select last_name,count(*)
from actor;

select distinct last_name 
from actor;

select last_name 
from actor 
group by last_name
having count(last_name=1);

select last_name 
from actor 
group by last_name
having count(last_name>1);

insert into rental(rental_date,inventory_id,customer_id,staff_id) values('2020-01-22',1,1,1);

select avg(length) 
from film;

select actor.actor_id,actor.first_name,actor.last_name,count(actor_id) as film_count
from actor join film_actor using(actor_id)
group by actor_id
order by film_count desc;


limit 1;

select name,avg(length)
from film join film_category using (film_id) join category using(category_id)
group by name
order by avg(length) desc;

select rental_date,
       rental_date + interval
                   (select rental_duration from film where film_id = 1) day
                   as due_date
from rental
where rental_id = (select rental_id from rental order by rental_id desc limit 1);

select inventory.inventory_id
from inventory join store using (store_id)
     join film using (film_id)
     join rental using (inventory_id)
where film.title = 'Academy Dinosaur'
      and store.store_id = 1
      and not exists (select * from rental
                      where rental.inventory_id = inventory.inventory_id
                      and rental.return_date is null);







select * from film natural join inventory;


store_idmanager_staff_idaddress_id

describe film;

select * 
from film;

select * 
from rental;

select catagory.name,avg(length)
from film join film_category using (film_id) join category using (category_id)
group by category.name
order by avg(length) desc;






 





