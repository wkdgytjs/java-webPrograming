
/* Drop Tables */

DROP TABLE member1215 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE member1215
(
	userId varchar2(10 char) NOT NULL,
	userPw varchar2(10 char) NOT NULL,
	userName varchar2(10 char) NOT NULL,
	PRIMARY KEY (userId)
);



