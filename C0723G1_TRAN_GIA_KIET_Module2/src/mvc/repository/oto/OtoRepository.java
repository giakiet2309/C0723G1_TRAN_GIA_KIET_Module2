package mvc.repository.oto;

import mvc.model.Oto;
import mvc.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IOtoRepository{
    private static List<Oto> otoList = new ArrayList<>();
    static {
        otoList.add(new Oto(1,"Bugati","2000",
                "Long","24","du lịch"));
        otoList.add(new Oto(2,"Bugatii","2001",
                "Alex","4","Xe khách"));
    }
    @Override
    public void addOto(Oto oto) {
        otoList.add(oto);
    }

    @Override
    public List<Oto> showOto() {
        return otoList;
    }

    @Override
    public boolean delOto(int id) {
        for(Oto oto : otoList){
            if(oto.getNumberPlate()==id){
                otoList.remove(oto);
                return true;
            }
        }
        return false;
    }

    @Override
    public Oto searchOto(int id) {
        for(Oto oto : otoList){
            if(oto.getNumberPlate()==id){
                return oto;
            }
        }
        return null;
    }
    public boolean checkIdOto(int id) {
        for (Oto oto : otoList) {
            if (oto.getNumberPlate() == id) {
                return true;
            }
        }
        return false;
    }

}
