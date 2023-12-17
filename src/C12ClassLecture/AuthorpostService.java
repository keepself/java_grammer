package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorpostService {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Long author_id = 0L;

        while(true){

            System.out.println("서비스를 선택해주세요");
            System.out.println("1.회원가입 ,2.게시글작성 3.회원목록조회, 4.회원상세조회, 5.게시글상세조회");
            int service = sc.nextInt();
            if(service ==1){
                sc.nextLine();
                System.out.println("회원가입 서비스입니다.");
                System.out.println("회원가입하실 이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.println("회원가입하실 이메일을 입력해주세요");
                String email = sc.nextLine();
                System.out.println("회원가입하실 패스워드를 입력해주세요");
                String password = sc.nextLine();
                Author myAuthor1 = new Author(
                    name, email, password
                );
                authors.add(myAuthor1);
                author_id = myAuthor1.getId();
                System.out.println("회원가입이 완료되었습니다.");
            } else if (service==2) {
                sc.nextLine();
                System.out.println("게시글 작성 서비스입니다.");
                System.out.println("제목을 입력해주세요");
                String title = sc.nextLine();
                System.out.println("콘텐츠(를)을 입력해주세요");
                String contents = sc.nextLine();
                Post myPost = new Post(
                        title, contents, author_id
                );
                posts.add(myPost);
            } else if (service==3 ) {
                for (int i = 0; i < authors.size(); i++) {
                    System.out.println(authors.get(i).getEmail());
                }
            } else if (service==4 ) {


            } else if (service==5 ) {

            }else{
                System.out.println("번호를 다시 입력해주세요");
            }
//

        }
    }
}
//엔티티
class Author{

    private Long id;
    private String name;
    private String email;
    private String password;

    private static Long author_id;
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    static Long static_id = 0L;


    Author( String name, String email, String password){
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;

    }

}



class Post{

    Long id;
    String title;
    String contents;

    Long author_id;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Long getAuthor_id() {
        return author_id;
    }
    static Long static_id = 0L;

    Post( String title, String contents, Long author_id0){
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author_id = author_id;





    }
}