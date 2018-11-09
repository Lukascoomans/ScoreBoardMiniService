package hello;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.Scanner;
        import java.util.concurrent.atomic.AtomicLong;

        import org.springframework.web.bind.annotation.*;
        import sun.reflect.generics.scope.Scope;

@RestController
public class PacManController {

    private ArrayList<Score> scoreList = new ArrayList<Score>(){{
        add(new Score("Lukas","32","Belgium","2"));
        add(new Score("Lion","33","Belgium","1"));
        add(new Score("Ahmet","11","Belgium","3"));
        add(new Score("Sergey","32","Belgium","4"));
    }};


    @RequestMapping(value = "/PacMan", method = RequestMethod.GET, produces = "application/json")
    public ArrayList<Score> GetScores() {
        Collections.sort(scoreList,new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2) {
                return -Integer.compare(Integer.parseInt(s1.getPoints()),Integer.parseInt(s2.getPoints()));
            }
        });

        int i =1;
        for (Score lilscore :scoreList ) {
            lilscore.setPosition(""+i++);
        }

        return scoreList;
    }

    @RequestMapping(value = "/PacMan", method = RequestMethod.POST, produces = "application/json")
    public Score PostScore(@RequestBody Score score){
        scoreList.add(score);

        return score;
    }
}
