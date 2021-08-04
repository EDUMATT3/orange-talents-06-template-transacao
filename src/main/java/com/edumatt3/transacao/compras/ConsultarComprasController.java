package com.edumatt3.transacao.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class ConsultarComprasController {

    private TransacaoRepository transacaoRepository;

    @Autowired
    public ConsultarComprasController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping("cartoes/{id}/transacoes")
    public ResponseEntity<?> consultar(@PathVariable String id){

        List<Transacao> transacaoList = transacaoRepository.findTop10ByIdCartaoOrderByEfetivadaEmDesc(id);

        if(transacaoList.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        List<TransacaoResponse> response = transacaoList.stream().map(TransacaoResponse::new).collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }

}
