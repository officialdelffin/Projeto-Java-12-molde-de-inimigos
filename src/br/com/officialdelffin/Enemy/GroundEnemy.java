
// Pacotes :
package br.com.officialdelffin.Enemy;


// Classe dos Inimigos Terrestres:
public class GroundEnemy extends Enemy {


    // Metodos

    // Sobreescrevendo metodo de ataque para o inimigo terrestre :
    @Override
    public void attacks() {


        System.out.println( this.getName() + " correu e atacou o adversário" );


    }


}
