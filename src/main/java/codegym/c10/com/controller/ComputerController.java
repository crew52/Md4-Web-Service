package codegym.c10.com.controller;

import codegym.c10.com.model.Computer;
import codegym.c10.com.service.IComputerService;
import codegym.c10.com.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping ("/api/computers")
public class ComputerController {
    @Autowired
    private IComputerService computerService;

    @Autowired
    private ITypeService typeService;

    @GetMapping
    public ResponseEntity<Iterable<Computer>> findAllComputer() {
        List<Computer> computers = (List<Computer>) computerService.findAll();
        if (computers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(computers, HttpStatus.OK);
    }
}
