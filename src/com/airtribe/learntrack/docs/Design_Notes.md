## Array List reason - 
1. Array list are much more dynamic than regular arrays.
2. Array list is dynamic in size and have many built-in methods whereas arrays are static in size and do not have many inbuilt methods
3. Here, we need to add/remove Students/Courses/Enrollments multiple times in the run for which we need dynamic data structure which is easy to modify.

## Static members - 
I used static members in service.Service class for the array lists which stores our three entities.
I also used static members in IDcounters for Student, Course, and Enrollment classes in util.IdGenerator class.

Static members are used here, because the members should be declared once and the values should be the same over the course of the program run.

For eg - in Idcounters, the counters are static because they are not dependent on the instance of the class but are same throughout the class existence.

## Inheritance
We used inheritance in creating Student which Inherits from Person class.
A person will have a name and an email which we can reuse while instantialising the Student class.
We can use getName, setName, getEmail, setEmail methods from the Person class.

If we were to create a new class (let's say Instructor) it will inherit the Person class as an instructor will have a name and an email as well.