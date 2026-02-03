package med.tera.api.controller;

import med.tera.api.medico.MedicoInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping("/cadastrar")
    public void cadastrarMedico(@RequestBody MedicoInfo medicoInfo) {
        System.out.println("Medico cadastrado: " + medicoInfo);

    }
}
