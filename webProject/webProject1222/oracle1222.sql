CREATE TABLE login1222
(
	userId varchar2(10 char) NOT NULL,
	userPw varchar2(10 char) NOT NULL,
	gender varchar2(10 char) NOT NULL,
	hobbys varchar2(100 char) NOT NULL,
	hometown varchar2(100 char) NOT NULL,
	memo varchar2(250 char) NOT NULL,
	PRIMARY KEY (userId)
);

desc login1221;

insert into login1222(userId,userPw,gender,hobbys,hometown,memo) 
values('m1','11','남자','등산','서울','자기소개m1');
insert into login1222(userId,userPw,gender,hobbys,hometown,memo) 
values('m2','22','여자','여행','전라','자기소개m2');
insert into login1222(userId,userPw,gender,hobbys,hometown,memo) 
values('m3','33','남자','게임','경상','자기소개m3');

select count(*) from login1222 where userId='m1' and userPw='11';

select * from login1222 where userId='m1';

select * from login1222;
--
--insert into login1222(userId,userPw,gender,hobbysArry,hometown,memo) values(?,?,?,?,?,?)
--insert into login1222(userId,userPw,gender,hobbys,hometown,memo) 
--values('m3','33','남자','게임','경상','자기소개m3');