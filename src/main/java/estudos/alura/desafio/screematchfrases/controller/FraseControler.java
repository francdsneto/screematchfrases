package estudos.alura.desafio.screematchfrases.controller;

import estudos.alura.desafio.screematchfrases.dto.FraseDTO;
import estudos.alura.desafio.screematchfrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("series/frases")
public class FraseControler {

    @Autowired
    private FraseService fraseService;

    @GetMapping("")
    public FraseDTO obterFraseAleatoria() {
        return fraseService.obterFraseAleatoria();
    }

}
