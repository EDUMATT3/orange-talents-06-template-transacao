package com.edumatt3.transacao.consumer;

import com.edumatt3.transacao.compras.TransacaoRepository;
import com.edumatt3.transacao.consumer.messages.EventoDeTransacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    private final Logger logger = LoggerFactory.getLogger(ListenerDeTransacao.class);

    private TransacaoRepository transacaoRepository;

    @Autowired
    public ListenerDeTransacao(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacao mensagem) {
        logger.info("Nova transação com id: {} para o cartão: {}", mensagem.getId(), mensagem.getCartaoId());
        transacaoRepository.save(mensagem.toModel());
    }

}
