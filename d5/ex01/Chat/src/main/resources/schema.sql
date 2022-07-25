CREATE SCHEMA IF NOT EXISTS CHAT;

DROP TABLE IF EXISTS CHAT.Users, CHAT.Chatroom, CHAT.Message;
CREATE TABLE IF NOT EXISTS CHAT.Users(
                      user_id serial,
                      login varchar NOT NULL,
                      password varchar NOT NULL,
                      PRIMARY KEY(user_id)
);

CREATE TABLE IF NOT EXISTS CHAT.Chatroom(
                         room_id serial,
                         room_name varchar NOT NULL,
                         creator_id int NOT NULL REFERENCES CHAT.Users(user_id),
                         PRIMARY KEY (room_id)
);

CREATE TABLE IF NOT EXISTS CHAT.Message(
                        message_id serial,
                        user_id int REFERENCES CHAT.Users(user_id),
                        room_id int REFERENCES CHAT.Chatroom(room_id),
                        message text,
                        date_mes TIMESTAMP,
                        PRIMARY KEY (message_id)
);