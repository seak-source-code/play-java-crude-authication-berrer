# Users schema

# --- !Ups

CREATE TABLE User (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    username varchar(255) NOT NULL,
    password text NOT NULL,
    role_id bigint(20),
    FOREIGN KEY(role_id) REFERENCES UserRole(id)  NOT NULL
    PRIMARY KEY (id)
);

# --- !Downs
DROP TABLE User;