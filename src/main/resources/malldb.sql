CREATE TABLE user
(
    id INT(11) AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(25),
    email VARCHAR(25),
    password VARCHAR(8),
    status int(4)
);

#测试数据
INSERT INTO user
(id, username, email, password, status)
VALUES ('wml', '1980352822@qq.com', 'qwer8765', 1);