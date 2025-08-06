//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lutador l[]= new Lutador[6];
        l[0]= new Lutador("Javeiro", "França", 31 , 76.9f, 1.66f, 11,2, 1);
        l[1]= new Lutador("Rubyson", "Russia", 29, 100.0f, 1.90f, 12,2,1 );
        l[2]= new Lutador("Cxarpino", "Brasil", 35, 95.8f, 1.65f, 13,0,2);
        l[3]= new Lutador("PHPin", "China", 37, 75.6f, 1.70f, 14,0,3);
        l[4]= new Lutador("Pascalino", "EUA", 30, 81.6f, 1.85f, 15,0,4);
        l[5]= new Lutador("Javascritpson","ITALIA",35,81.9f,1.70f,16,0,5);
        Luta UEC01= new Luta();
        UEC01.marcarLuta(l[2], l[1]);
        UEC01.lutar();
    }

}