package com.example.demo.controller
import com.example.demo.domain.Client
import com.example.demo.repository.ClientRepository
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVRecord
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.io.FileReader
import java.io.Reader

@Controller
class ClientController @Autowired constructor (private val clientRepository: ClientRepository) {

    @GetMapping("/verif")
    @ResponseBody
    fun verif(): String {

        val `in`: Reader = FileReader("csvRepository//french_short.csv//")
        val records: Iterable<CSVRecord> = CSVFormat.EXCEL.withHeader().parse(`in`)

        for (record in records) {
            val gender = record["Gender"]
            val title = record["Title"]
            val name = record["GivenName"]
            val surname = record["Surname"]
            val email = record["EmailAddress"]
            val birthday = record["Birthday"]
            val telephoneNumber = record["TelephoneNumber"]
            val ccType = record["CCType"]
            val cCNumber = record["CCNumber"]
            val cVV2 = record["CVV2"]
            val cCExpires = record["CCExpires"]
            val streetAddress = record["StreetAddress"]
            val city = record["City"]
            val state = record["State"]
            val zipCode = record["ZipCode"]
            val feetInches = record["FeetInches"]
            val centimeters = record["Centimeters"]
            val country = record["Country"]
            val pounds = record["Pounds"]
            val kilograms = record["Kilograms"]
            val latitude = record["Latitude"]
            val longitude = record["Longitude"]

            clientRepository.save(
                Client(
                    gender, title, name, surname, email,
                    birthday, telephoneNumber, ccType, cCNumber, cVV2, cCExpires, streetAddress,
                    city, state, zipCode, feetInches, centimeters, country, pounds, kilograms, latitude, longitude
                )
            )

        }
        return "$"
    }
}