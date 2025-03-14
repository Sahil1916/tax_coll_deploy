package com.example.registrationform.controller;

import com.example.registrationform.model.User;
import com.example.registrationform.model.user1;
import com.example.registrationform.repository.UserRepository;
import com.example.registrationform.repository.User1Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CombinedController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private User1Repository user1Repository;

    @GetMapping("/")
    @ResponseBody  // This tells Spring Boot to return raw text instead of a template
    public String showLoginPage() {
        return "Welcome to deploy";
    }


    // ✅ Load Registration Form
    @GetMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new User());
        return "register"; 
    }

    // ✅ Process Family Head Registration
    @PostMapping("/register")
    public String registerFamilyHead(User user, Model model) {
        // Check for duplicate Home Number
        if (userRepository.findByHomeNumber(user.getHomeNumber()) != null) {
            model.addAttribute("errorMessage", "Home number already exists!");
            return "register"; // Return to the registration page with an error message
        }
        // Check for duplicate Aadhar Number
        if (userRepository.findByAadharNumber(user.getAadharNumber()) != null) {
            model.addAttribute("errorMessage", "Aadhar number already exists!");
            return "register"; // Return to the registration page with an error message
        }
        // Check for duplicate PAN Number
        if (userRepository.findByPanNumber(user.getPanNumber()) != null) {
            model.addAttribute("errorMessage", "PAN number already exists!");
            return "register"; // Return to the registration page with an error message
        }

        userRepository.save(user);
        model.addAttribute("homeNumber", user.getHomeNumber());
        model.addAttribute("member", new user1());
        return "member"; 
    }

    // ✅ Process Family Member Registration
    @PostMapping("/register/member")
    public String registerFamilyMember(user1 member, Model model) {
        user1Repository.save(member);
        model.addAttribute("homeNumber", member.getHomeNumber());
        model.addAttribute("member", new user1());
        return "member"; 
    }

    // ✅ Handles the EXIT button redirection
    @GetMapping("/register/exit")
    public String exitToRegister() {
        return "redirect:/register"; // Redirects to the registration form
    }
}