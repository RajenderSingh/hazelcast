package com.demo;

import com.hazelcast.core.Hazelcast;

public class StartHazelcast {
	public static void main(String[] args) {
		Hazelcast.newHazelcastInstance();
	}
}
