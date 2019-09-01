create table question
(
    id            bigint auto_increment,
    title         varchar(50),
    description   text,
    gmt_create    bigint,
    modified      bigint,
    creator       bigint,
    comment_count int(0),
    view_count    int(0),
    like_count    int(0),
    tag           varchar(256),
    constraint question_pk
        primary key (id)
);