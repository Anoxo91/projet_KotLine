package com.example.demo.repository

import com.example.demo.domain.Client
import org.springframework.data.repository.CrudRepository

interface ClientRepository : CrudRepository<Client, Long> {


}
