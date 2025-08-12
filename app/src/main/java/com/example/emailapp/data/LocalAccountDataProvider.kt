package com.example.emailapp.data

import com.example.emailapp.R

object LocalAccountDataProvider {

    private val allUserContactAccounts = listOf(
        Account(
            id = 4L,
            firstName = "Lucas",
            lastName = "Silva",
            email = "lucas.silva@gmail.com",
            avatar = R.drawable.avatar1
        ),
        Account(
            id = 5L,
            firstName = "Mariana",
            lastName = "Oliveira",
            email = "mariana.oliveira@gmail.com",
            avatar = R.drawable.avatar2
        ),
        Account(
            id = 6L,
            firstName = "Carlos",
            lastName = "Souza",
            email = "carlos.souza@gmail.com",
            avatar =
                R.drawable.avatar3
        ),
        Account(
            id = 7L,
            firstName = "Fernanda",
            lastName = "Costa",
            email = "fernanda.costa@gmail.com",
            avatar = R.drawable.avatar4
        ),
        Account(
            id = 8L,
            firstName = "João",
            lastName = "Pereira",
            email = "joao.pereira@gmail.com",
            avatar = R.drawable.avatar5
        ),
        Account(
            id = 9L,
            firstName = "Ana",
            lastName = "Martins",
            email = "ana.martins@gmail.com",
            avatar = R.drawable.avatar6
        ),
        Account(
            id = 10L,
            firstName = "Rafael",
            lastName = "Almeida",
            email = "rafael.almeida@gmail.com",
            avatar = R.drawable.avatar7
        )
    )

    fun getContactAccountById(accountId: Long) : Account{
        return allUserContactAccounts.first {it.id == accountId}
    }
}