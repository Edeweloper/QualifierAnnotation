package com.example.qualifier;

import org.springframework.stereotype.Component;
@Component("PDF") // bu şekilde kullanısak Qualifier da direk PDF yazabiliriz.
public class PdfFileReader implements  Reader{
    @Override
    public String readFiler() {
        return "Read Pdf file";
    }
}
