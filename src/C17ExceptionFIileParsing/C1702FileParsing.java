package C17ExceptionFIileParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//text파일 parsing
public class C1702FileParsing {
    public static void main(String[] args) {
//
        Path filePath = Paths.get( "src/C17ExceptFileParsing/text_file.txt");

//        버퍼기능이 구현돼있고, nio패키지에서는 non-blocking방식 사용
//        기본이 StandardCharsetss.UTF_8
        try {
            Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
//C:\Users\Playdata\java_grammer\src\C17ExceptionFIileParsing\C1702FileParsing.java