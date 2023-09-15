package ss10_dsa_list.service;

import ss10_dsa_list.model.Fruit;
import ss10_dsa_list.repository.FruitRepository;

import java.util.List;
import java.util.Scanner;

public class FruitService implements IFruitService {
    public static FruitRepository fruitRepository = new FruitRepository();
    static final Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        List<Fruit> fruitList =  fruitRepository.display();
        for(Fruit fruit : fruitList){
            System.out.println(fruit);
        }
    }

    @Override
    public void addFruit() {
        System.out.println("Vui lòng nhập hoa quả mà bạn muốn thêm:");
        System.out.print("Tên : ");
        String name = scanner.nextLine();
        System.out.print("Loại : ");
        String type = scanner.nextLine();
        System.out.print("Ngày sản xuất : ");
        String dom = scanner.nextLine();
        System.out.print("Ngày hết hạn : ");
        String exp = scanner.nextLine();
        System.out.print("Xuất xứ : ");
        String origin = scanner.nextLine();
        System.out.print("Nhập giá vào đây : ");
        String price = scanner.nextLine();
        System.out.println("Thêm hoa quả thành công !");
        Fruit fruit = new Fruit(name,type,dom,exp,origin,price);
        fruitRepository.addFruit(fruit);
    }
}
