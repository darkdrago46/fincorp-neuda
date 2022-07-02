package com.example.udemynew;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
//changed "name to username
@SessionAttributes("username")
public class ClientController {
    @Autowired
    ClientService service;
//modified this
    @RequestMapping(value = "/list-clients", method = RequestMethod.GET)
    public String showClients(ModelMap model) {
        //String name = getLoggedInUserName(model);
        model.put("clients", service.retrieveClients());
        return "list-clients";
    }

    private String getLoggedInUserName(ModelMap model) {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @RequestMapping(value = "/add-client", method = RequestMethod.GET)
    public String showAddClientPage(ModelMap model) {
        model.addAttribute("client", new Client(0, "Default Name", "Default gender", 20, 99, false));
        return "client";
    }
//removed validation
    @RequestMapping(value = "/add-client", method = RequestMethod.POST)
    public String addClients(ModelMap model, Client client) {
        service.addClient(client.getName(), client.getGender(), client.getAge(), client.getCreditScore(), client.isLoansDefaulted());
        return "redirect:/list-clients";
    }

    @RequestMapping(value = "/delete-client", method = RequestMethod.GET)
    public String deleteClient(@RequestParam int id) {
        service.deleteClient(id);
        return "redirect:/list-clients";
    }

    @RequestMapping(value = "/update-client", method = RequestMethod.GET)
    public String showUpdateClientPage(@RequestParam int id, ModelMap model) {
        Client client = service.retrieveClient(id);
        model.put("client", client);
        return "client";
    }
//removed validation
    @RequestMapping(value = "/update-client", method = RequestMethod.POST)
    public String updateClient(ModelMap model, Client client) {
        //need to remove? client.setUser(getLoggedInUserName(model));
        service.updateClient(client);
        return "redirect:/list-clients";
    }
}
