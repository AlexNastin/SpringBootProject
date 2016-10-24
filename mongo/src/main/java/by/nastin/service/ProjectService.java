package by.nastin.service;

import by.nastin.bean.Project;
import by.nastin.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getProject(){
        return projectRepository.findAll();
    }
}
