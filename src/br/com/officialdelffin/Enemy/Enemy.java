
// Pacotes:
package br.com.officialdelffin.Enemy;


// Classe abstrata dos inimigos :
abstract public class Enemy {


    // Atributos :

    private String name;
    private String tipo;
    private int life;
    private int attack;
    private int defense;


    // Metodos getters e Setters :

    // Metodos Getters :

    public String getName() {


        return name;


    }


    public String getTipo() {


        return tipo;


    }


    public int getLife() {


        return life;


    }


    public int getAttack() {


        return attack;


    }


    public int getDefense() {


        return defense;


    }


    // Metodos Setters :

    public void setName( String name ) {


        this.name = name;


    }


    public void setTipo( String tipo ) {


        this.tipo = tipo;


    }


    public void setLife( int life ) {


        this.life = life;


    }


    public void setAttack( int attack ) {


        this.attack = attack;


    }


    public void setDefense( int defense ) {


        this.defense = defense;


    }


    // Metodos de execução :

    // O inimigo faz o ataque :
    public void attacka () {


        System.out.println( this.getName() + " efetuou o ataque " );


    }


    // Usa porção de cura :
    public void usesHealingPotion () {


        System.out.println( this.getName() + " usou porção de cura" );


    }




}
