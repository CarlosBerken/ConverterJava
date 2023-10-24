package com.example.projectconverter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {

    @GetMapping("/converter")
    public String converterForm() {
        return "converter";
    }

    @PostMapping("/converter")
    public String converterSubmit(@RequestParam double value, @RequestParam String fromUnit,
                                  @RequestParam String toUnit, Model model) {
        double convertedValue = MeasurementConverter.convert(value, fromUnit, toUnit);
        model.addAttribute("result", convertedValue);
        return "converter";
    }
}
