/*データベース作成*/
drop database if exists bihin;
create database bihin;
use bihin;

/*テーブル作成(備品管理)*/
create table bihinKanri (
    bihinID varchar(20) not null primary key,
    bihinName varchar(50) not null,
    bihinKana varchar(100) not null,
    status int not null,
    userID varchar(20),
    returnDay date
);

/*データ追加*/
insert into bihinKanri values('B001','ホワイトボード','ホワイトボード',1,null,null);
insert into bihinKanri values('B002','蛍光灯','ケイコウトウ',1,null,null);
insert into bihinKanri values('B003','ボールペン','ボールペン',1,null,null);
insert into bihinKanri values('B004','付箋Y','フセンワイ',2,'U001','2016-09-10');
insert into bihinKanri values('B005','ホチキス','ホチキス',1,null,null);
insert into bihinKanri values('B006','延長コード','エンチョウコード',1,null,null);
insert into bihinKanri values('B007','付箋B','フセンB',1,null,null);
insert into bihinKanri values('B008','付箋R','フセンR',1,null,null);
insert into bihinKanri values('B009','机','ツクエ',1,null,null);
insert into bihinKanri values('B010','モニター','モニター',1,null,null);
insert into bihinKanri values('B011','LANケーブル','ランケーブル',1,null,null);
insert into bihinKanri values('B012','シュレッダー','シュレッダー',1,null,null);
insert into bihinKanri values('B013','マグネット小','マグネットショウ',1,null,null);
insert into bihinKanri values('B014','封筒小','フウトウショウ',1,null,null);
insert into bihinKanri values('B015','扇風機','センプウキ',1,null,null);

/*テーブル作成(部署管理)*/
create table departmentKanri (
    deptID varchar(20) not null primary key,
    deptName varchar(50) not null,
    deptKana varchar(100) not null
);

/*データ追加*/
insert into departmentKanri values('D001','経理部','ケイリブ');
insert into departmentKanri values('D002','総務部','ソウムブ');
insert into departmentKanri values('D003','営業部','エイギョウブ');
insert into departmentKanri values('D004','人事部','ジンジブ');
insert into departmentKanri values('D005','企画部','キカクブ');

create table userKanri (
    userID varchar(20) not null default '0' primary key,
    password varchar(50) not null,
    userName varchar(50) not null,
    userKana varchar(100) not null,
    deptID varchar(20) not null,
    authority int not null
);

insert into userKanri values('U001','A0000001','田中','タナカ','D001',1),
('U002','A0000002','鈴木','スズキ','D001',1), ('U003','A0000003','John','ジョン','D002',1),
('U004','A0000004','木村','キムラ','D003',2), ('U005','A0000005','佐藤','サトウ','D003',1),
('U006','A0000006','山田','ヤマダ','D004',1),('U007','A0000007','渡辺','ワタナベ','D004',1),
('U008','A0000008','伊藤','イトウ','D005',1);