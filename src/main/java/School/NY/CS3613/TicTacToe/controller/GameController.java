package School.NY.CS3613.TicTacToe.controller;


import School.NY.CS3613.TicTacToe.gamelogic.Winner;
import School.NY.CS3613.TicTacToe.model.WinnerStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    @GetMapping("/tictactoe")

    public WinnerStatus getWinner(@RequestParam String moves){
        return new Winner().getWinnerStatus(moves);

    }

}
