package ru.se.ifmo.prog.lab7.server.threads;

import java.io.*;
import java.nio.*;
import java.net.*;
import java.nio.channels.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Callable;
import ru.se.ifmo.prog.lab7.cores.*;
import ru.se.ifmo.prog.lab7.commands.*;

public class ReadThread implements Callable<DatagramPacket> {
	private DatagramSocket datagramSocket;

	public ReadThread(DatagramSocket datagramSocket) {
		this.datagramSocket = datagramSocket;
	}
	@Override
	public DatagramPacket call() {
		try {
			byte[] arr = new byte[10000];
			DatagramPacket datagramPacket = new DatagramPacket(arr, arr.length);
			datagramSocket.receive(datagramPacket);	
			return datagramPacket;
		}
		catch (Exception e) {
			return null;
		}
	}
}
