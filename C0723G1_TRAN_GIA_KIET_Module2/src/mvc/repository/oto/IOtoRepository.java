package mvc.repository.oto;

import mvc.model.Oto;
import mvc.model.Truck;

import java.util.List;

public interface IOtoRepository {
    void addOto(Oto oto);

    List<Oto> showOto();

    boolean delOto(int id);

    Oto searchOto(int id);
}
