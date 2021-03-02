package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.Student.IStudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
    // tiêm tự động
    @Autowired
    IStudentService studentService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showFormList(ModelMap modelMap){
        modelMap.addAttribute("list",studentService.findAll());
        return "showList";
    }
    @GetMapping("create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }
    @PostMapping("create")
    public ModelAndView create(@RequestParam int id, String name, int age, String address){
        ModelAndView modelAndView = new ModelAndView("redirect:/students");
        studentService.save(new Student(id,age,name,address ));
        return modelAndView;
    }
    @GetMapping("edit")
    public ModelAndView showFormEdit(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("o",studentService.findById(id));
        return modelAndView;
    }
    @PostMapping("edit")
    public ModelAndView edit(@RequestParam int id, String name, int age, String address){
        ModelAndView modelAndView = new ModelAndView("redirect:/students");
        studentService.edit(id,new Student(id,age,name,address ));
        return modelAndView;
    }
    @GetMapping("delete")
    public ModelAndView showFormDelete(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("o",studentService.findById(id));
        return modelAndView;
    }
    @PostMapping("delete")
    public ModelAndView delete(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/students");
        studentService.delete(id);
        return modelAndView;
    }
    @GetMapping("search")
    public ModelAndView showDetail(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("o",studentService.findById(id));
        return modelAndView;
    }
//    @PostMapping("search")
//    public ModelAndView search(@RequestParam int id){
//        ModelAndView modelAndView = new ModelAndView("detail");
//        modelAndView.addObject("o",studentService.findById(id));
//        studentService.findById(id);
//        return modelAndView;
//    }
}
