package com.example.project2.webapp.service;

import com.example.project2.common.db.entity.Demo;
import com.example.project2.common.repository.DemoRepository;
import com.example.project2.common.util.DateTimeUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {
    @Autowired
    DemoRepository demoRepository;

//    @Autowired
//    DateTimeUtils dateTimeUtils;

    public String create() {
        final var entity = demoRepository.save(toCreateDemo());
//        return entity.getId();
        return "/";
    }

    private Demo toCreateDemo() {
        final var localDatetime = DateTimeUtils.getJst();
        final var demo = new Demo();
        demo.setName("a");
        demo.setCreatedAt(localDatetime);
        return demo;
    }


}