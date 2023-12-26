package C17ExceptionFileParsing.AuthorException;

import java.util.*;
import java.util.Optional;

class AuthorService {
    AuthorRepository authorRepository;

    AuthorService() {
        authorRepository = new AuthorRepository();
    }

    void register(Author author) {
        //        만약에 password가 5자리 이하이면 예외발생(IllegalArgu)
        if (author.getPassword().length() < 10) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
//        기존에 같은 email있는지도 체크
        Optional<Author> author1 = authorRepository.getAuthorByEmail(author.getEmail())


        authorRepository.register(author);
        }
    }

    Optional<Author> login(String email, String password) throws IllegalArgumentException, NoSuchElementException{
        Optional<Author> author = authorRepository.getAuthorByEmail(email);
//        email이 존재하지 않으면 예외발생(NosuchElementException)
//        password가 틀리면 예외발생(IllegalArgu)
        if(author.isPresent()){
            if(author.get().getPassword().equals(password)){
                return author;
            }else{
                throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
            }
        }else{
            throw new NoSuchElementException("email이 존재하지 않습니다.");
        }

    }


}
