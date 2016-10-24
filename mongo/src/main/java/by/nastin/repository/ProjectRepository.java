package by.nastin.repository;


import by.nastin.bean.Project;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProjectRepository extends MongoRepository<Project, String> {
}
