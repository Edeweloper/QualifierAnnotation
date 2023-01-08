package com.example.qualifier;

import org.springframework.stereotype.Component;

@Component
public class ExcelFileReader  implements Reader{
    @Override
    public String readFiler() {
        return "Read Excel file";
    }
}
