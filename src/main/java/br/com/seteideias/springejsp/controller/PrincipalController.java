package br.com.seteideias.springejsp.controller;

import br.com.seteideias.springejsp.entity.Tabela;
import br.com.seteideias.springejsp.repository.ICepRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PrincipalController {

    @Autowired
    private ICepRepository repository;

    @GetMapping({"/", "/primeira/{nomeViaParam}"})
    public String showLoginPage(@PathVariable(required = false)String nomeViaParam,
            @RequestParam(name = "param", defaultValue = "valor default",required = false)
                                    String veioParam, Model model) {
            model.addAttribute("name", nomeViaParam);
        List<Tabela> all = repository.findAll();
        long count = all.size();
        model.addAttribute("quantidadeDeRegistros", count);
        System.out.println("alteracao na master");
        return "index";
    }

    @PostMapping("/post")
    public ResponseEntity<Tabela> incluindoUmCep(@RequestBody Tabela tabelaTeste){
        Tabela save = repository.save(tabelaTeste);
        return ResponseEntity.ok(save);
    }
}
