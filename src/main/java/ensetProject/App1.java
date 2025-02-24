package ensetProject;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FSDataOutputStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class App1 {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://namenode:8020");
        FileSystem fs = FileSystem.get(conf);

        Path path = new Path("/file1.txt");
        FSDataOutputStream fos = fs.create(path);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.UTF_8));

        bw.write("Bonjour\n");
        bw.write("Tout le monde\n");
        bw.write("Fin du fichier\n");
        bw.close();

        fs.close();
    }
}
