
// Pacostes :
package br.com.officialdelffin.Enemy;


// Classe dos Inimigos Voadores :
public class FlyingEnemy extends Enemy {


    // Metodos

    // Sobreescrevendo metodo de ataque para o inimigo Voador :
    @Override
    public void attacks() {


        System.out.println( this.getName() + " Atacou o adiversário voando" );


    }
}
