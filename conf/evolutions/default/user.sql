# Users schema

# --- !Ups

CREATE TABLE user (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    username varchar(255) NOT NULL,
    password text NOT NULL,
    user_id bigint(20),
    FOREIGN KEY(user_id) NOT NULL
    PRIMARY KEY (id)
);

# --- !Downs
DROP TABLE user;