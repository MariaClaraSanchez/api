package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class ValidadorMedicoComOutraConsultaNoMesmoHorario {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoPossuiOutroConsultaMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if(medicoPossuiOutroConsultaMesmoHorario){
            throw new ValidacaoException("Médico já possui consulta agendada nesse mesmo horário!");
        }
    }
}
