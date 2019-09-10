package com.halo.blog.controller;

import com.halo.blog.dto.PaginationDTO;
import com.halo.blog.dto.T;
import com.halo.blog.mapper.UserMapper;
import com.halo.blog.model.Question;
import com.halo.blog.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;


    /**
     * @param request
     * @return 遍历cookie值，找到token
     */
    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "10") Integer size,
                        @RequestParam(name = "search", required = false) String search) {


        PaginationDTO pagination = questionService.list(search, page, size);
        List<Question> hotQuestionList = questionService.selectHot();
        model.addAttribute("hotQuestions", hotQuestionList);


        model.addAttribute("pagination", pagination);
        model.addAttribute("search", search);

        return "index";

    }
}
