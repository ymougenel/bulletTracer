# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table consultant (
  id                            bigint not null,
  nom                           varchar(255),
  prenom                        varchar(255),
  promo                         integer,
  constraint pk_consultant primary key (id)
);
create sequence consultant_seq;


# --- !Downs

drop table if exists consultant;
drop sequence if exists consultant_seq;

