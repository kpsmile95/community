package cn.wm.community.controller;

import cn.wm.community.dto.QuestionDTO;
import cn.wm.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(Model model,
                           @PathVariable(name = "id")Long id){
        QuestionDTO question = questionService.getById(id);
        model.addAttribute("question", question);
        return "question";
    }
}
