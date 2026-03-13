package dio.desafio_spring_dio.facade;

import dio.desafio_spring_dio.model.PagamentoRequest;
import dio.desafio_spring_dio.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PagamentoFacade {

    @Autowired
    private PagamentoService pagamentoService;

    public String realizarPagamento(PagamentoRequest request) {
        return pagamentoService.processarPagamento(
                request.getTipo(),
                request.getValor()
        );
    }

}