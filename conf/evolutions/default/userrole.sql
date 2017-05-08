# UserRole schema

# --- !Ups

CREATE TABLE UserRole (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    status bigint(10) NOT NULL,
    description text NOT NULL,
    PRIMARY KEY (id)
);

# --- !Downs
DROP TABLE UserRole;