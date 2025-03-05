package codegym.c10.com.repository;


import codegym.c10.com.model.Computer;
import org.springframework.data.repository.CrudRepository;

public interface IComputerRepository extends CrudRepository<Computer, Long> {
}
