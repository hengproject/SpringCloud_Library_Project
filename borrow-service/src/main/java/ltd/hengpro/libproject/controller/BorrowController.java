package ltd.hengpro.libproject.controller;

import jakarta.annotation.Resource;
import ltd.hengpro.libproject.service.BorrowService;
import ltd.hengpro.libproject.vo.UserBorrowDetail;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowController {

    @Resource
    BorrowService service;

    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail findUserBorrows(@PathVariable("uid") int uid){
        return service.getUserBorrowDetailByUid(uid);
    }
}
