package com.javadevjournal.tutorials.corejava.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by umesh on 6/13/17.
 */
public class SelectorServer {

    public static void main(String[] args) throws IOException {

        Selector selector =Selector.open();

        ServerSocketChannel serverSocket = ServerSocketChannel.open();

        serverSocket.bind(new InetSocketAddress("localhost", 5454));
        serverSocket.configureBlocking(false);
        selector.wakeup();

        serverSocket.register(selector, SelectionKey.OP_ACCEPT);

        ByteBuffer buffer = ByteBuffer.allocate(256);

        while(true){

            int noOfKeys=selector.select();
            System.out.println("Number of selected keys: " + noOfKeys);
            Set<SelectionKey> selectionKeySet = selector.selectedKeys();


            for(Iterator<SelectionKey> iterator = selectionKeySet.iterator(); iterator.hasNext();) {

                SelectionKey key = iterator.next();
                iterator.remove();



                if(key.isAcceptable()){
                    SocketChannel client = serverSocket.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ);
                    System.out.println("Incoming connected accepted from :: " +serverSocket);
                }

                if(key.isReadable()){

                    System.out.println("Reading incoming message from client");
                    SocketChannel client = (SocketChannel) key.channel();
                    client.read(buffer);
                    String message = new String( buffer.array(), Charset.forName("UTF-8") );
                    System.out.println("Message received :: " + message);
                    client.write(buffer);
                    buffer.clear();
                }


            }
        }
    }
}
