package mucolleti.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute")
// http://locashost:8080/firstRoute/ ------
public class firstController {

    /**
     * Metodos de acesso do HTTP:
     * Get - Buscar uma Informação
     * POST- Adicionar uma Informação
     * PUT- Alterar um dado/info
     * DELETE- Remover um dado
     * PATCH- Alterar somente uma parte da indo/dado
     */

     @GetMapping("/")
    public String FirstMessage(){
        return "Funciono";
    }
    
}
