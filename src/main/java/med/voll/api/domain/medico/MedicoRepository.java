package med.voll.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);

    @Query("""
            select m from Medico m
            where
            m.ativo = 1
            and
            m.especialidade = :especialidade
            and
            m.id not in(
                select c.medico from Consulta c
                where
                c.data = :data
            )
            order by rand()
            limit 1
            """)
    // Os : é para dizer que vai receber o parametro do método.
    Medico escolherMedicoAleatorioLivreData(Especialidade especialidade, LocalDateTime data);


    @Query("SELECT m.ativo FROM Medico m WHERE m.id = :idMedico")
    Boolean findAtivoById(Long idMedico);
}