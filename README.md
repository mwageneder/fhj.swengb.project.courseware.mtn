# SWENGB Project 
### Courseware
**TEAM - [M](https://github.com/mwageneder "github.com/mwageneder") [T](https://github.com/tortmann "github.com/tortmann") [N](https://github.com/nspalek "github.com/nspalek")**

                                         Thomas Ortmann | Nina Spalek | Maximilian Wageneder


### Introduction:
This Project was developed during our Bachelor Degree Programme "Informationsmanagement" @FH Joanneum Graz.  
Our Trainers were DI (FH) Johann Blauensteiner & [Dipl.-Ing. Robert Ladstätter](https://github.com/rladstaetter "github.com/rladstaetter")

### Goal: 
Scala Database Application to display our Bachelor Degree Programme <br>
### Database:
Connection to Microsoft SQL Server (imasql @FH Joanneum)
  
!! **NOTE** !! to get a Database Connectivity you have to install the Microsoft JDBC Driver 4.0 manually  
!! **NOTE** !! Maven Library doesn't contain Maicrosoft JDBC Driver 


==========================

### ER-Model:
![ER](https://github.com/NSpalek/fhj.swengb.project.courseware.mtn/blob/master/src/main/resources/Screenshots/ER_Model_Courseware.png "ER-Diagram")

___

### Functionalities: <br>

•	From the Main Menu -- select between following Tables: <br>
1. Lecture Event<br>
2. Student<br>
3. Teachter<br>
4. Commissional Exams<br>
5. Classroom <br>

![MainMenu](https://github.com/nspalek/fhj.swengb.project.courseware.mtn/blob/master/src/main/resources/Screenshots/Courseware_MainMenu.jpg "MainMenu")

____

•	At the first three Tables you are able to CREATE, EDIT, DELETE the DB-Entries <br>
•	Further you can create Reports (for Example an Attandance List of Students, ...) <br>
•	At the last two Tables you are only able to READ the DB-Entries <br>

____

![CRUD](https://github.com/NSpalek/fhj.swengb.project.courseware.mtn/blob/master/src/main/resources/Screenshots/Courseware_CRUD_Lecture_Event.png "CRUD")
<br> Here you can see the Overview (READ) of one specific Table <br>

____
![Create](https://github.com/nspalek/fhj.swengb.project.courseware.mtn/blob/master/src/main/resources/Screenshots/Courseware_C_Lecture_Event.png "Create")
<br> Here you can see the Create Window 

____

![Read_Update](https://github.com/nspalek/fhj.swengb.project.courseware.mtn/blob/master/src/main/resources/Screenshots/Courseware_RU_Lecture_Event.png "Read_Update")
<br> To Edit a Lecture Event you click on it and then on the Edit Button and then there appears the following Window! 

___

![Update](https://github.com/nspalek/fhj.swengb.project.courseware.mtn/blob/master/src/main/resources/Screenshots/Courseware_U_Lecture_Event.png "Update")
<br> The same for the UPDATE Window 

____

![CommExam](https://github.com/nspalek/fhj.swengb.project.courseware.mtn/blob/master/src/main/resources/Screenshots/Courseware_CommExam.png "CommExam")
<br> At the Table Commissional Exam you are allowed to READ the Content, but you can't do anything! 

____

![Report](https://github.com/nspalek/fhj.swengb.project.courseware.mtn/blob/master/src/main/resources/Screenshots/Courseware_Report.png "Report")
<br> Here you can see an Example Report of Teachers in the Database 

____

## Workload

ToDO | Workload
------------ | -------------
SQL Database | 80h
Scala Hardcoding | 60h
GUI  |    20h
Documentation | 3h
Wasted Time with GIT | 2h
Waiting for Response of IMASQL | 2h
 | --------
TOTAL | 167h


## Costs for our Programme  

167h = 1 person - 1 month (40h/week)
netincome 2500 per Month


## => 5.000€
