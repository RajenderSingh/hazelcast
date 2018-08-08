## Hazelcast Simple Example

## This example is built using Eclipse IDE with Maven

1. Download Eclipse IDE Oxygen.3a (4.7.3a) Release
 
2. Clone the repository from 

3. Import project in eclipse - Menu File –> Import –> Maven –> Existing Maven Projects

4. Browse to your source code location

5. Click Finish button to finish the importing

## Run the example

1. Open the StartHazelcast.java 

2. Right click -> Run As -> Java Application

## Hazelcast Getting Started
This is a very simple example. It explains how to start a hazelcast instance using hazelcast.xml configuration file.
By default Hazelcast looks for hazelcast.xml on application classpath. If not specified, by default, uses multicast auto discovery mechanism. With this, it searches cluster members using multicast communications and do not require IP addresses to locate.

## Test the application
Step 1 :- In order to test this example, run StartHazelcast.java as java application. Now check the console for below line -
[xx.xx.xx.xx]:5701 is STARTED
It tells us that one instance has started on port 5701. Also look for below line -
Members [1] {
	Member [xx.xx.xx.xx]:5701 - abcdd485-qq5f-48c8-9909-2abc44071234 this
}
It tells us that currently cluster has one member. 

Step 2 :- run StartHazelcast.java as java application again with out terminating previous application. Now check the console for below line -
[[xx.xx.xx.xx]:5702 is STARTED
It tells us that another instance has also started on port 5702. Also look for below line -
Members [2] {
	Member [xx.xx.xx.xx]:5701 - abcdd485-qq5f-48c8-9909-2abc44071234
	Member [xx.xx.xx.xx]:5702 - zaa86024-ww12-ad96-99f5-2fc569051111 this
}
It tells us that now cluster has two members. Also check for below line -
Established socket connection between /xx.xx.xx.xx:62303 and /xx.xx.xx.xx:5701
It tells us that a socket connection got established between 2 members.

Step 3 :- We can also run application one more time and can have 3 members in cluster.
