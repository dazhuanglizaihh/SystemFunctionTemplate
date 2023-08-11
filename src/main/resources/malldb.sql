drop table if exists 'user';
create table 'user'(
    'id' int(11) not null auto_increment,
    'name' varchar(20) collate utf8_unicode_ci not null,
    'email' varchar(20) collate utf8_unicode_ci default '',
    'password' varchar(16) collate utf8_unicode_ci not null,
    'createtime' timestamp not null default '',
) engine=innodb default charset=utf8 collate=utf8_unicode_ci;


--drop table user;
-- CREATE TABLE user
-- (
--     id INT(11) AUTO_INCREMENT PRIMARY KEY,
--     username VARCHAR(25),
--     email VARCHAR(25),
--     password VARCHAR(8),
--     status int(4)
-- );
--
-- #测试数据
-- INSERT INTO user
-- (id, username, email, password, status)
-- VALUES ('wml', '1980352822@qq.com', 'qwer8765', 1);

