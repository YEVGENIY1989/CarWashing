drop table if exists admins cascade ;
drop table if exists client cascade ;
drop table if exists service_list cascade ;

create table if not exists admins(
    id int generated by default as identity primary key ,
    login varchar(255) not null ,
    password varchar(255) not null
);

create table if not exists client(
    id int generated by default as identity primary key ,
    timeOfService varchar(255) not null ,
    typeOfService varchar(255) not null,
    dataOfService varchar(255) not null
);

create table if not exists service_list(
    id int generated by default as identity primary key ,
    service varchar(255) not null,
    client_id int,
    foreign key (client_id) references client(id)
);



