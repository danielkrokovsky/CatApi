drop table endereco if exists;
drop table equipe if exists;
drop table funcionario if exists;
drop table signin if exists;
drop table ferias if exists;

drop sequence if exists hibernate_sequence;
drop sequence if exists sq001_funcionario;
drop sequence if exists sq002_signin;
drop sequence if exists sq003_equipe;
drop sequence if exists sq005_ferias;

create sequence hibernate_sequence start with 1 increment by 1;
create sequence sq001_funcionario start with 1 increment by 1;
create sequence sq002_signin start with 1 increment by 1;
create sequence sq003_equipe start with 1 increment by 1;
create sequence sq004_endereco start with 1 increment by 1;
create sequence sq005_ferias start with 1 increment by 1;

create table endereco (
       id bigint not null,
        bairro varchar(255) not null,
        cidade varchar(255) not null,
        complemento varchar(255),
        estado varchar(255) not null,
        numero varchar(255),
        rua varchar(255) not null,
        primary key (id)
    );

create table equipe (
       id bigint not null,
        nome varchar(255),
        primary key (id)
    );

create table funcionario (
       id bigint not null,
        dt_contratacao date,
        dt_nascimento date,
        foto blob,
        matricula varchar(255),
        nome varchar(255),
        endereco_id bigint,
        equipe_id bigint,
        primary key (id)
    );

create table signin (
       id bigint not null,
        email varchar(255),
        password varchar(255),
        primary key (id)
    );

create table ferias (
        id bigint not null,
        dt_fim date,
        dt_inicio date,
        funcionario_id bigint,
        primary key (id)
    );

alter table funcionario 
       add constraint FK_ENDERECO 
       foreign key (endereco_id) 
       references endereco;

alter table funcionario 
       add constraint FK_EQUIPE 
       foreign key (equipe_id) 
       references equipe;



