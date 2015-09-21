This is PokeGit.

This project was designed not as an actual application, but as a way for me to practice gathering and storing information.
So it should really be named PokeGitMySQL.

To use, input database username, password, and url into the DatabaseConnect class, and set up some tables according to what is in pokemon_moves.sql and pokemon_pokes.sql. Download and add jsoup-1.8.3.jar and add that to your build path. I use that library to grab the data from the websites.

Or if you just want to use the sql data directly, go ahead and import it. 

The latest branch has basically rendered all the other packages and classes useless except for:
 - DatabaseConnect
 - GetPokeInfo
 - GetPokeMoves
 
I'll keep everything else in there, in case I want to retrieve the data for whatever reason. 