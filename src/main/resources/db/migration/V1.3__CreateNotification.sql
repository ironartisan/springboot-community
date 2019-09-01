create table notification
(
    id            bigint auto_increment primary key,
    notifier      bigint not null,
    receiver      bigint not null,
    outerid       bigint not null,
    type          int    not null,
    gmt_create    bigint not null,
    NOTIFIER_NAME varchar(100),
    OUTER_TITLE   varchar(256),
    status        int(0) not null
);