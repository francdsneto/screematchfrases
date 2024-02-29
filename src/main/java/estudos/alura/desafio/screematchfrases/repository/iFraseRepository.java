package estudos.alura.desafio.screematchfrases.repository;

import estudos.alura.desafio.screematchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface iFraseRepository extends JpaRepository<Frase,Long> {

    @Query("SELECT f FROM Frase f ORDER BY function('random') LIMIT 1 ")
    Optional<Frase> obterFraseAleatoria();

}
