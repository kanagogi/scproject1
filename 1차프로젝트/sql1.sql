create table MYUSER(
ID varchar2(10) primary key
, PWD number(6) 
, NAME varchar2(20) 
);

create table DREAM(
DREAM_ID varchar2(20) primary key
, DREAM_NAME varchar2(20) 
, START_DATE date
, END_DATE date
, MONEY number(20)
);

create table DREAM_LIST(
ID varchar2(10) references MYUSER(ID)
, DREAM_ID varchar2(20) references DREAM(DREAM_ID)
);