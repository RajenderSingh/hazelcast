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

## Hazelcast multicast-group and multicast-port example
This example explains the use of Hazelcast multicast-group and multicast-port configuration. The IP multicast, point-to-multipoint communication, are specified in hazelcast.xml configuration file.

In some cases while running hazelcast-sample1 example below WARNING gets displayed on application console -
WARNING: Received a JoinRequest with a different packet version! This -> 4, Incoming -> 1, Sender -> /xx.xx.xx.xx

This can be avoided by explicitly adding multicast-group and port configurations.

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
