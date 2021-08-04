package com.edumatt3.transacao.consumer.messages;

import com.edumatt3.transacao.compras.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacao {

    private String id;

    private BigDecimal valor;

    private LocalDateTime efetivadaEm;

    private EstabelecimentoMessage estabelecimento;

    private CartaoMessage cartao;

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EstabelecimentoMessage getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoMessage getCartao() {
        return cartao;
    }

    public String getCartaoId() {
        return this.cartao.getId();
    }


    public Transacao toModel() {
        return new Transacao(id, valor, efetivadaEm, estabelecimento.getNome(), cartao.getId());
    }
}

