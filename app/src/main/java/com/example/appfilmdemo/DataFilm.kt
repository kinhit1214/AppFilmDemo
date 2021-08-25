package com.example.appfilmdemo

data class DataFilm(val id_kinopoisk: String,
                    val  type:  String,
                    val title: String,
                    val poster: String,
                    val actors: String,
                    val director :String,
                    val countries: String,
                    val year: String,
                    val description: String,
                    val rating_kinopoisk:  String,
                    val genres: ArrayList<String>,
                    val rating_imdb:  String = "0",
                    val seasons:  String = "1")