object ExtraFilmsStuff {
  // METHODS INVOLVING FLATMAP

  def filmsByDirector(director: Director): List[Film] = {
    ???
  }

  def namesOfFilmsByDirector(director: Director): List[String] = {
    ???
  }

  def filmsByAllDirectors(directors: List[Director]): List[Film] = {
    ???
  }

  def namesOfFilmsByAllDirectors(directors: List[Director]): List[String] = {
    ???
  }

  // Return a list of messages of the form "Tonight only! <FILM> by <DIRECTOR>!"
  def tonightOnlyMessages(directors: List[Director]): List[String] = {
    ???
  }

  // METHODS INVOLVING OPTION

  def directorWithLastName(directors: List[Director], lastName: String): Option[Director] = {
    ???
  }

  def yearOfBirthOfDirectorWithLastName(directors: List[Director], lastName: String): Option[Int] = {
    ???
  }

  def filmsByDirectorWithLastName(directors: List[Director], lastName: String): List[Film] = {
    ???
  }

  def earliestFilmByDirectorWithLastName(directors: List[Director], lastName: String): Option[Film] = {
    ???
  }

  def namesOfFilmsByDirectorWithLastName(directors: List[Director], lastName: String): List[String] = {
    ???
  }

  def nameOfEarliestFilmByDirectorWithLastName(directors: List[Director], lastName: String): Option[String] = {
    ???
  }

  def main(args: Array[String]): Unit = {
    import FilmData._

    // METHODS INVOLVING FLATMAP

    println("filmsByDirector")
    // println(filmsByDirector(nolan))
    // println(filmsByDirector(mcTiernan))
    // println(filmsByDirector(someGuy))

    println("namesOfFilmsByDirector")
    // println(namesOfFilmsByDirector(nolan))
    // println(namesOfFilmsByDirector(mcTiernan))
    // println(namesOfFilmsByDirector(someGuy))

    println("filmsByAllDirectors")
    // println(filmsByAllDirectors(List(nolan, mcTiernan)))
    // println(filmsByAllDirectors(List(eastwood, someGuy)))

    println("namesOfFilmsByAllDirectors")
    // println(namesOfFilmsByAllDirectors(List(nolan, mcTiernan)))
    // println(namesOfFilmsByAllDirectors(List(eastwood, someGuy)))

    println("tonightOnlyMessages")
    // println(tonightOnlyMessages(List(nolan, mcTiernan)))

    // METHODS INVOLVING OPTION

    println("directorWithLastName")
    // println(directorWithLastName(directors, "Nolan"))
    // println(directorWithLastName(directors, "Guy"))
    // println(directorWithLastName(directors, "DROP TABLE *;"))

    println("yearOfBirthOfDirectorWithLastName")
    // println(yearOfBirthOfDirectorWithLastName(directors, "Nolan"))
    // println(yearOfBirthOfDirectorWithLastName(directors, "Guy"))
    // println(yearOfBirthOfDirectorWithLastName(directors, "DROP TABLE *;"))

    println("filmsByDirectorWithLastName")
    // println(filmsByDirectorWithLastName(directors, "Nolan"))
    // println(filmsByDirectorWithLastName(directors, "Guy"))
    // println(filmsByDirectorWithLastName(directors, "DROP TABLE *;"))

    println("earliestFilmByDirectorWithLastName")
    // println(earliestFilmByDirectorWithLastName(directors, "Nolan"))
    // println(earliestFilmByDirectorWithLastName(directors, "Guy"))
    // println(earliestFilmByDirectorWithLastName(directors, "DROP TABLE *;"))

    println("namesOfFilmsByDirectorWithLastName")
    // println(namesOfFilmsByDirectorWithLastName(directors, "Nolan"))
    // println(namesOfFilmsByDirectorWithLastName(directors, "Guy"))
    // println(namesOfFilmsByDirectorWithLastName(directors, "DROP TABLE *;"))

    println("nameOfEarliestFilmByDirectorWithLastName")
    // println(nameOfEarliestFilmByDirectorWithLastName(directors, "Nolan"))
    // println(nameOfEarliestFilmByDirectorWithLastName(directors, "Guy"))
    // println(nameOfEarliestFilmByDirectorWithLastName(directors, "DROP TABLE *;"))
  }
}
