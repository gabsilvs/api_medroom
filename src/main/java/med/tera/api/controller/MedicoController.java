package med.tera.api.controller;

import med.tera.api.medico.MedicoInfo;
import med.tera.api.medico.MedicoRepository;
import med.tera.api.medico.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping("/cadastrar")
    public void cadastrarMedico(@RequestBody MedicoInfo dados) {
        medicoRepository.save(new Medico(dados));

    }
}
