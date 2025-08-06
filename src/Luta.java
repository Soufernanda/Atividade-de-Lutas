import java.sql.SQLOutput;
import java.util.Random;

public class Luta {
        private Lutador desafiado;
        private Lutador desafiante;
        private  int rounds;
        private boolean aprovada;

        public void marcarLuta(Lutador l1, Lutador l2){
            if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
                this.desafiado = l1;
                this.desafiante = l2;
                this.aprovada = true;
            } else {
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
            }
        }

        public void setDesafiado(Lutador l){
            this.desafiado = l;
        }
        public Lutador getDesafiado(){
            return this.desafiado;
        }

        public void setDesafiante(Lutador l){
            this.desafiante = l;
        }
        public Lutador getDesafiante(){
            return this.desafiante;
        }

        public void lutar() {
            if (this.aprovada) {
                System.out.println("##Desafiado##");
                this.desafiado.apresentar();
                System.out.println("##Desafiante##");
                this.desafiante.apresentar();
                Random aleatorio = new Random();
                int vencedor= aleatorio.nextInt(3);
                System.out.println("======================");
                System.out.println("Vencedor: "+vencedor);
                switch (vencedor) {
                    case 0:
                        System.out.println("Empatou!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("Vitória do "+this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2:
                        System.out.println("Vitória do "+this.desafiante.getNome());
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;
                }
            } else {
                System.out.println("A Luta não pode acontecer");
            }
        }


    }

