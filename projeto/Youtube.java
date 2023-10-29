package video.curso.projeto;

public class Youtube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, 'M',"Juba");
        g[1] = new Gafanhoto("Maria", 18,'F',"Zinha");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[2] = new Visualizacao(g[1], v[0]);
        vis[3] = new Visualizacao(g[1], v[1]);
        vis[4] = new Visualizacao(g[1], v[2]);

        vis[0].avaliar();
        vis[1].avaliar(95.5f);
        vis[2].avaliar(10);
        vis[3].avaliar();
        vis[4].avaliar(69.3f);



        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());
        System.out.println(vis[3].toString());
        System.out.println(vis[4].toString());

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

    }
}
