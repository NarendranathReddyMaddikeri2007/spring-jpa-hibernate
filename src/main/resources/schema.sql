create table course(
    id bigint not null,
    name varchar(255) not null ,
    author varchar(255) not null,
    primary key (id)
);

insert into course (id,name,author) values (1,'Learn AWS', 'naren');