# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table client (
  id                            bigint not null,
  nom                           varchar(255),
  adresses                      varchar(255),
  email                         varchar(255),
  tel                           integer,
  constraint pk_client primary key (id)
);
create sequence client_seq;

create table consultant (
  id                            bigint not null,
  nom                           varchar(255),
  prenom                        varchar(255),
  promo                         integer,
  constraint pk_consultant primary key (id)
);
create sequence consultant_seq;

create table mission (
  id                            bigint not null,
  start                         date,
  den                           date,
  effective_start               date,
  effective_den                 date,
  project_id                    bigint,
  consultant_id                 bigint,
  constraint pk_mission primary key (id)
);
create sequence mission_seq;

create table mission_techno (
  mission_id                    bigint not null,
  techno_id                     bigint not null,
  constraint pk_mission_techno primary key (mission_id,techno_id)
);

create table project (
  id                            bigint not null,
  start                         date,
  den                           date,
  description                   varchar(255),
  client_id                     bigint,
  constraint pk_project primary key (id)
);
create sequence project_seq;

create table techno (
  id                            bigint not null,
  name                          varchar(255),
  version                       varchar(255),
  constraint pk_techno primary key (id)
);
create sequence techno_seq;

alter table mission add constraint fk_mission_project_id foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_mission_project_id on mission (project_id);

alter table mission add constraint fk_mission_consultant_id foreign key (consultant_id) references consultant (id) on delete restrict on update restrict;
create index ix_mission_consultant_id on mission (consultant_id);

alter table mission_techno add constraint fk_mission_techno_mission foreign key (mission_id) references mission (id) on delete restrict on update restrict;
create index ix_mission_techno_mission on mission_techno (mission_id);

alter table mission_techno add constraint fk_mission_techno_techno foreign key (techno_id) references techno (id) on delete restrict on update restrict;
create index ix_mission_techno_techno on mission_techno (techno_id);

alter table project add constraint fk_project_client_id foreign key (client_id) references client (id) on delete restrict on update restrict;
create index ix_project_client_id on project (client_id);


# --- !Downs

alter table mission drop constraint if exists fk_mission_project_id;
drop index if exists ix_mission_project_id;

alter table mission drop constraint if exists fk_mission_consultant_id;
drop index if exists ix_mission_consultant_id;

alter table mission_techno drop constraint if exists fk_mission_techno_mission;
drop index if exists ix_mission_techno_mission;

alter table mission_techno drop constraint if exists fk_mission_techno_techno;
drop index if exists ix_mission_techno_techno;

alter table project drop constraint if exists fk_project_client_id;
drop index if exists ix_project_client_id;

drop table if exists client;
drop sequence if exists client_seq;

drop table if exists consultant;
drop sequence if exists consultant_seq;

drop table if exists mission;
drop sequence if exists mission_seq;

drop table if exists mission_techno;

drop table if exists project;
drop sequence if exists project_seq;

drop table if exists techno;
drop sequence if exists techno_seq;

