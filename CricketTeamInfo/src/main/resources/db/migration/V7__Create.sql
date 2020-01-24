DROP table IF EXISTS Player;
create table Player(id varchar(30),name varchar (100),cricket_team varchar(100),PRIMARY KEY(id));

DROP table IF EXISTS Matches;
create table Matches(id varchar(30),series_name varchar (100),location varchar(200),PRIMARY KEY(id));

DROP table IF EXISTS Mapping;
create table Mapping(pid varchar(30),mid varchar(30),score INT,PRIMARY KEY(pid,mid),
CONSTRAINT fk_pid
    FOREIGN KEY (pid) 
        REFERENCES Player(id),
        CONSTRAINT fk_mid
    FOREIGN KEY (mid) 
        REFERENCES Matches(id));