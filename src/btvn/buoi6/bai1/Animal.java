package btvn.buoi6.bai1;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }



    // Phương thức trừu tượng để mô tả hành động đặc trưng của động vật
    public abstract void action();

    // Phương thức hiển thị thông tin chi tiết về động vật
    public void showInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
}
