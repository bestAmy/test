package exercise.laptop;

public interface USB {
    public default void openEquipment(){
        System.out.println("打开设备");
    }
    public default void closeEquipment(){
        System.out.println("关闭设备");
    }
    public void use();
}
