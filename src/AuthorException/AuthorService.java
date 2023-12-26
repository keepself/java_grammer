package AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {
    AuthorRepository authorRepository;

    AuthorService(){
        authorRepository = new AuthorRepository();
    }
    void register(Author author) throws IllegalArgumentException{
        // 만약에 password 5자리 이하이면 예외발생 (IllegalArgu)
        if (author.getPassword().length()>=5) {
            authorRepository.register(author);
        }else{
            throw new IllegalArgumentException("비밀번호 길이가 짧습니다.");
        }

    }
    Optional<Author> login(String email, String pwd ) {

        Author checkAuthor = authorRepository.checkLoging(email, pwd);

        return Optional.ofNullable(checkAuthor);
    }

}
