object Films {
  // Complete the following methods.
  // The exercises value gradually more complex as you go on.
  // The idea is to practice chaining methods together.
  // You DO NOT need to reference previous answers in later ones.

  def nameOfFilm(film: Film): String =
    film.name

  def filmsByDirector(director: Director): List[Film] =
    director.films

  def namesOfFilms(films: List[Film]): List[String] =
    films.map(f => f.name)

  def namesOfFilmsByDirector(director: Director): List[String] =
    director.films.map(f => f.name)

  def directorsWithBackCatalogOfSize(directors: List[Director], numberOfFilms: Int): List[Director] =
    directors.filter(_.films.length >= numberOfFilms)

  def directorsBornBefore(directors: List[Director], year: Int): List[Director] =
    directors.filter(_.yearOfBirth < year)

  def directorsBornBeforeWithBackCatalogOfSize(directors: List[Director], year: Int, numberOfFilms: Int): List[Director] =
    directors
      .filter(_.yearOfBirth < year)
      .filter(_.films.length >= numberOfFilms)

  def filmsByAllDirectors(directors: List[Director]): List[Film] =
    directors.flatMap(d => d.films)

  def namesOfFilmsByAllDirectors(directors: List[Director]): List[String] =
    directors.flatMap(d => d.films.map(f => f.name))

  // Return a list of messages of the form "Tonight only! <FILM> by <DIRECTOR>!"
  def tonightOnlyMessages(directors: List[Director]): List[String] =
    directors.flatMap(d => d.films.map(f => s"Tonight only! ${f.name} by ${d.name}!"))

  def namesOfFilmsByDirectorScoringAtLeast(director: Director, imdbRating: Double): List[String] =
    director.films
      .filter(f => f.imdbRating >= imdbRating)
      .map(f => f.name)

  def namesOfAllFilmsScoringAtLeast(directors: List[Director], imdbRating: Double): List[String] =
    directors
      .flatMap(d => d.films)
      .filter(f => f.imdbRating >= imdbRating)
      .map(f => f.name)

  def filmsSortedByImdb(films: List[Film]): List[Film] =
    films.sortBy(f => f.imdbRating)

  def filmsByDirectorSortedByImdb(director: Director): List[Film] =
    director.films.sortBy(f => f.imdbRating)

  def filmsByAllDirectorsSortedByImdb(directors: List[Director]): List[Film] =
    directors.flatMap(d => d.films).sortBy(f => f.imdbRating)

  def filmsByAllDirectorsSortedByDirectorNameThenImdb(directors: List[Director]): List[Film] =
    directors
      .map(d => d.copy(films = d.films.sortBy(f => f.imdbRating)))
      .sortBy(f => f.name)
      .flatMap(d => d.films)

  def averageImdbRating(films: List[Film]): Double =
    films.foldLeft(0.0)(_ + _.imdbRating) / films.length

  def averageImdbRatingAcrossDirectors(directors: List[Director]): Double = {
    val films = directors.flatMap(d => d.films)
    films.foldLeft(0.0)(_ + _.imdbRating) / films.length
  }

  def main(args: Array[String]): Unit = {
    import FilmData._

    println()

    println(nameOfFilm(memento))
    println(filmsByDirector(nolan))

    println(namesOfFilms(List(memento, darkKnight)))
    println(namesOfFilmsByDirector(eastwood))

    println(directorsWithBackCatalogOfSize(directors, 4))
    println(directorsBornBefore(directors, 1951))
    println(directorsBornBeforeWithBackCatalogOfSize(directors, 1931, 6))

    println(namesOfFilmsByDirectorScoringAtLeast(nolan, 8.8))
    println(namesOfAllFilmsScoringAtLeast(List(nolan, mcTiernan), 8.8))

    println(filmsSortedByImdb(mcTiernan.films))
    println(filmsByDirectorSortedByImdb(mcTiernan))
    println(filmsByAllDirectorsSortedByImdb(List(nolan, mcTiernan)))
    println(filmsByAllDirectorsSortedByDirectorNameThenImdb(List(nolan, mcTiernan)))

    println(averageImdbRating(nolan.films))
    println(averageImdbRatingAcrossDirectors(directors))

    println()
  }
}
