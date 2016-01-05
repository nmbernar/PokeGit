This is PokeGit. This was originally designed to practice some webscraping with Java, but I figured since I have the data, might as well do something with it.

The front end web stuff hasn't been developed yet, so this project isn't really usuable at the moment.

To use, input database username, password, and url into the DatabaseConnect class, and run the latest sql file in the sql folder. The files are dated in the format mm/dd/yyyy, so be sure to run the latest one.

The folders are grouped as follows:

- base
  - This is where the controllers live, as well as the base database class.
- exceptions
  - This is where the exceptions live.
- objects
  - This is where the entities live. Entity such as a single Pokemon (denoted by the Pokemon class) or multiple Pokemon (denoted by the PokemonTeam class) are here.
- scrapers
  - These are the scrapers that I used to get the bulk of my data. I don't use them anymore since I have all the data I need. (And because pokemondb doesn't like it when you scrape from their website)
- unittests
  - These are my unit tests. They are all functional except for the ones that I don't expect to use anytime soon. 

If you just want the data about Pokemon, feel free to just grab the dataset file. 