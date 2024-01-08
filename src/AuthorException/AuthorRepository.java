package AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class AuthorRepository {
    List<Author> authors;
    AuthorRepository(){
        authors = new ArrayList<>();
    }
    public void register(Author author) {
        authors.add(author);
    }

    public Author checkLoging(String email, String pwd) throws IllegalArgumentException, NoSuchElementException  {
        /*
        이메일이 존재하지 않으면 예외발생 (Nosuch)
        pwd가 틀리면 예외발생 (IllegalArgu)
         */
        Author reauth = null;
        for(Author author : authors){
            if(author.getEmail().equals(email) && author.getPassword().equals(pwd)){
                reauth = author;
            }else if(author.getEmail().equals(email) && !author.getPassword().equals(pwd)){
                throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
            }else{
                throw new NoSuchElementException(email+" : 이메일을 찾을 수 없습니다.");
            }
        }
        return reauth;
    }
}
