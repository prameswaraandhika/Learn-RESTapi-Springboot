INSERT INTO user_details (id, birth_date, name)
VALUES (1001, CURRENT_DATE(), 'prameswara');

INSERT INTO user_details (id, birth_date, name)
VALUES (1002, CURRENT_DATE(), 'wirasti');

INSERT INTO user_details (id, birth_date, name)
VALUES (1003, CURRENT_DATE(), 'amel');

INSERT INTO post (id, description, user_id)
VALUES (2001, 'Java Basic', 1001);

INSERT INTO post (id, description, user_id)
VALUES (2002, 'Java Object Oriented Programming', 1001);

INSERT INTO post (id, description, user_id)
VALUES (2003, 'Java Spring boot', 1001);


INSERT INTO post (id, description, user_id)
VALUES (2004, 'Javascript Basic', 1002);

INSERT INTO post (id, description, user_id)
VALUES (2005, 'Javascript DOM', 1002);

INSERT INTO post (id, description, user_id)
VALUES (2006, 'VUE JS', 1002);



INSERT INTO post (id, description, user_id)
VALUES (2007, 'Dart Basic', 1003);

INSERT INTO post (id, description, user_id)
VALUES (2008, 'Flutter', 1003);
