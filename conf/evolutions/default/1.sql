# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table page_retrieval (
  id                            bigserial not null,
  timestamp                     bigint,
  constraint pk_page_retrieval primary key (id)
);


# --- !Downs

drop table if exists page_retrieval cascade;

