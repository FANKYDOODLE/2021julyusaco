
/*
 * Develop the Connect4 game.
 */
import java.util.Scanner;
public class Connect4 {
	public static void main(String[] args) {
		int n = 6; // # of rows
		int m = 7; // # of columns
		int[][] board = new int[n][m];
		int currentPlayer = 1;
		Scanner kb = new Scanner(System.in);

		while (true) {
			printBoard(board);
			System.out.print("Player: " + currentPlayer + "\tColumn: ");
			int col = kb.nextInt() - 1; // column index 0-based

			if (col < 0 || col >= m) {
				System.out.println("Invalid move.");
				continue; // skip the rest of the current iteration
			}

			// add a piece to column "col"
			int r = n - 1;
			while (r >= 0 && board[r][col] != 0) {
				r--;
			}

			if (r < 0) {
				System.out.println("Invalid move.");
				continue;
			}

			// add a piece to the board at (r, col)
			board[r][col] = currentPlayer;
			printBoard(board);
			int st = checkStatus(board);
			System.out.println();
			if (st == 1) {
				System.out.println("Player 1 wins!");
				break;
			} else if (st == 2) {
				System.out.println("Player 2 wins!");
				break;
			} else if (st == 3) {
				System.out.println("Game is tied.");
				break;
			} else {
				currentPlayer = 3 - currentPlayer;
			}
		}

		kb.close();
	}

	static void printBoard(int[][] board) {
		System.out.println();
		for (int r = 0; r < board.length; r++) {
			System.out.print("|");
			for (int c = 0; c < board[r].length; c++) {
				if (board[r][c] != 0) {
					System.out.print(" " + board[r][c] + " |");
				}
				else {
					System.out.print("   |");
				}
			}
			System.out.println();
		}
	}

	// 1 = player1 wins; 2 = player2 wins; 3 = tied; 0 = game continues
	static int checkStatus(int[][] board) {
		int n = board.length;
		int m = board[0].length;

		boolean isBoardFull = true;
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				if (board[r][c] != 0) {
					// check the 4 pieces on 8 directions
					// Only check the 4 directions: east, southeast, south, southwest

					// east direction
					if (c + 3 < m && board[r][c + 1] == board[r][c] && board[r][c + 2] == board[r][c]
							&& board[r][c + 3] == board[r][c]) {
						return board[r][c];
					}

					// southeast direction
					if (r + 3 < n && c + 3 < m && board[r + 1][c + 1] == board[r][c]
							&& board[r + 2][c + 2] == board[r][c] && board[r + 3][c + 3] == board[r][c]) {
						return board[r][c];
					}

					// south direction
					if (r + 3 < n && board[r + 1][c] == board[r][c] && board[r + 2][c] == board[r][c]
							&& board[r + 3][c] == board[r][c]) {
						return board[r][c];
					}

					// southwest direction
					if (r + 3 < n && c - 3 >= 0 && board[r + 1][c - 1] == board[r][c]
							&& board[r + 2][c - 2] == board[r][c] && board[r + 3][c - 3] == board[r][c]) {
						return board[r][c];
					}
				} else { // at least one place is still available --> board is NOT full
					isBoardFull = false;
				}
			}
		}

		if (isBoardFull) {
			return 3; // game is tied
		} else {
			return 0; // game is to be continued
		}
	}
}