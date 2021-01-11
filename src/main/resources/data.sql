create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
)

Insert into person (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (100,'sahith','Khammam',sysdate());
Insert into person (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (101,'Jayappa','Gopavaram',sysdate());
Insert into person (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (102,'Ammaji','Nandigama',sysdate());