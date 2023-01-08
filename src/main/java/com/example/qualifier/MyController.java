package com.example.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
    @Autowired
    @Qualifier("excelFileReader")
    // or @Qualifier("PDF") or //@Qualifier("getWordFileReader") or @Qualifier("Word")
    private Reader reader;
    @GetMapping(path = "/reader")
    public String Read(){
        return  this.reader.readFiler();
    }
}
