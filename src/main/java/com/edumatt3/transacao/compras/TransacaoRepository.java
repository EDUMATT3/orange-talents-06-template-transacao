package com.edumatt3.transacao.compras;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, String> {
    List<Transacao> findTop10ByIdCartaoOrderByEfetivadaEmDesc(String id);
}
