package org.motovs.indexstatereader;

import org.elasticsearch.cluster.metadata.IndexMetaData;
import org.elasticsearch.common.xcontent.NamedXContentRegistry;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Specify file names");
            return;
        }
        try {
            for (String file : args) {
                IndexMetaData indexMetaData = IndexMetaData.FORMAT.read(new NamedXContentRegistry(Collections.emptyList()), Path.of(file));
                System.out.println(indexMetaData.getIndex().getName());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
