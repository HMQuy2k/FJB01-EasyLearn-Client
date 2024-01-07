package com.easy.learn.web.controller;


import com.easy.learn.web.callApi.LessonCallService;
import com.easy.learn.web.consts.UrlPath;
import com.easy.learn.web.dto.lesson.Lesson;
import com.easy.learn.web.dto.trainer.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class LessonController {
    @Autowired
    LessonCallService service;

    @GetMapping(UrlPath.GET_LESSON_BY_COURSEID + "/{id}")
    public String showLessonPage(@PathVariable("id") Long id, Model model, RedirectAttributes ra) {
        try {
            List<Lesson> lessonList = service.getAllLessonOfCourseID(id);
            model.addAttribute("lessonList", lessonList);
            model.addAttribute("#", "Edit Trainer (ID: "+ id +")");
            return "lesson";
        } catch (Exception e) {
            ra.addFlashAttribute("message", "Course lessons not found");
            return "redirect:/course";
        }
    }
}
