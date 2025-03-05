package codegym.c10.com.controller;

import codegym.c10.com.service.IComputerService;
import codegym.c10.com.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/types")
public class TypeController {
    @Autowired
    private IComputerService computerService;

    @Autowired
    private ITypeService typeService;

}
