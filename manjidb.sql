

create database NSBMsystem;

use NSBMsystem;

create table faculty(
facultyId varchar(10),
facultyName varchar(30),
primary key(facultyId)
);

create table undergraduateStudent(
nameWithIntials varchar(30),
userName varchar(20),
regNo varchar(20),
indexNo varchar(20),
admission date,
email varchar(40),
mobile varchar(10),
nic varchar(12),
address varchar(60),
subName1 varchar(20),
subGrade1 varchar(3),
subName2 varchar(20),
subGrade2 varchar(3),
subName3 varchar(20),
subGrade3 varchar(3),
engGrade varchar(3),
islandRank varchar(8),
zScore varchar(8),
facultyId varchar(10),
primary key(indexNo),
/*primary key(regNo),*/
foreign key(facultyId) references faculty(facultyId),
password varchar(45)    
);

create table postGraduateStudent(
nameWithIntials varchar(30),
userName varchar(20),
regNo varchar(20),
indexNo varchar(20),
admission date,
email varchar(40),
mobile varchar(10),
nic varchar(12),
address varchar(60),
insitute varchar(30),
qualificationType varchar(40),
qualification varchar(50),
primary key(indexNo),
facultyId varchar(10),
/*primary key(regNo),*/
foreign key(facultyId) references faculty(facultyId),
password varchar(45)
);

create table lecture(
nameWithIntials varchar(30),
userName varchar(20),
regNo varchar(20),
indexNo varchar(20),
email varchar(40),
mobile varchar(10),
nic varchar(12),
address varchar(60),
primary key(indexNo),
/*primary key(regNo),*/
password varchar(45)
);

create table instroucter(
nameWithIntials varchar(30),
userName varchar(20),
regNo varchar(20),
indexNo varchar(20),
email varchar(40),
mobile varchar(10),
nic varchar(12),
address varchar(60),
primary key(indexNo),
/*primary key(regNo),*/
password varchar(45)
);



create table admin(
userId varchar(10),
nameWithIntials varchar(30),
userName varchar(20),
email varchar(40),
mobile varchar(10),
nic varchar(12),
address varchar(60),
password varchar(45),
primary key(userId)
);

create table course(
courseId varchar(10),
courseName varchar(45),
courseCodinater varchar(30),
semesterFees decimal(20,2),/*we can use decimal(10,2) for this*/
primary key(courseId)
);

create table subject(
subjectCode varchar(10),
subjectName varchar(45),/*labid*/
superviser varchar(30),/*lecture name with initails*/
instroucter1 varchar(30),
instroucter2 varchar(30),
numberOfCredit Int(5),
numberOfAssignment Int(5),
primary key (subjectCode)

);

create table semester(
courseName varchar(45),
courseId varchar(10),
semesterId varchar(10),
semesterFees decimal(10,2),
start date,
end date,
primary key(semesterId)
);

create table payment(
resitNo varchar(10),
nameWithIntials varchar(30),
regNo varchar(20),
indexNo varchar(20),
value decimal(10,2),
semesterId varchar(10),
primary key (resitNo),
foreign key (semesterId) references semester(semesterId)

);

create table subjectLecture(
subjectCode varchar(10),
regNo varchar(20),
foreign key (subjectCode) references subject(subjectCode),
foreign key (regNo) references lecture(regNo)
);









