# Snakes and Ladders game(Low Level Design)
<h3>Rules of the game:</h3>
The board will have 100 cells numbered from 1 to 100.
<br>The game will have a six sided dice numbered from 1 to 6 and will always give a random number on rolling it.
<br>Each player has a piece which is initially kept outside the board (i.e., at position 0).
<br>when each player gets his turn he will roll a dice which gives a random number from 1 to 6 and based on the number he will move to the next_position.
<br>In between the cells there are snakes and ladders.
<br>Snake will have a head and tail and head is always have greater value than tail.
<br>Ladder will have a start and end position and start position will have low value than end.
<br>Whenever a player ends up at a position with the head of the snake, the player should go down to the position of the tail of that snake.
<br>Whenever a player ends up at a position with the start of the ladder, the player should go up to the position of the end of that ladder.
