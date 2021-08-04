package com.edumatt3.transacao.consumer.messages;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacao {

    private String id;

    private BigDecimal valor;

    private LocalDateTime efetivadaEm;

    private Estabelecimento estabelecimento;

    private Cartao cartao;

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public Estabelecimento getEstabelicimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    @Override
    public String toString() {
        return "EventoDeTransacao{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", efetivadaEm=" + efetivadaEm +
                ", estabelicimento=" + estabelecimento +
                ", cartao=" + cartao +
                '}';
    }
}

