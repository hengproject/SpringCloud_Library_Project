package ltd.hengpro.libproject.service.impl;

import jakarta.annotation.Resource;
import ltd.hengpro.libproject.entity.Book;
import ltd.hengpro.libproject.mapper.BookMapper;
import ltd.hengpro.libproject.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
