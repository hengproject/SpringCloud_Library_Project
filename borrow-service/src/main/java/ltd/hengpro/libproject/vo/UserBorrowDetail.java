package ltd.hengpro.libproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import ltd.hengpro.libproject.entity.Book;
import ltd.hengpro.libproject.entity.User;

import java.util.List;

@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
