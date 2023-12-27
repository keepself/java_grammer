package C17ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

//text파일 parsing
public class C1702FileParsing {
    public static void main(String[] args) {
//
        Path filePath = Paths.get("src/C17ExceptionFileParsing/text_file.txt");

//        버퍼기능이 구현돼있고, nio패키지에서는 non-blocking방식 사용
//        기본이 StandardCharsetss.UTF_8
//        CREATE_NEW 이후에 APPEND 실행 가능.
        try {
            if (Files.exists(filePath)) {
//                append : 추가, write
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.CREATE_NEW);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

//      파일읽기 : readString, readAllLines(List형태)
        try {
            String mySt = Files.readString(filePath);
            System.out.println(mySt);
//                    readAllLines을 가지고 for문을 돌려 출력.
            List<String> myList = Files.readAllLines(filePath);
            for(String a : myList){
                System.out.println(a + "선수");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
