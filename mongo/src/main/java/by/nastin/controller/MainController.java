package by.nastin.controller;

import by.nastin.bean.Project;
import by.nastin.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping(path = "/getProjects", method = RequestMethod.GET)
    public List<Project> getEmployees() {
        return projectRepository.findAll();

    }
}