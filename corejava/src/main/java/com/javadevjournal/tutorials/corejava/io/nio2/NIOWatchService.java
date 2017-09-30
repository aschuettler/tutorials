package com.javadevjournal.tutorials.corejava.io.nio2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import static java.nio.file.StandardWatchEventKinds.*;

/**
 * Created by umesh on 6/15/17.
 */
public class NIOWatchService {

    public static void main(String[] args) throws IOException, InterruptedException {

        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path directory = Paths.get("/Users/umesh/personal/tutorials/source");
        directory.register(watchService,
                ENTRY_CREATE,
                ENTRY_DELETE,
                ENTRY_MODIFY);

        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                if (event.kind() == ENTRY_CREATE) {
                    //handle create
                }
                if (event.kind() == ENTRY_DELETE) {
                    //handle delete
                }

                System.out.println(event.kind()+ " Event Happened on "+event.context());
            }

            key.reset();
        }
    }
}
