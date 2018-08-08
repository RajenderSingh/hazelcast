## Hazelcast TCP Discovery Mechanism Example

## This example is built using Eclipse IDE with Maven

1. Download Eclipse IDE Oxygen.3a (4.7.3a) Release
 
2. Clone the repository from 

3. Import project in eclipse - Menu File –> Import –> Maven –> Existing Maven Projects

4. Browse to your source code location

5. Click Finish button to finish the importing

## Run the example

1. Open the StartHazelcast.java 

2. Right click -> Run As -> Java Application

## Hazelcast TCP Discovery Mechanism example
This example explains TCP Discovery Mechanism example. Apart from multicast discovery, we can configure Hazelcast for full TCP/IP cluster. Set attribute multicast enabled to false and tcp-ip to true.

<multicast enabled="false">

<tcp-ip enabled="true">

In TCP Discovery Mechanism, all or subset of cluster member's hostnames and/or IP addresses must be listed under member tag and those nodes will get added to the cluster. All hazelcast nodes should be up and running on servers otherwise socket exception will occur in console like below -
Could not connect to: /xx.xx.xx.xx:5702. Reason: SocketException[Connection refused: connect to address /xx.xx.xx.xx:5702]


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
