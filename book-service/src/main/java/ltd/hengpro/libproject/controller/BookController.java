package ltd.hengpro.libproject.controller;

import jakarta.annotation.Resource;
import ltd.hengpro.libproject.entity.Book;
import ltd.hengpro.libproject.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Resource
    BookService service;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid){
        return service.getBookById(bid);
    }
}
