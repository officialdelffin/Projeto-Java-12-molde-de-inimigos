/* Projeto :  Molde de Inimigos


Este projeto foi desenvolvido para consolidar os conceitos de Arrays e ArraysList na liguagem de programação Java. Esse projeto consistem em uma fabrica de inimigos. Onde eu crio um molde de criar
inimigos e a cada inimigo criado eu devo adicionar o nome e o tipo do inimigo dentro de uma ArrayList e exibir a lista de inimigos na tela do terminal. */


import br.com.officialdelffin.Enemy.Enemy;
import br.com.officialdelffin.Enemy.FlyingEnemy;
import br.com.officialdelffin.Enemy.GroundEnemy;

import java.util.ArrayList;

// Classe principal de execução :
public class Main {


    // Metodo de execução principal do sistema :
    public static void main(  String[] args  ) {


        // ArraysLists :
        ArrayList<Enemy> enemyList = new ArrayList<>();


        // Criando os objetos dos inimigos :

        // Voadores:
        var dragon      = new FlyingEnemy();
        var giantEagle  = new FlyingEnemy();


        // Terrestres :
        var wolf     = new GroundEnemy();
        var goblins  = new GroundEnemy();


        // Adicionando inimigos na ArrayList :
        enemyList.add( dragon );
        enemyList.add( giantEagle );
        enemyList.add( wolf );
        enemyList.add( goblins );


        // Exibir lista de inimigos :
        System.out.println( enemyList );


    }


}