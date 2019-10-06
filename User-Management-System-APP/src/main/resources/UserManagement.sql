create table USER_CALL
(
   USER_ID int,
   USER_NAME varchar (15),
   PANCARD varchar (20),
   ADHAR varchar (20),
   EMAIL varchar (25),
   PHONE integer (29),
   primary key ("USER_ID")
);
create table ADDRESS_CALL
(
   ADDR_ID int,
   STREET_NAME varchar (20),
   CITY varchar (20),
   STATE varchar (10),
   COUNTRY varchar (20),
   PINCODE integer (10),
   primary key ("ADDR_ID"),
   foreign key ("USER_ID") references USER_CALL ("USER_ID")
);
create table BACKGROUND
(
   BID int,
   DOCUMENTS_DETAILS varchar (20),
   CRIMINALS_RECORD boolean,
   STATUS boolean,
   DOCUMENT_CHECK VARCHAR (20),
   USER_ID int,
   primary key ("BID")
);
create table QUALIFICATION
(
   QUA_ID int,
   NAME varchar (20),
   USER_ID int,
   primary key ("QUA_ID")
)
select *
from
   QUALIFICATION;
create table SSC
(
   MID int,
   COL_NAME varchar (20),
   SCHOOL varchar (20),
   UNIVERSITY varchar (20),
   CITY varchar (15),
   STATE varchar (20),
   PINCODE integer (20),
   QUA_ID int,
   primary key ("MID")
)
create table SEDUCATION
(
   SID int,
   COL_NAME varchar (20),
   SCHOOL varchar (20),
   UNIVERSITY varchar (20),
   CITY varchar (15),
   STATE varchar (20),
   PINCODE integer (20),
   QUA_ID int,
   primary key ("SID")
)
create table GRADUATION
(
   GID int,
   COL_NAME varchar (20),
   SCHOOL varchar (20),
   UNIVERSITY varchar (20),
   CITY varchar (15),
   STATE varchar (20),
   PINCODE integer (20),
   QUA_ID int,
   primary key ("GID")
)