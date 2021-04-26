insert into admins ( login, password)
values ('YevgeniyAdmin' , 'qwerty123');

insert into admins (login, password)
values ('VasiliyAdmin' , '123qwerty');


insert into service_list(service, cost)
values ('Мойка', 800);

insert into service_list(service, cost)
values ('Химчистка', 1000);

insert into service_list(service, cost)
values ('Обработка кузова', 900);

insert into service_list(service, cost)
values ('Полировка', 600);


insert into client(timeOfService, dataOfService, service_id)
values ('00:08', '27.04.2021',1);

insert into client(timeOfService, dataOfService, service_id)
values ('10:00', '27.04.2021',2);

insert into client(timeOfService, dataOfService, service_id)
values ('13:00', '27.04.2021',1);

insert into client(timeOfService, dataOfService, service_id)
values ('18:00', '28.04.2021',3);
