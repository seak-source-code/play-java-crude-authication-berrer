# UserToken schema

# --- !Ups

CREATE TABLE usertoken (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    authToken varchar(255) NOT NULL,
    expriedDate DATE NOT NULL,
    user_id bigint(20),
    FOREIGN KEY(user_id) REFERENCES user(id)  NOT NULL
    PRIMARY KEY (id)
);

# --- !Downs
DROP TABLE usertoken;