package estudos.alura.desafio.screematchfrases.service;

import estudos.alura.desafio.screematchfrases.dto.FraseDTO;
import estudos.alura.desafio.screematchfrases.model.Frase;
import estudos.alura.desafio.screematchfrases.repository.iFraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FraseService {

    @Autowired
    private iFraseRepository fraseRepository;

    public FraseDTO obterFraseAleatoria() {
        Optional<Frase> frase = this.fraseRepository.obterFraseAleatoria();
        if(frase.isPresent())
        {
            Frase f = frase.get();

            return new FraseDTO(f.getTitulo(),f.getFrase(),f.getPersonagem(),f.getPoster());
        }
        return null;
    }

}
