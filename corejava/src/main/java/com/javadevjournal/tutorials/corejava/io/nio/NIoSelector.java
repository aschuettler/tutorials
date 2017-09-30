package com.javadevjournal.tutorials.corejava.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 * Created by umesh on 6/13/17.
 */
public class NIoSelector {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("http://www.google.com",80));

        socketChannel.configureBlocking(false);
        SelectionKey key= socketChannel.register(selector, SelectionKey.OP_READ);

        key.channel();
        key.selector();

        selector.select();

        Set<SelectionKey> readyToUseChannel= selector.selectedKeys();

        for(SelectionKey selectionKey : readyToUseChannel){
            if(selectionKey.isAcceptable()){
                // connection accepted
            }
            else if(selectionKey.isReadable()){
                //channel ready to read
            }
        }

    }

    public static void getInterestSet(SelectionKey key){

        int readySet= key.readyOps();
        key.isAcceptable();
        key.isConnectable();
    }
}
