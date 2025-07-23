package com.gediondev.taskapi.domain

import jakarta.persistence.*

@Entity
data class Task(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val title: String,
    val description: String,
    val status: String
)
