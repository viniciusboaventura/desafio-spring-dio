package dio.desafio_spring_dio.controller;

import dio.desafio_spring_dio.facade.PagamentoFacade;
import dio.desafio_spring_dio.model.PagamentoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoFacade pagamentoFacade;

    @PostMapping
    public String pagar(@RequestBody PagamentoRequest request) {
        return pagamentoFacade.realizarPagamento(request);
    }

}
