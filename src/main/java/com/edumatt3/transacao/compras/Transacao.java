package com.edumatt3.transacao.compras;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    private String id;

    private BigDecimal valor;

    private LocalDateTime efetivadaEm;

    private String estabelecimento;

    private String idCartao;

    @Deprecated
    public Transacao(){

    }

    public Transacao(String id,
                     BigDecimal valor,
                     LocalDateTime efetivadaEm,
                     String estabelecimento,
                     String idCartao) {
        this.id = id;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.estabelecimento = estabelecimento;
        this.idCartao = idCartao;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public String getIdCartao() {
        return idCartao;
    }
}
