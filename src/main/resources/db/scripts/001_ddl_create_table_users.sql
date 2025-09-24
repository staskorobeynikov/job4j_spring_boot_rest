CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR(2000),
    created  TIMESTAMP
);