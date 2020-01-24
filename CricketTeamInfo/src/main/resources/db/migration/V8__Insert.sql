insert into Player values('P01','Rohit','India');
insert into Player values('P02','Steve smith','australia');
insert into Player values('P03','Dhoni','India');
insert into Player values('P04','Shoaib','Pakistan');
insert into Player values('P05','Bhuneshvar','India');

insert into Matches values('MC01','Australia–West Indies','Australia');
insert into Matches values('MC02','New Zealand Test','India');
insert into Matches values('MC03','Australia–New Zealand ODI','New Zealand');
insert into Matches values('MC04','Asia World Cup','london');
insert into Matches values('MC05','IPL','India');

insert into Mapping values('P01','MC03',120);
insert into Mapping values('P01','MC01',200); 
insert into Mapping values('P02','MC03',100); 
insert into Mapping values('P03','MC02',50); 
insert into Mapping values('P02','MC04',500);
insert into Mapping values('P01','MC04',800);
insert into Mapping values('P03','MC05',1000);
insert into Mapping values('P04','MC05',700);