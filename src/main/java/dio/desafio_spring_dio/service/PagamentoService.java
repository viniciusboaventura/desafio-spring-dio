package dio.desafio_spring_dio.service;

import dio.desafio_spring_dio.service.strategy.CartaoStrategy;
import dio.desafio_spring_dio.service.strategy.PagamentoStrategy;
import dio.desafio_spring_dio.service.strategy.PixStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private CartaoStrategy cartaoStrategy;

    @Autowired
    private PixStrategy pixStrategy;

    public String processarPagamento(String tipo, Double valor) {

        PagamentoStrategy strategy;

        if ("cartao".equalsIgnoreCase(tipo)) {
            strategy = cartaoStrategy;
        } else if ("pix".equalsIgnoreCase(tipo)) {
            strategy = pixStrategy;
        } else {
            throw new RuntimeException("Tipo de pagamento inválido");
        }

        return strategy.pagar(valor);
    }

}