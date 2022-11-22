import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinguagemFavoritaMain {

    public static void main(String[] args) {


    Set<LinguagemFavorita> minhasFavoritas = new HashSet<>() {{

        add (new LinguagemFavorita("Java", "NetBeans", 1991));
        add (new LinguagemFavorita("Dart", "VisualStudioCode", 2011));
        add (new LinguagemFavorita("Kotlin", "Intellij", 2011));



    }};

    for ( LinguagemFavorita LinguagemFavorita : minhasFavoritas) {

         System.out.println(LinguagemFavorita.getNome() + " - " + LinguagemFavorita.getIde() + " - " + LinguagemFavorita.getAnoDeCriacao());


    }
    


    Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>() {{

        add (new LinguagemFavorita("Java", "NetBeans", 1991));
        add (new LinguagemFavorita("Dart", "VisualStudioCode", 2011));
        add (new LinguagemFavorita("Kotlin", "Intellij", 2011));



    }};

    for ( LinguagemFavorita LinguagemFavorita : minhasLinguagens) {

         System.out.println(LinguagemFavorita.getNome() + " - " + LinguagemFavorita.getIde() + " - " + LinguagemFavorita.getAnoDeCriacao());



        }


        

        
    }

    
    

}
