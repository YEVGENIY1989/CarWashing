drop table if exists admins cascade ;
drop table if exists client cascade ;
drop table if exists users cascade ;
drop table if exists service_list cascade ;

create table if not exists admins(
    id int generated by default as identity primary key ,
    login varchar(255) not null ,
    password varchar(255) not null
);

create table if not exists service_list(
    id int generated by default as identity primary key ,
    service varchar(255) not null,
    cost int not null

);

create table if not exists users(
        id int generated by default as identity primary key ,
        first_name varchar(50) not null,
        last_name varchar(50) not null

);



create table if not exists client(
    id int generated by default as identity primary key ,
    timeOfService varchar(255) not null ,
    dataOfService varchar(255) not null,
    service_id int,
    foreign key (service_id) references service_list(id)
);




