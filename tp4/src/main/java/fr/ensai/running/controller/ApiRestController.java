package fr.ensai.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.service.AthleteService;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    private AthleteService athleteService;

    /**
     * Get all athletes
     */
    @GetMapping("/athlete")
    public List<Athlete> allAthletes() {

        return athleteService.findAll();
    }

    /**
     * Get an athlete by id
     */
    @GetMapping("/athleteId/{id}")
    public Athlete getAthleteId(@PathVariable(value = "id") long id) {
        return athleteService.findById(id);
    }

    /**
     * Delete an athlete by id
     */
    @GetMapping("/athleteDeleteID/{id}")
    public void deleteAthleteId(@PathVariable(value = "id") long id) {
        athleteService.deleteById(id);
    }

    /**
     * Create an athlete
     */
    @PostMapping("/athleteCreation")
    public Athlete createAthlete(@ModelAttribute("athlete") Athlete athlete) {
        return athleteService.save(athlete);
    }

}
