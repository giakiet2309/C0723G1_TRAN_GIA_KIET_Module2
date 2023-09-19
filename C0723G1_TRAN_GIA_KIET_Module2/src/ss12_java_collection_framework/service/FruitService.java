package ss12_java_collection_framework.service;

import ss12_java_collection_framework.model.Fruit;
import ss12_java_collection_framework.repository.FruitRepository;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FruitService implements IFruitService {
    public static FruitRepository fruitRepository = new FruitRepository();
    static final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Map<String, Fruit> fruitMap = fruitRepository.display();
//        keySet();
//        for (String key : fruitMap.keySet()) {
//            System.out.println(key + "-" + fruitMap.get(key));
//        }
//        entrySet();
        for (Map.Entry<String, Fruit> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    @Override
    public void addFruit() {
        String key;
        do {
            System.out.println("Nhập key");
            key = scanner.nextLine();
            if (fruitRepository.checkKey(key)) {
                System.out.println("Key " + key + " đã tồn tại");
            } else {
                break;
            }
        } while (true);
        System.out.println("Vui lòng nhập hoa quả mà bạn muốn thêm:");
        System.out.println("Tên : ");
        String name = scanner.nextLine();
        System.out.println("Loại : ");
        String type = scanner.nextLine();
        System.out.println("Ngày sản xuất : ");
        String dom = scanner.nextLine();
        System.out.println("Ngày hết hạn : ");
        String exp = scanner.nextLine();
        System.out.println("Xuất xứ : ");
        String origin = scanner.nextLine();
        System.out.println("Nhập giá vào đây : ");
        String price = scanner.nextLine();
        System.out.println("Thêm hoa quả thành công !");
        Fruit fruit = new Fruit(name, type, dom, exp, origin, price);
        fruitRepository.addFruit(key, fruit);
    }

    @Override
    public void delFruit() {
        String key;
        do {
            System.out.println("Nhập key muốn xóa");
            key = scanner.nextLine();
            if (!fruitRepository.checkKey(key)) {
                System.out.println("Key " + key + " không tồn tại");
            } else {
                fruitRepository.removeFruit(key);
                System.out.println("Xóa thành công");
                break;
            }
        } while (!fruitRepository.checkKey(key));
    }

    @Override
    public void editFruit() {
        String key;
        do {
            System.out.println("Nhập key muốn sửa : ");
            key = scanner.nextLine();
            if (!fruitRepository.checkKey(key)) {
                System.out.println("Key " + key + " không tồn tại");
            } else {
                System.out.println("Nhập tên hoa quả");
                String newName = scanner.nextLine();
                System.out.println("Nhập loại trái cây : ");
                String newType = scanner.nextLine();
                System.out.println("Nhập ngày sản xuất : ");
                String dom = scanner.nextLine();
                System.out.println("Ngày hết hạn : ");
                String exp = scanner.nextLine();
                System.out.println("Xuất xứ : ");
                String origin = scanner.nextLine();
                System.out.println("Nhập giá vào đây : ");
                String price = scanner.nextLine();
                System.out.println("Sửa hoa quả thành công !");
                Fruit fruit = new Fruit(newName,newType,dom,exp,origin,price);
                fruitRepository.editFruit(key,fruit);
            }
        } while (!fruitRepository.checkKey(key));
    }
}
