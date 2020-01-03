create table Teacher (
  ssn char(9),   firstName varchar(25),
  mi char(1),   lastName varchar(25),
  phone char(11),birthDate date,
  street varchar(25),   zipCode char(5),
  deptId char(4),    primary key (ssn)
);
insert into Teacher values ('444111110', 'Jacob', 'R', 'Smith', '9129219434','1985-04-09', '99 Kingston Street', '31435', 'BIOL');
insert into Teacher values ('444111111', 'John', 'K', 'Stevenson', '9129219434', null, '100 Main Street', '31411', 'BIOL');
insert into Teacher values ('444111112', 'George', 'R', 'Heintz', '9129213454','1974-10-10', '1200 Abercorn Street', '31419', 'CS');
insert into Teacher values ('444111113', 'Frank', 'E', 'Jones', '9125919434', '1970-09-09', '100 Main Street', '31421', 'BIOL');
insert into Teacher values ('444111114', 'Jean', 'K', 'Smith', '9129219434',  '1970-02-09', '100 Main Street', '31411', 'CHEM');
insert into Teacher values ('444111115', 'Josh', 'R', 'Woo', '7075989434', '1970-02-09', '555 Franklin Street', '31411', 'CHEM');
insert into Teacher values ('444111116', 'Josh', 'R', 'Smith', '9129219434',  '1973-02-09', '100 Main Street', '31411', 'BIOL');
insert into Teacher values ('444111117', 'Joy', 'P', 'Kennedy', '9129229434',  '1974-03-19', '103 Bay Street', '31412', 'CS');
insert into Teacher values ('444111118', 'Toni', 'R', 'Peterson', '9129229434',  '1964-04-29', '103 Bay Street', '41415', 'MATH');
insert into Teacher values ('444111119', 'Patrick', 'R', 'Stoneman', null,  '1969-04-29', '101 Washington Street', '31435', 'MATH');
insert into Teacher values ( '444111120', 'Rick', 'R', 'Carter', null, '1986-04-09', '19 West Ford Street', '31411', 'BIOL');
