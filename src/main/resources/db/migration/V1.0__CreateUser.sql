create table user
(
    id           bigint auto_increment,
    account_id   varchar(100),
    name         varchar(50),
    token        char(36),
    gmt_create   bigint,
    gmt_modified bigint,
    bio          varchar(256),
    avatar_url   varchar(100),
    constraint myh2_pk
        primary key (id)
);
