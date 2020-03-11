package be.intecbrussel.applicationmanager.App;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@ComponentScan
public class AppController {

    @Autowired
    private ApplicationService service;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Application> listApplications = service.listAll();
        model.addAttribute("listApplications", listApplications);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewApplicationPage(Model model){
        Application application = new Application();
        model.addAttribute("newApplication",application);

        return "new_application";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveApplication(@ModelAttribute("application") Application application){
        service.save(application);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_application");
        Application application = service.get(id);
        mav.addObject("editApplication", application);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteApplication(@PathVariable(name = "id") int id){
        service.delete(id);

        return "redirect:/";
    }




}
