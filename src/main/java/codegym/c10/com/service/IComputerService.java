package codegym.c10.com.service;

import codegym.c10.com.model.Computer;
import codegym.c10.com.model.Type;

public interface IComputerService extends IGenerateService<Computer> {
    Iterable<Computer> findAllByType(Type type);
}
