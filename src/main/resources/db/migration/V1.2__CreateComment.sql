create table comment
(
    id            bigint auto_increment,
    parent_id     bigint not null,
    type          int    not null,
    commentator   bigint not null,
    gmt_create    bigint,
    gmt_modified  bigint,
    like_count    bigint(0),
    content       varchar(1024),
    comment_count int(0),
    constraint comment_pk
		primary key (id)
);
