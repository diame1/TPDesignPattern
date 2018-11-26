package visiteur;
import java.util.Iterator;

public class VisitNbPhotos implements Visiteur {

    protected int nb;

    public void visitElement(Photo p){

    }

    @Override
    public void visitElement(Album a) {

        Iterator i= a.iterator();



    }
}
