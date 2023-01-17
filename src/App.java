public class App {
    public static void main(String[] args) throws Exception {
        String[] frutas1 = new String[] { "Banana", "Maça", "Melão", "Morango" };
        String[] frutas2 = new String[] { "Goiaba", "Abacate", "Mogo", "Melancia" };

        for(int i=0; i<frutas1.length; i++) { 
            for(int j=0; j<frutas2.length; j++) { 
                if(frutas2[j].contains(frutas1[i])) { 
                    System.out.println(frutas1[i]);
                    return;
                }
            }
        }

        System.out.println("Nenhuma se repete");
    }
}
