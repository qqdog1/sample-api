CREATE TABLE IF NOT EXISTS platform_user (
    id integer auto_increment PRIMARY KEY,
    name VARCHAR(16) NOT NULL,
    create_time TIMESTAMP NOT NULL,
    update_time TIMESTAMP NOT NULL
);

