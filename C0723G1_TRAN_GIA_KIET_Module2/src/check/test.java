//package check;
//
//package ss14_sort.repository;
//
//import ss14_sort.model.Work;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class WorkRepo implements IWorkRepo {
//    private static List<Work> workList = new ArrayList<>();
//
//    static {
//        workList.add(new Work("1", "Nuoi ca", LocalDate.parse("14/04/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 30000, "asdsad"));
//        workList.add(new Work("2", "Trong Rau", LocalDate.parse("05/08/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 450000, "fsgfdsgfd"));
//        workList.add(new Work("3", "Kinh Doanh", LocalDate.parse("10/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 365420, "werew"));
//    }
//
//    @Override
//    public List<Work> getAll() {
//        return workList;
//    }
//
//    @Override
//    public int checkId(String id) {
//        int index = workList.indexOf(new Work(id));
//        return index;
//    }
//
//    @Override
//    public void add(Work work) {
//        workList.add(work);
//    }
//
//    @Override
//    public void remove(String id) {
//        workList.remove(checkId(id));
//    }
//
//    @Override
//    public void edit(String id, Work work) {
//        int index = checkId(id);
//        workList.set(index, work);
//    }
//
//
//    @Override
//    public Work searchToId(String id) {
//        int index = checkId(id);
//        return workList.get(index);
//    }
//
//    @Override
//    public List<Work> searchToName(String name) {
//        List<Work> workToName = new ArrayList<>();
//        for (Work work : workList) {
//            if (work.getName().contains(name)) {
//                workToName.add(work);
//            }
//        }
//        return workToName;
//    }
//
//    @Override
//    public List<Work> sortToName() {
//        List<Work> works = getAll();
//        Collections.sort(
//                works, new Comparator<Work>() {
//                    @Override
//                    public int compare(Work o1, Work o2) {
//                        return o1.getName().compareTo(o2.getName());
//                    }
//                }
//        );
//        return works;
//    }
//
//    @Override
//    public List<Work> sortToMoney() {
//        List<Work> works = getAll();
//        Collections.sort(works, new Comparator<Work>() {
//            @Override
//            public int compare(Work o1, Work o2) {
//                if (o1.getMoney() == o2.getMoney()) {
//                    return o1.getName().compareTo(o2.getName());
//                } else {
//                    if (o1.getMoney() > o2.getMoney()) {
//                        return 1;
//                    } else {
//                        return -1;
//                    }
//                }
//            }
//        });
//        return works;
//    }
//}
//
//
