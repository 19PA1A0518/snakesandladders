# Snakes and Ladders game(Low Level Design)
Rules of the game:
The board will have 100 cells numbered from 1 to 100.
The game will have a six sided dice numbered from 1 to 6 and will always give a random number on rolling it.

Each player has a piece which is initially kept outside the board (i.e., at position 0).

when each player gets his turn he will roll a dice which gives a random number from 1 to 6 and based on the number he will move to the next_position.

In between the cells there are snakes and ladders.

Snake will have a head and tail and head is always have greater value than tail.

Ladder will have a start and end position and start position will have low value than end.

Whenever a player ends up at a position with the head of the snake, the player should go down to the position of the tail of that snake.

Whenever a player ends up at a position with the start of the ladder, the player should go up to the position of the end of that ladder.
