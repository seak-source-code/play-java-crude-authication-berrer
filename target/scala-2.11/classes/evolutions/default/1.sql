# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                        bigint auto_increment not null,
  username                  varchar(255),
  password                  varchar(255),
  role_id                   bigint,
  constraint uq_user_role_id unique (role_id),
  constraint pk_user primary key (id))
;

create table UserRole (
  id                        bigint auto_increment not null,
  status                    varchar(255),
  description               varchar(255),
  constraint pk_UserRole primary key (id))
;

create table UserToken (
  id                        bigint auto_increment not null,
  auth_token                varchar(255),
  expried_date              datetime(6),
  user_id                   bigint,
  constraint uq_UserToken_user_id unique (user_id),
  constraint pk_UserToken primary key (id))
;

alter table user add constraint fk_user_userRole_1 foreign key (role_id) references UserRole (id) on delete restrict on update restrict;
create index ix_user_userRole_1 on user (role_id);
alter table UserToken add constraint fk_UserToken_user_2 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_UserToken_user_2 on UserToken (user_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table user;

drop table UserRole;

drop table UserToken;

SET FOREIGN_KEY_CHECKS=1;

