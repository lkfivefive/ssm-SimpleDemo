package com.bupt.controller;

import com.bupt.entity.Student;
import com.bupt.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService service;

    //注册学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败！";
        //调用service处理student
        int nums = service.addStudent(student);
        if (nums > 0) {
            tips = "学生["+student.getName()+"]注册成功！";
        }
        //添加数据和视图
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }

    //显示学生信息，响应ajax
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent() {
        List<Student> students = service.findStudents();
        return students;
    }
}
