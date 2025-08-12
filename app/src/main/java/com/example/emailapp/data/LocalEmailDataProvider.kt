package com.example.emailapp.data

object LocalEmailDataProvider {

    val allEmails = listOf(
        Email(
            id = 1L,
            sender = LocalAccountDataProvider.getContactAccountById(4L),
            subject = "Atualização do Projeto",
            body = "Olá, gostaria de informar que o projeto está progredindo conforme o cronograma. Vamos discutir mais detalhes na próxima reunião.",
            createAt = "2025-08-10 09:15"
        ),
        Email(
            id = 2L,
            sender = LocalAccountDataProvider.getContactAccountById(5L),
            subject = "Reunião de Alinhamento",
            body = "Bom dia, podemos agendar uma reunião de alinhamento para definir as próximas etapas do projeto?",
            createAt = "2025-08-09 14:30"
        ),
        Email(
            id = 3L,
            sender = LocalAccountDataProvider.getContactAccountById(6L),
            subject = "Envio de Documentação",
            body = "Segue anexo a documentação técnica solicitada. Qualquer dúvida estou à disposição.",
            createAt = "2025-08-08 17:45"
        ),
        Email(
            id = 4L,
            sender = LocalAccountDataProvider.getContactAccountById(7L),
            subject = "Convite para Evento",
            body = "Você está convidado para o evento anual da empresa. Será uma ótima oportunidade para networking.",
            createAt = "2025-08-07 11:00"
        ),
        Email(
            id = 5L,
            sender = LocalAccountDataProvider.getContactAccountById(8L),
            subject = "Solicitação de Feedback",
            body = "Gostaria de receber seu feedback sobre a última entrega do time. Pode me enviar até sexta-feira?",
            createAt = "2025-08-06 08:20"
        ),
        Email(
            id = 6L,
            sender = LocalAccountDataProvider.getContactAccountById(9L),
            subject = "Atualização do Sistema",
            body = "O sistema será atualizado amanhã às 22h. Durante esse período, ele ficará indisponível por aproximadamente 30 minutos.",
            createAt = "2025-08-05 16:50"
        ),
        Email(
            id = 7L,
            sender = LocalAccountDataProvider.getContactAccountById(10L),
            subject = "Parabéns pela Conquista!",
            body = "Gostaria de parabenizá-lo pelo excelente trabalho e pelo reconhecimento obtido no último trimestre.",
            createAt = "2025-08-04 10:05"
        )
    )

    fun get(id : Long) = allEmails.first { it.id == id }

}