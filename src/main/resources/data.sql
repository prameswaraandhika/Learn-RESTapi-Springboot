INSERT INTO user_details (id, birth_date, name)
VALUES (12, CURRENT_DATE(), 'prameswara');
INSERT INTO user_details (id, birth_date, name)
VALUES (11, CURRENT_DATE(), 'wirasti');
INSERT INTO user_details (id, birth_date, name)
VALUES (10, CURRENT_DATE(), 'amel');

INSERT INTO post (id, description, user_id)
VALUES (1, 'Java Basic', 12);
INSERT INTO post (id, description, user_id)
VALUES (2, 'Java Object Oriented Programming', 12);
INSERT INTO post (id, description, user_id)
VALUES (3, 'Java Springboot', 12);

INSERT INTO post (id, description, user_id)
VALUES (4, 'Javascript Basic', 11);
INSERT INTO post (id, description, user_id)
VALUES (5, 'Javascript DOM', 11);
INSERT INTO post (id, description, user_id)
VALUES (6, 'VUE JS', 11);

INSERT INTO post (id, description, user_id)
VALUES (7, 'Dart Basic', 10);
INSERT INTO post (id, description, user_id)
VALUES (8, 'Flutter', 10);
