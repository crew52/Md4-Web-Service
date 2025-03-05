package codegym.c10.com.service.impl;

import codegym.c10.com.model.Computer;
import codegym.c10.com.repository.IComputerRepository;
import codegym.c10.com.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComputerService implements IComputerService {
    @Autowired
    private IComputerRepository computerRepository;

    @Override
    public Iterable<Computer> findAll() {
        return computerRepository.findAll();
    }

    @Override
    public Computer save(Computer computer) {
        computerRepository.save(computer);
        return computer;
    }

    @Override
    public Optional<Computer> findById(Long id) {
        return computerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        computerRepository.deleteById(id);
    }
}
