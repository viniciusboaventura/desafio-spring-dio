package dio.desafio_spring_dio.service.strategy;

import org.springframework.stereotype.Service;

@Service
public class PixStrategy implements PagamentoStrategy {

    @Override
    public String pagar(Double valor) {
        return "Pagamento de " + valor + " realizado com PIX";
    }

}
