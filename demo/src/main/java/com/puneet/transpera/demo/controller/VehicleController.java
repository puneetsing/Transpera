package com.puneet.transpera.demo.controller;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.puneet.transpera.demo.entity.User;
import com.puneet.transpera.demo.entity.Vehicle;
import com.puneet.transpera.demo.services.VehicleService;

import jakarta.servlet.http.HttpSession;

@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/addVehicles")
    public String vehiclePage() {
        return "addVehicles";
    }

    @PostMapping("/addVehicles")
    public String addVehicle(
            @ModelAttribute Vehicle vehicle,
            HttpSession session) {

        User loggedInUser
                = (User) session.getAttribute("loggedInUser");
        if (loggedInUser == null) {
            return "redirect:/login";
        }
        vehicle.setUser(loggedInUser);
        vehicleService.saveVehicle(vehicle);

        return "redirect:/viewVehicles";
    }

    @GetMapping("/viewVehicles")
    public String viewVehicles(HttpSession session, Model model) {

        User user = (User) session.getAttribute("loggedInUser");

        if (user == null) {
            return "redirect:/login";
        }

        model.addAttribute(
                "vehicles",
                vehicleService.getVehiclesByUserId(user)
        );

        return "viewVehicles";
    }

    @GetMapping("/editVehicle/{id}")
    public String editVehicle(
            @PathVariable Long id,
            Model model) {

        Vehicle vehicle
                = vehicleService.getVehicleById(id);

        model.addAttribute("vehicle", vehicle);
        return "editVehicle";
    }

    @PostMapping("/updateVehicle")
    public String updateVehicle(
            @ModelAttribute Vehicle vehicle) {

        vehicleService.updateVehicle(vehicle);

        return "redirect:/viewVehicles";
    }
    @GetMapping("/deleteVehicle/{id}")
    public String deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
        return "redirect:/viewVehicles";
    }
}
