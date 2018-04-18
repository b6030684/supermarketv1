package com.asimon

class BootStrap {

    def init = { servletContext ->

/*def manager1 = new
 
Manager(

fullName: 'Arran Simon',
userName: 'ManagerAS',
password: 'password',
managerEmail: 'managerAS@manager.co.uk',
office: 'M1-000',
department: 'Clothing',
employees: 'Jack Morley',
teamleaders: 'Daniel Stone'
).save()

def manager2 = new
 
Manager(

fullName: 'Paulina Dybich',
userName: 'ManagerPD',
password: 'password',
managerEmail: 'managerPD@manager.co.uk',
office: 'M2-000',
department: 'Bakery'
).save()

def teamleader1 = new

Teamleader(

fullName: 'Daniel Stone',
department: 'Bakery',
employeeID: 'TL2-000',
sectionName: 'Bakers',
officePhone: '0848392764',
leaderEmail: 'teamleaderDS@teamleader.co.uk',
password: 'password'
).save()

def teamleader2 = new

Teamleader(

fullName: 'Harris Mohammed',
department: 'Clothing',
employeeID: 'TL3-000',
sectionName: 'Knitters',
officePhone: '0845492364',
leaderEmail: 'teamleaderHM@teamleader.co.uk',
password: 'password'
).save()

def team1 = new

Team(

teamName: 'Team Bakers',
numberOfEmployees: '15',
sectionName: 'Bakers',
description: 'Baking Fresh Goods'
).save()

def team2 = new

Team(

teamName: 'Team Knitters',
numberOfEmployees: '13',
sectionName: 'Knitters',
description: 'Knitting Clothes'
).save()

def shift1 = new

Shift(

timeOfDay: 'Morning',
dayOfWeek: 'Tuesday',
numberOfHours: '6',
startingTime: '06:00'
).save()

def shift2 = new

Shift(

timeOfDay: 'Evening',
dayOfWeek: 'Thursday',
numberOfHours: '8',
startingTime: '18:00'
).save()

def employee1 = new

Employee(

fullName: 'Emma Smith',
dateOfBirth: new Date('01/03/1998'),
residence: 'Sheffield',
hourlyRate: 8.70,
employeeID: 'E1-000',
dateEmployed: new Date('21/05/2004'),
taxCode: 'TX748',
contract: 'Full-Time'
).save()

def employee2 = new

Employee(

fullName: 'Jack Morley',
dateOfBirth: new Date('23/07/1998'),
residence: 'Sheffield',
hourlyRate: 9.70,
employeeID: 'E2-000',
dateEmployed: new Date('29/03/2009'),
taxCode: 'TX088',
contract: 'Part-Time'
).save()

def task1 = new

Task(

taskName: 'Baking',
numberOfPeople: 12,
sectionName: 'Bakers',
department: 'Bakery',
timeRequired: '2 Hours',
description: 'Bake bread',
taskCompleted: 'Pending'
).save()

def task2 = new

Task(

taskName: 'Knitting',
numberOfPeople: 10,
sectionName: 'Knitters',
department: 'Clothing',
timeRequired: '8 Hours',
description: 'Knit Clothes',
taskCompleted: 'Yes'
).save()*/
    }
    def destroy = {
    }
}
