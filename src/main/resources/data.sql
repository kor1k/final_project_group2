-- 00n - Location
-- 000n - Educations
-- n - Talents
-- 1n - Profiles
-- 11n - Employers
-- 01n - Companies

insert into LOCATIONS values (001 , 'Los Angeles' , 'USA');
insert into LOCATIONS values (002 , 'Berlin' , 'Germany');
insert into LOCATIONS values (003 , 'Kyiv' , 'Ukraine');
insert into TALENTS (ID , EMAIL , FULL_NAME , PASSWORD , LOCATION_ID) values (1 , 'email@nomail.com' , 'Toto Cutunio' , '123456789' , 001);
insert into TALENTS (ID , EMAIL , FULL_NAME , PASSWORD , LOCATION_ID) values (2 , 'email_1@nomail.com' , 'Dodo Dududnio' , '987654321' , 002);
insert into COMPANIES values (011 , '' , '' , 'IT' , 'no logo' , 'Small Group inc.');
insert into EMPLOYERS values (111 , 'Gregory Laurence' , '1223334444' , '+1235588770' , 'workemail@nomail.com' , 011 , 003);
insert into PROFILES values (11 , 3000 , 1);
insert into PROFILES values (12 , 2874 , 2);
insert into EDUCATIONS values (0001 , 'master' , 'no description yet' , 18-06-2008 , 'NTUU "KPI"' , false , 'Economics' , 01-09-2002 , 11);
