package com.bughra.java.service;

import com.bughra.java.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserEntityService {
    private final UserDao userDao;

}
