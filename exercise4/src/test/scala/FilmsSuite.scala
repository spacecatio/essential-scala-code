import Films._
import FilmData._

class FilmsSuite extends munit.FunSuite {
  implicit val directorOrder: Ordering[Director] =
    Ordering.by(_.lastName)

  implicit val filmOrder: Ordering[Film] =
    Ordering.by(_.name)

  // test("nameOfFilm") {
  //   assertEquals(nameOfFilm(memento), memento.name)
  //   assertEquals(nameOfFilm(darkKnight), darkKnight.name)
  // }

  // test("filmsByDirector") {
  //   assertEquals(nolan.films.sorted, filmsByDirector(nolan).sorted)
  //   assertEquals(eastwood.films.sorted, filmsByDirector(eastwood).sorted)
  // }

  // test("namesOfFilms") {
  //   assertEquals(namesOfFilms(List(memento, darkKnight)).sorted, List(memento.name, darkKnight.name).sorted)
  //   assertEquals(namesOfFilms(Nil), Nil)
  // }

  // test("namesOfFilmsByDirector") {
  //   assertEquals(namesOfFilmsByDirector(nolan).sorted, nolan.films.map(_.name).sorted)
  //   assertEquals(namesOfFilmsByDirector(eastwood).sorted, eastwood.films.map(_.name).sorted)
  //   assertEquals(namesOfFilmsByDirector(someGuy), Nil)
  // }

  // test("directorsWithBackCatalogOfSize") {
  //   assertEquals(directorsWithBackCatalogOfSize(directors, 1).sorted, List(eastwood, mcTiernan, nolan).sorted)
  //   assertEquals(directorsWithBackCatalogOfSize(directors, 4).sorted, List(eastwood, mcTiernan).sorted)
  //   assertEquals(directorsWithBackCatalogOfSize(directors, 5).sorted, List(eastwood).sorted)
  //   assertEquals(directorsWithBackCatalogOfSize(Nil, 1), Nil)
  // }

  // test("directorsBornBefore") {
  //   assertEquals(directorsBornBefore(directors, 1930), Nil)
  //   assertEquals(directorsBornBefore(directors, 1931).sorted, List(eastwood).sorted)
  //   assertEquals(directorsBornBefore(directors, 1951).sorted, List(eastwood).sorted)
  //   assertEquals(directorsBornBefore(directors, 1952).sorted, List(eastwood, mcTiernan).sorted)
  //   assertEquals(directorsBornBefore(Nil, 2000), Nil)
  // }

  // test("directorsBornBeforeWithBackCatalogOfSize") {
  //   assertEquals(directorsBornBeforeWithBackCatalogOfSize(directors, 1931, 5).sorted, List(eastwood).sorted)
  //   assertEquals(directorsBornBeforeWithBackCatalogOfSize(directors, 1931, 6), Nil)
  //   assertEquals(directorsBornBeforeWithBackCatalogOfSize(directors, 1930, 5), Nil)
  //   assertEquals(directorsBornBeforeWithBackCatalogOfSize(Nil, 2000, 1), Nil)
  // }

  // test("filmsByAllDirectors") {
  //   assertEquals(
  //     filmsByAllDirectors(List(nolan, mcTiernan)).sorted,
  //     (nolan.films ++ mcTiernan.films).sorted
  //   )
  //   assertEquals(
  //     filmsByAllDirectors(List(eastwood, someGuy)).sorted,
  //     eastwood.films.sorted
  //   )
  // }

  // test("namesOfFilmsByAllDirectors") {
  //   assertEquals(
  //     namesOfFilmsByAllDirectors(List(nolan, mcTiernan)).sorted,
  //     (nolan.films ++ mcTiernan.films).map(f => f.name).sorted
  //   )
  //   assertEquals(
  //     namesOfFilmsByAllDirectors(List(eastwood, someGuy)).sorted,
  //     eastwood.films.map(f => f.name).sorted
  //   )
  // }

  // test("tonightOnlyMessages") {
  //   assertEquals(
  //     tonightOnlyMessages(List(nolan, mcTiernan)).sorted,
  //     List(
  //       "Tonight only! Memento by Christopher Nolan!",
  //       "Tonight only! Dark Knight by Christopher Nolan!",
  //       "Tonight only! Inception by Christopher Nolan!",
  //       "Tonight only! Predator by John McTiernan!",
  //       "Tonight only! Die Hard by John McTiernan!",
  //       "Tonight only! The Hunt for Red October by John McTiernan!",
  //       "Tonight only! The Thomas Crown Affair by John McTiernan!"
  //     ).sorted
  //   )
  // }

  // test("namesOfFilmsByDirectorScoringAtLeast") {
  //   assertEquals(namesOfFilmsByDirectorScoringAtLeast(nolan, 8.8).sorted, List(darkKnight.name, inception.name).sorted)
  //   assertEquals(namesOfFilmsByDirectorScoringAtLeast(nolan, 8.9).sorted, List(darkKnight.name).sorted)
  //   assertEquals(namesOfFilmsByDirectorScoringAtLeast(someGuy, 0.0), Nil)
  // }

  // test("namesOfAllFilmsScoringAtLeast") {
  //   assertEquals(namesOfAllFilmsScoringAtLeast(List(nolan, mcTiernan), 8.8).sorted, List(darkKnight.name, inception.name).sorted)
  //   assertEquals(namesOfAllFilmsScoringAtLeast(List(someGuy), 0.0), Nil)
  // }

  // test("filmsSortedByImdb") {
  //   assertEquals(
  //     filmsSortedByImdb(nolan.films).sorted,
  //     List(memento, inception, darkKnight).sorted
  //   )
  //   assertEquals(
  //     filmsSortedByImdb(eastwood.films).sorted,
  //     List(invictus, highPlainsDrifter, outlawJoseyWales, granTorino, unforgiven).sorted
  //   )
  // }

  // test("filmsByDirectorSortedByImdb") {
  //   assertEquals(
  //     filmsByDirectorSortedByImdb(nolan).sorted,
  //     List(memento, inception, darkKnight).sorted
  //   )
  //   assertEquals(
  //     filmsByDirectorSortedByImdb(eastwood).sorted,
  //     List(invictus, highPlainsDrifter, outlawJoseyWales, granTorino, unforgiven).sorted
  //   )
  // }

  // test("filmsByAllDirectorsSortedByImdb") {
  //   assertEquals(
  //     filmsByAllDirectorsSortedByImdb(List(nolan, mcTiernan)).sorted,
  //     List(
  //       thomasCrownAffair,
  //       huntForRedOctober,
  //       predator,
  //       dieHard,
  //       memento,
  //       inception,
  //       darkKnight
  //     ).sorted
  //   )
  // }

  // test("filmsByAllDirectorsSortedByDirectorNameThenImdb") {
  //   assertEquals(
  //     filmsByAllDirectorsSortedByDirectorNameThenImdb(List(nolan, mcTiernan)).sorted,
  //     List(
  //       memento,
  //       inception,
  //       darkKnight,
  //       thomasCrownAffair,
  //       huntForRedOctober,
  //       predator,
  //       dieHard
  //     ).sorted
  //   )
  // }

  // test("averageImdbRating") {
  //   assert {
  //     val actual = averageImdbRating(nolan.films)
  //     val expected = 8.766
  //     actual >= expected - 0.001 && actual <= expected + 0.001
  //   }
  //   assert(averageImdbRating(someGuy.films).isNaN)
  // }

  // test("averageImdbRatingAcrossDirectors") {
  //   assert {
  //     val actual = averageImdbRatingAcrossDirectors(directors)
  //     val expected = 8.033
  //     actual >= expected - 0.001 && actual <= expected + 0.001
  //   }
  // }
}
