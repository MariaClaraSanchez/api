package med.voll.api.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarerror404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarerror400(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors();


        return ResponseEntity.badRequest().body(erros.stream().map(DadosErroValidcao::new).toList());
    }

    private record DadosErroValidcao(String nome, String mensagem){
        public DadosErroValidcao(FieldError erro){
            this(erro.getField(), erro.getDefaultMessage());
        }
    }

}
