package com.javadevjournal.tutorials.corejava.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by umesh on 6/13/17.
 */
public class SocketClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        InetSocketAddress hostAddress = new InetSocketAddress("localhost", 5454);
        SocketChannel client = SocketChannel.open(hostAddress);

        System.out.println("Message sent to client");

        String serverMessage[] = {"Umesh","Awasthi"};
        for(int i=0 ; i< serverMessage.length ; i++){

            byte [] message = new String(serverMessage[i]).getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(message);
            client.write(buffer);
            buffer.clear();
            client.read(buffer);
            String response = new String(buffer.array()).trim();
            System.out.println("response=" + response);
            buffer.clear();
           // Thread.sleep(3000);
        }

        //client.close();
    }
}
