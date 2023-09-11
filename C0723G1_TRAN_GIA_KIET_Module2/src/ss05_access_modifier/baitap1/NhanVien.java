package ss05_access_modifier.baitap1;

public class NhanVien {
    private String name;
    //khai báo name chỉ có phạm vị trong class

    private String telephone;
    //khai báo telephone chỉ có phạm vị trong class

    private String workingParts;
    //khai báo workingParts chỉ có phạm vị trong class

    private String corporationName;
    //khai báo corporationName chỉ có phạm vị trong class

    public NhanVien() {
    }


    public NhanVien(String name, String telephone, String workingParts, String corporationName) {
        this.name = name;
        this.telephone = telephone;
        this.workingParts = workingParts;
        this.corporationName = corporationName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public String getCompanyName() {
        return corporationName;
    }

    public void setCompanyName(String companyName) {
        this.corporationName = companyName;
    }

    public static void said() {
        System.out.println("Alo Alo ");
    }
    // tiết kiệm vùng nhớ
    // được truy cập trực tiếp thông qua lớp mà không cần khởi tạo đối tượng

}
