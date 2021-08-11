create table person
(
    id integer  not null ,
    name varchar (255) not null ,
    height integer ,
    weight integer ,
    birth_date timestamp,
    primary key (id)
);

-- the table then would be created by schema update , which is triggered by boot

insert into person(ID, NAME, height,weight, BIRTH_DATE) VALUES ( 10001,'Stefan',170,60,sysdate() );
insert into person(ID, NAME, height,weight, BIRTH_DATE) VALUES ( 10002,'James',180,70,sysdate() );
insert into person(ID, NAME, height,weight, BIRTH_DATE) VALUES ( 10003,'Frisk',163,47,sysdate() );
insert into person(ID, NAME, height,weight, BIRTH_DATE) VALUES ( 10004,'Stefrisk',172,67,sysdate() );
