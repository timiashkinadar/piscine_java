INSERT INTO CHAT.Users (login, password)
VALUES ('User1', 'User1'),
       ('User2', 'User2'),
       ('User3', 'User3'),
       ('User4', 'User4'),
       ('User5', 'User5');

INSERT INTO CHAT.Chatroom (room_name, creator_id)
VALUES ('Room1', 1),
       ('Room2', 2),
       ('Room3', 3),
       ('Room4', 4),
       ('Room5', 5);

INSERT INTO CHAT.Message (user_id, room_id, message, date_mes)
VALUES (1, 1, 'Hello, user1!', current_timestamp),
       (2, 2, 'Hello, user2!', current_timestamp),
       (3, 3, 'Hello, user3!', current_timestamp),
       (4, 4, 'Hello, user4!', current_timestamp),
       (5, 5, 'Hello, user5!', current_timestamp);
