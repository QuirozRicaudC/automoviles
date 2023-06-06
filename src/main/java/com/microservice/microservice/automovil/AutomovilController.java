package com.microservice.microservice.automovil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class AutomovilController {
   @Autowired
   private AutomovilService service;

   @GetMapping("/automoviles/lista")
   public @ResponseBody List<Automovil> showAutomovilList() {
      return service.listAll();
   }
   @PostMapping("/automoviles/nuevo")
   public @ResponseBody String newAutomovil(Automovil automovil) {
      service.save(automovil);
      return "done";
   }
   @GetMapping("/automoviles/{id}")
   public @ResponseBody Optional<Automovil> showAutomovil(@PathVariable("id") Integer id) {
      return service.get(id);
   }
   @GetMapping("/automoviles/eliminar/{id}")
   public @ResponseBody String deleteAutomovil(@PathVariable("id") Integer id) {
      service.delete(id);
      return "done";
   }

}