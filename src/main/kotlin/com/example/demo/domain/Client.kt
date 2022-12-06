package com.example.demo.domain

import javax.persistence.*

@Entity
@Table(name = "Client")
class Client(

    @Column(name = "Gender", unique = true, nullable = false)
    var gender: String,

    @Column(name = "Title", nullable = false)
    var title: String,

    @Column(name = "GivenName", nullable = false)
    var name: String,

    @Column(name = "Surname", nullable = false)
    var surname: String,

    @Column(name = "EmailAddress", nullable = false)
    var email: String,

    @Column(name = "Birthday", nullable = false)
    var birthday: String,

    @Column(name = "TelephoneNumber", nullable = false)
    var telephoneNumber: String,

    @Column(name = "CCType", nullable = false)
    var ccType: String,

    @Column(name = "CCNumber", nullable = false)
    var ccNumber: String,

    @Column(name = "CVV2", nullable = false)
    var cvv2: String,

    @Column(name = "StreetAddress", nullable = false)
    var streetAddress: String,

    @Column(name = "City", nullable = false)
    var city: String,

    @Column(name = "State", nullable = false)
    var state: String,

    @Column(name = "ZipCode", nullable = false)
    var zipCode: String,

    @Column(name = "FeetInches", nullable = false)
    var feetInches: String,

    @Column(name = "Centimeters", nullable = false)
    var centimeters: String,

    @Column(name = "Country", nullable = false)
    var country: String,

    @Column(name = "Pounds", nullable = false)
    var pounds: String,

    @Column(name = "Kilograms", nullable = false)
    var kilograms: String,

    @Column(name = "Vehicle", nullable = false)
    var vehicle: String,

    @Column(name = "Latitude", nullable = false)
    var latitude: String,

    @Column(name = "Longitude", nullable = false)
    var longitude: String,

    @Id @GeneratedValue var id: Long? = null)