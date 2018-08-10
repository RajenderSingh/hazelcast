## Hazelcast Spring Boot Example

## This example is built using Eclipse IDE with Maven

1. Download Eclipse IDE Oxygen.3a (4.7.3a) Release
 
2. Clone the repository from 

3. Import project in eclipse - Menu File –> Import –> Maven –> Existing Maven Projects

4. Browse to your source code location

5. Click Finish button to finish the importing

## Run the example

1. Open the MainApp.java 

2. Right click -> Run As -> Java Application  (if needed add -Dserver.port=9050 vm args to change default port)

## Hazelcast Spring Boot example
This example demonstrate Spring Boot integration with Hazelcast.


## Test the application
Step 1 :- Open browser and hit URL http://localhost:9050/employee/ 

Step 2 :- Notice server console for first request hit
EmployeeController :: getEmployees : started
EmployeeServiceImpl :: getEmployees : started

Step 3 :- Notice server console for second request hit
EmployeeController :: getEmployees : started

This shows that the request is being served from cache and control did not follow the statements from EmployeeServiceImpl getEmployees method as this method is getting cached.

Step 4 :- Open browser and hit URL http://localhost:9050/clearcache/

This will clear content from the cache and try to repeat steps 1 to 3 again and notice the console.

