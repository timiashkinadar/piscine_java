
CREATE TABLE Users(
    user_id serial,
    login varchar NOT NULL,
    password varchar NOT NULL,
    PRIMARY KEY(user_id)
)

CREATE TABLE "Chatroom"(
    room_id serial,
    room_name varchar NOT NULL,
    creator_id int NOT NULL REFERENCES Users(user_id),
    PRIMARY KEY (room_id)
)

CREATE TABLE "Message"(
    message_id serial,
    user_id int REFERENCES Users(user_id),
    room_id int REFERENCES Chatroom(room_id),
    message text,
    date_mes TIMESTAMP,
    PRIMARY KEY (message_id)
)