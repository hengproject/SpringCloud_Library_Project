package ltd.hengpro.libproject.service;

import ltd.hengpro.libproject.vo.UserBorrowDetail;

public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}