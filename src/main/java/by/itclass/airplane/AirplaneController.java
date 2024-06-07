package by.itclass.airplane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AirplaneController {
    private AirplaneRepository repository;

    @Autowired
    public void setRepository(AirplaneRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getAllAirplanes(Model model) {
        var airplanes = repository.findAll();
        model.addAttribute("airplanes", airplanes);
        return "index";
    }

    @GetMapping("/view")
    public String viewPlane(@RequestParam(name = "plane") int airplaneId, Model model) {
        var airplane = repository.findById(airplaneId).get();
        model.addAttribute("airplane", airplane);
        return "airplane";
    }
}
